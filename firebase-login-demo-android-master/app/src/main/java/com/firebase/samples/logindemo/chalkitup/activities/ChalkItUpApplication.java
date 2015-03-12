package com.firebase.samples.logindemo.chalkitup.activities;

import com.firebase.client.Firebase;

/**
 * Initialize Firebase with the application context. This must happen before the client is used.
 *
 * @author mimming
 * @since 12/17/14
 */
public class ChalkItUpApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
