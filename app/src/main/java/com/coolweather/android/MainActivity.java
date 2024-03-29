package com.coolweather.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(null != prefs.getString("weather", null)){
//            Intent intent = new Intent(this,WeatherActivity.class);
//            startActivity(intent);
//            finish();
            prefs.edit().clear();
            prefs.edit().apply();
        }
    }
}
