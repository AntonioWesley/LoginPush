package com.firman.fcm;

/**
 * Created by Firman on 9/14/2016.
 */
public class Config {

    //URL to our login.php file
    //Kalau bisa dihosting
    //IP dari Internet harus nyambung

    //Via IP Address LocalHost
    //public static final String LOGIN_URL = "http:192.168.100.6/android_login_api/login.php";
    //Via Idhostinger
    public static final String LOGIN_URL = "http://fcm.16mb.com/android_login_api/login.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "myloginapp";

    //This would be used to store the email of current logged in user
    public static final String EMAIL_SHARED_PREF = "email";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";
}