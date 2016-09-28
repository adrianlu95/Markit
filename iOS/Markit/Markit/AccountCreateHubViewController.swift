//
//  AccountCreateHubViewController.swift
//  Markit
//
//  Created by Victor Frolov on 9/27/16.
//  Copyright © 2016 Victor Frolov. All rights reserved.
//

import UIKit
import Firebase
import FirebaseAuth

class AccountCreateHubViewController: UIViewController {
    var ref: FIRDatabaseReference!
    @IBOutlet weak var hub:UITextField!
    @IBOutlet weak var username: UITextField!
    @IBOutlet weak var markedHub:UIImageView!
    @IBOutlet weak var markedUsername: UIImageView!
    
    @IBOutlet weak var badUsername: UILabel!
    
    var userInfo: [String]!
    
    @IBAction func finishSignup(_ sender: AnyObject) {
        if !markedHub.isHidden && !markedUsername.isHidden {
            badUsername.isHidden = true
            FIRAuth.auth()?.createUser(
                withEmail: "blarf@lmu.edu", password: "harfdarf") { (user, error) in
                NSLog(String(format: "Successfully created user: %@", "blarf@lmu.edu"))
            }
        }
    }

    override func viewDidLoad() {
        super.viewDidLoad()
        self.ref = FIRDatabase.database().reference()
        markedHub.isHidden = true
        markedUsername.isHidden = true
        badUsername.isHidden = true
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    override func viewDidAppear(_ animated: Bool) {
        username.becomeFirstResponder()
    }
    
    func isValidUsername(testStr:String) -> Bool {
        let usernameRegEx = "[A-Z0-9a-z]+"
        let usernameTest = NSPredicate(format:"SELF MATCHES %@", usernameRegEx)
        return usernameTest.evaluate(with: testStr)
    }
    
    func textViewDidChange(textView: UITextView) {
        
        if username.text!.characters.count > 2 {
            let namesRef = ref.child("/usernames")

            namesRef.observeSingleEvent(of: FIRDataEventType.value, with: {
                snap in
                
                if !self.isValidUsername(testStr: self.username.text!) {
                    self.badUsername.text = "Sorry, only letters and numbers allowed"
                    self.badUsername.isHidden = false
                    self.markedUsername.isHidden = true
                } else if snap.hasChild(self.username.text!.lowercased()) {
                    print("name exists")
                    self.badUsername.text = "Sorry, that username is taken :("
                    self.badUsername.isHidden = false
                    self.markedUsername.isHidden = true
                } else {
                    print("name does not exist!")
                    self.badUsername.isHidden = true
                    self.markedUsername.isHidden = false
                }
            })
        }
        //actually set up the hub selectin feature later
        //for now it's a dumby number of 5
        let dumbyFakeApproval = 2
        markedHub.isHidden = hub.text!.characters.count >= dumbyFakeApproval ? false : true
    }

    override func viewDidLayoutSubviews() {
        hub.addTarget(self, action: #selector(self.textViewDidChange), for: .editingChanged)
        username.addTarget(self, action: #selector(self.textViewDidChange), for: .editingChanged)
        //only display a bottom-border for the UITextView
        let bottomLine = CALayer()
        bottomLine.frame = CGRect(origin: CGPoint(x: 0, y:hub.frame.height - 1), size: CGSize(width: hub.frame.width, height:  1))
        bottomLine.backgroundColor = UIColor.white.cgColor
        hub.borderStyle = UITextBorderStyle.none
        hub.layer.addSublayer(bottomLine)
        
        //same for username
        let bottomLineTwo = CALayer()
        bottomLineTwo.frame = CGRect(origin: CGPoint(x: 0, y:username.frame.height - 1), size: CGSize(width: username.frame.width, height:  1))
        bottomLineTwo.backgroundColor = UIColor.white.cgColor
        username.borderStyle = UITextBorderStyle.none
        username.layer.addSublayer(bottomLineTwo)
    }
}