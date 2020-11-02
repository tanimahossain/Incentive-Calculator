package com.example.incentivecalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.min;

public class onetofour extends AppCompatActivity {

    EditText BlueThisSem;
    EditText BlueAllTime;
    TextView SetOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onetofour);
        BlueThisSem = findViewById(R.id.editTextNumber);
        BlueAllTime =findViewById(R.id.editTextNumber2);
        SetOutput = findViewById(R.id.textView2);
    }
    public void CalcScore14(View v){
        String s=BlueAllTime.getText().toString();
        String st=BlueThisSem.getText().toString();
        int totBlue = Integer.parseInt(s);
        int thisBlue = Integer.parseInt(st);
        double dnum=thisBlue/4.0; dnum=min(dnum,28.00);
        String outs="";
        if(totBlue<80){
            outs="You are not Eligible for Incentive";
        } else{
            outs= String.format("%.2f", dnum);
            outs= "Your Incentive score is "+outs+" out of 28";
        }
        SetOutput.setText(outs);
    }
}