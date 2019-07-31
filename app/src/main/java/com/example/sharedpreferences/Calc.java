package com.example.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;

public class Calc extends MainActivity {
    public static final String PREFS_NAME="MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME,0);
        boolean silent = settings.getBoolean("silentMode",false);
    }
}
