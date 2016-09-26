$(function() {
    $('.carousel.carousel-slider').carousel({full_width: true});

    /**
        loading main data, slight timeOut so it 
        doesn't appear before the navbar does
    **/
    var loadMain = function () {
        $('main').fadeIn()
    }
    setTimeout(loadMain, 300);

    //pop up for login buttnon
    $('#login-popup').hide();
    $('#navbar-placeholder').on('click', '#login-button', function () {
        console.log("it worked")
        $('#login-popup').fadeIn();
    });
    
    $(document).mouseup(function (e) {
        var popup = $('#login-popup');
        if (popup.is(e.target)) {
            popup.fadeOut();
        }
    });

    //sign in:
    var signIn = function () {
        console.log("attempting sign in...");
        firebase.auth().signInWithEmailAndPassword($('#email').val(), $('#password').val()).catch(function(error) {
            // Handle Errors here.
            var errorCode = error.code;
            var errorMessage = error.message;
            // ...
        });
    }

   var createAccount = function () {
        firebase.auth().createUserWithEmailAndPassword($("#email").val(), $("#password").val()).catch(function(error) {
            // Handle Errors here.
            var errorCode = error.code;
            var errorMessage = error.message;
            // ...
        });
    }

    $('body').on('click', '#sign-in-button', function() {
        signIn();
    });

    $('body').on('click', '#create-account-button', function() {
        createAccount();
    });

});