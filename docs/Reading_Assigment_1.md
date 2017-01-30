# Homework 1 - Due 01/30/17 @ 6pm PST

**Problem 1.1**
:  What are the basic tasks that all software engineering projects must handle?
> Requirements gathering, high-level design, low-level design, development, testing, deployment, maintenance, and wrap-up

**Problem 1.2**
: Give a one sentence description of each of the tasks you listed in Exercise 1.
> * requirements gathering - Learn what the customer's needs are.
> * high-level design - Describe the major pieces of the software and how they will interact.
> * low-level design - Provide more detail about how to build the different parts of the software for the programmers to follow.
> * development - Program the software.
> * testing - Use the software in a wide range of possible use cases to work out bugs.
> * deployment - Distribute the software.
> * maintenance - Keep the software stable with bug fixes and improvements.
> * wrap-up - Figure out what went well and what could be improved in the future.

**Problem 2.4**
: Like Microsoft Word, Google Docs [sic] provides some simple change tracking tools. Go to http://www.google.com/docs/about/ to learn more and sign up [if you do not have an account already]. Then create a document, save it, close it, reopen it, and make changes to it as you did in Exercise 1.
> ![Google Docs Revision History](images/google_docs_pic.tiff)

**Problem 2.5, Stephens page 26**
: What does JBGE stand for and what does it mean?
> JBGE stands for Just Barely Good Enough, and it means that you should have as little code documentation and as few comments as possible. As the great Dr. Ray Toal once said, "Comments should only be used to say things that the code cannot."

**Problem 3.6**
: In addition to losing time from vacation and sick leave, projects can suffer from problems that just strike out of nowhere. Sort of a bad version of deus ex machina. For example, senior management could decide to switch your target platform from Windows desktop PSs to the latest smartwatch technology. Or a strike in the Far East could delay the shipment of your new servers. Or one of your developers might move to Iceland. How can you handle these sorts of completely unpredictable problems?
> While problems like these can never truly be 100% prepared for, you can always prepare emergency time blocks in your schedule, that can be dropped in and out in case of emergencies. Doing so can radically reduce the impact that unexpected incidents can have on the overall project.

**Problem 3.8**
: What are the two biggest mistakes you can make while tracking tasks?
> One of the biggest mistakes you can make is to not properly react when something is falling behind schedule, even if only slightly. Small delays add up to huge delays.

> The second biggest mistake you can make is to falsely believe that throwing more people at a problem will fix it faster. This is simply not the case, as new people assigned to a task will have to be brought up to speed on the current status, and will generally have to be somehow worked into the overall group dynamic.

**Problem 4.1**
: List five characteristics of good requirements.
> Clear, unambiguous, consistent, prioritized, verifiable.

**Problem 4.3**
: Suppose you want to build a program called TimeShifter to upload and download files at scheduled times while you're on vacation. The following list shows some of the applications requirements.

  * Allow users to monitor uploads/downloads while away from the office. <br>
    **Answer:** Business
  * Let the user specify website log-in parameters such as an Internet address, a port, a username, and a password. <br>
    **Answer:** Functional & User
  * Let the user specify upload/download parameters such a number of retries if there's a problem. <br>
    **Answer:** Functional & User
  * Let the user select an Internet location, a local file, and a time to perform the upload/download. <br>
    **Answer:** Functional & User
  * Let the user schedule uploads/downloads at any time. <br>
    **Answer:** Nonfunctional
  * Allow uploads/downloads to run at any time. <br>
    **Answer:** Nonfunctional
  * Make uploads/downloads transfer at least 8 Mbps. <br>
    **Answer:** Nonfunctional
  * Run uploads/downloads sequentially. Two cannot run at the same time. <br>
    **Answer:** Nonfunctional
  * If an upload/download is scheduled for a time when another is in progress, it waits until the other one finishes. <br>
    **Answer:** Nonfunctional
  * Perform schedule uploads/downloads. <br>
    **Answer:** Functional
  * Keep a log of all attempted uploads/downloads and whether the succeeded. <br>
    **Answer:** Functional
  * Let the user empty the log. <br>
    **Answer:** Functional & User
  * Display reports of upload/download attempts. <br>
    **Answer:** Functional & User
  * Let the user view the log reports on a remote device such as a phone. <br>
    **Answer:** Functional & User
  * Send an e-mail to an administrator if an upload/download fails more than its maximum retry number of times. <br>
    **Answer:** Functional & User
  * Send a text message to an administrator if an upload/download fails more than it's maximum return number of times. <br>
    **Answer:** Functional & User

For this exercise, list the audience-oriented categories for each requirement. Are there requirements in each category? [If not, state why not…]
> All the categories include at least one requirement except for implementation requirements, which is empty. You might need to buy new hardware or network bandwidth to support the application, but you’re presumably performing uploads and downloads now, so you may already have everything you need. In that case, there are no implementation requirements.

**Problem 4.9**
: Figure 4-1 [right] shows the design for a simple hangman game that will run on smartphones. When you click the New Bame button, the program picks a random mystery word from a large list and starts a new game. Then if you click a letter, either the letter is filled in where it appears in the mystery word, or a new piece of Mr. Bones's skeleton appears. In either case, the letter you clicked is grayed out so that you don't pick it again. If you guess all the letters in the mystery word, the game displays a message that says, "Congratulations, you won!" If you build Mr. Bones's complete skeleton, a message says, "Sorry, you lost." Brainstorm this application and see if you can think of ways you might change it. Use the MOSCOW method to prioritize your changes.
> * Add advertisements to the game, or possibly consider charging for the app. (M)
> * Score should be kept, according to how many words the players are able to solve. Additionally, the highest few scores should be kept on a leaderboard. (Should have)
> * Allow users to try and solve for the word instead of having to guess each letter. (Should have)
> * Allow users to choose different difficulty levels, with longer/shorter words accordingly. (Could have)
> * Background music and animations. (Won't have)
