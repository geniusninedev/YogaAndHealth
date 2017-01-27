package com.geniusnine.android.yogaandhealth;

import android.app.Application;

import com.firebase.client.Firebase;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Dev on 24-01-2017.
 */

public class YogaAndHealth extends Application{
    @Override
    public void onCreate(){
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

}
