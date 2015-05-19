package com.example.thanasistratigakis.servicelog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ThanasiStratigakis on 5/18/15.
 */
public class SignUpOrLoginActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_or_login);


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
