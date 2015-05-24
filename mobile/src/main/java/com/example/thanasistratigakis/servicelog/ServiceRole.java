package com.example.thanasistratigakis.servicelog;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by ThanasiStratigakis on 5/24/15.
 */


@ParseClassName("ServiceRole")
public class ServiceRole extends ParseObject {

    public ServiceRole() {
        // default constructor
    }

    public ServiceRole (String name, String description, String requirements, Boolean available) {
        put("name", name);
        put("description", description);
        put("requirements", requirements);
        put("available", available);
        saveInBackground();
    }
}
