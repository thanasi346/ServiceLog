package com.example.thanasistratigakis.servicelog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

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

                // If there is a validation error, display the error
                if (validationError) {
                    Toast.makeText(SignUpActivity.this, validationErrorMessage.toString(), Toast.LENGTH_LONG).show();
                    return;
                }


                // Set up a progress dialog
                final ProgressDialog dlg = new ProgressDialog(SignUpActivity.this);
                dlg.setTitle("Please wait.");
                dlg.setMessage("Signing up. Please wait.");
                dlg.show();

                // Set up a new Parse user
                ParseUser user = new ParseUser();
                user.setUsername(usernameView.getText().toString());
                user.setPassword(passwordView.getText().toString());

                // Call the Parse signup method
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        dlg.dismiss();
                        if (e != null) {
                            // Show the error message
                            Toast.makeText(SignUpActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        } else {
                            // Start an intent for the dispatch activity
                            Intent intent = new Intent (SignUpActivity.this, DispatchActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }
                    }
                });
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
