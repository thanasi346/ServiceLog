package com.example.thanasistratigakis.servicelog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;

/**
 * Created by ThanasiStratigakis on 5/18/15.
 */
public class SignUpOrLoginActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "bFlfAKQNEWDRvaNX7ikcJ0ZaSKbcKc6W98InH9Ie", "Idlc9KjBgLFvLakk2jUMBpUEfvUNZemux6tT10p9");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_or_login);


        // btnLog click handler (login button)
        ((Button) findViewById(R.id.btnLogin)).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(SignUpOrLoginActivity.this, LoginActivity.class));
            }
        });

        // btnNewAccount click handler (new account button)
        ((Button) findViewById(R.id.btnNewAccount)).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(SignUpOrLoginActivity.this, SignUpActivity.class));
            }
        });

    }

}
