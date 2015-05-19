package com.example.thanasistratigakis.servicelog;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by ThanasiStratigakis on 5/18/15.
 */
public class SampleApplication extends Application{

    public void onCreate() {
        //Parse.initialize(this, getString(R.string.parse_app_id), getString(R.string.parse_client_id));


        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "bFlfAKQNEWDRvaNX7ikcJ0ZaSKbcKc6W98InH9Ie", "Idlc9KjBgLFvLakk2jUMBpUEfvUNZemux6tT10p9");
    }
}
