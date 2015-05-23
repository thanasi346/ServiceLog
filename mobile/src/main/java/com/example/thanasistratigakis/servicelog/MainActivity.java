package com.example.thanasistratigakis.servicelog;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.Parse;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable Local Datastore.

        Parse.initialize(this, "bFlfAKQNEWDRvaNX7ikcJ0ZaSKbcKc6W98InH9Ie", "Idlc9KjBgLFvLakk2jUMBpUEfvUNZemux6tT10p9");

        setContentView(R.layout.activity_main);

//        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
//
//        tabHost.setup();
//        TabHost.TabSpec tabSpec = tabHost.newTabSpec("logTab");
//        tabSpec.setContent(R.id.tabLog);
//        tabSpec.setIndicator("Log");
//        tabHost.addTab(tabSpec);
//
//        tabSpec = tabHost.newTabSpec("messengerTab");
//        tabSpec.setContent(R.id.tabMessenger);
//        tabSpec.setIndicator("Msg");
//        tabHost.addTab(tabSpec);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
