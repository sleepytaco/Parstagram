package com.abukh.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register the Post model we created
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fVpHNRLVeML7EWBzukeYIp0KRDuC1QuQBGj8BA3b")
                .clientKey("kHqwhtvpZRoqE8XACEWL1BHzi9K71fC85FvhANcR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
