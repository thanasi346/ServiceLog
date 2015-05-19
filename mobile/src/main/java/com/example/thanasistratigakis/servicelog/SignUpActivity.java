package com.example.thanasistratigakis.servicelog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ThanasiStratigakis on 5/18/15.
 */
public class SignUpActivity extends Activity {

    private EditText usernameView;
    private EditText passwordView;
    private EditText passwordReView;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_signup);

        // Set up the signUp form.
        usernameView = (EditText) findViewById(R.id.txtUsername);
        passwordView = (EditText) findViewById(R.id.txtPassword);
        passwordReView = (EditText) findViewById(R.id.txtPasswordRe);


        // Set up the submit button click handler
        findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validate the Sign up data
                boolean validationError = false;
                StringBuilder validationErrorMessage = new StringBuilder("Please "); //Begin the validation error message
                if (isEmpty(usernameView)) {
                    validationError = true;
                    validationErrorMessage.append("enter a username");
                }
                if (isEmpty(passwordView)) {
                    if (validationError){
                        validationErrorMessage.append(", and ");
                    }
                    validationError = true;
                    validationErrorMessage.append("enter a password");
                }
                if (!isMatching(passwordView, passwordReView)) {
                    if (validationError) {
                        validationErrorMessage.append(", and ");
                    }
                    validationError = true;
                    validationErrorMessage.append("enter the same password twice");
                }
                validationErrorMessage.append(".");




            }
        });



    }

    // checks if the text is > 0
    private boolean isEmpty (EditText etText) {
        // gets text, makes it a string, takes out spaces, gets length
        if (etText.getText().toString().trim().length() > 0) {
            return false;
        } else {
            return true;
        }
    }

    // checks if two strings match (for password and re-password)
    private boolean isMatching (EditText etText1, EditText etText2) {
        if (etText1.getText().toString().equals(etText2.getText().toString())){
            return true;
        } else {
            return false;
        }
    }














}
