package com.example.thanasistratigakis.servicelog;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by ThanasiStratigakis on 5/21/15.
 */

@ParseClassName("Location")
public class Location extends ParseObject {


    public Location(){
        // default constructor
    }

    public Location (String name, String address, String description, String adminId){
        put("name", name);
        put("address", address);
        put("description", description);
        put("admins", adminId);
        saveInBackground();

        //ArrayList<ParseObject> organizations = new ArrayList<ParseObject>();
    }

}
