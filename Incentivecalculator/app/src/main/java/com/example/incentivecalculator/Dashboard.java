package com.example.incentivecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void criteria(View v) {
        String criteriadoc = "https://docs.google.com/document/d/1YT7ZGbTI4DH6eLSWJr2EX_v5cZUx_2p40g-guPmSE5g";
        Uri webaddress = Uri.parse(criteriadoc);

        Intent StartIntent = new Intent(Intent.ACTION_VIEW, webaddress);

        if (StartIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(StartIntent);
        }
    }
    public void applicationform(View v) {
        String applyform = "https://docs.google.com/forms/d/1rdXoGId6N8_gNZ2LVxMeUEKhehX1ZNIfvugKp8ZYLVM";
        Uri webaddress = Uri.parse(applyform);

        Intent StartIntent = new Intent(Intent.ACTION_VIEW, webaddress);

        if (StartIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(StartIntent);
        }
    }
}