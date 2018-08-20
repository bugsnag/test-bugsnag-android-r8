package com.example.dave.testbugsnagandroidr8;

import com.bugsnag.android.Bugsnag;

public class CrashyClass {


    public void sendNotify(int i) {
        Bugsnag.notify(new RuntimeException("test notify " + String.valueOf(i)));
    }

    public void sendNotify(String s) {
        Bugsnag.notify(new RuntimeException("test notify " + s));
    }

}
