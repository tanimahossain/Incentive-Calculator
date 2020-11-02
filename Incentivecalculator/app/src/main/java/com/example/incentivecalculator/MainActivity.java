package com.example.incentivecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Gotodashboard(View v){
        Intent startIntent = new Intent(getApplication(),Dashboard.class);
        startActivity(startIntent);
    }
    public void Gotoonetofour(View v){
        Intent startIntent = new Intent(getApplication(),onetofour.class);
        startActivity(startIntent);
    }
    public void Gotofivetonine(View v){
        Intent startIntent = new Intent(getApplication(),fivetonine.class);
        startActivity(startIntent);
    }
    public void Gototentotwelve(View v){
        Intent startIntent = new Intent(getApplication(),tentotwelve.class);
        startActivity(startIntent);
    }
    public void About(View v){
        Intent startIntent = new Intent(getApplication(),About.class);
        startActivity(startIntent);
    }
}