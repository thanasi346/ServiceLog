package com.example.thanasistratigakis.servicelog;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by ThanasiStratigakis on 5/21/15.
 */

@ParseClassName("Organization")
public class Organization extends ParseObject {

    public Organization() {
        // default constructor
    }

    public Organization (String name, String locationId){
        put("Name", name);
        put("Locations", locationId);
        saveInBackground();
    }



//just set methods but use .put

}
