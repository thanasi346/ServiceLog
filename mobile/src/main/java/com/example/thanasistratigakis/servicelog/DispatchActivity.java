package com.example.thanasistratigakis.servicelog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseUser;

/**
 * Created by ThanasiStratigakis on 5/18/15.
 */
public class DispatchActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "bFlfAKQNEWDRvaNX7ikcJ0ZaSKbcKc6W98InH9Ie", "Idlc9KjBgLFvLakk2jUMBpUEfvUNZemux6tT10p9");

        // Check if there is  current user info
        if (ParseUser.getCurrentUser() != null) {
            // Start an intent for the logged in activity
            startActivity(new Intent(this, MainActivity.class));
        } else {
            // Start and intent for the logged out activity
            startActivity(new Intent(this, SignUpOrLoginActivity.class));
        }
    }

}
