package com.milople.mylibrary;

import android.content.Context;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Toastermessage {
    static Toastermessage emailValidate;

    private Toastermessage() {
    }
    public static Toastermessage getInstance() {
        if (emailValidate != null)
            return emailValidate;
        else {
            return new Toastermessage();
        }
    }
    public boolean isValid(String email) {
        Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        Matcher regMatcher = regexPattern.matcher(email);
        return regMatcher.matches();
    }
    public void toasty(Context ctx, String str)
    {
        Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show();
    }
}
