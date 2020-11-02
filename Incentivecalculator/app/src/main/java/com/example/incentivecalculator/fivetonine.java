package com.example.incentivecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.min;

public class fivetonine extends AppCompatActivity {

    EditText BlueThisSem;
    EditText BlueAllTime;
    EditText TotSolve;
    EditText CFCount;
    EditText CFRating;
    EditText WeeklyRating;
    TextView SetOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivetonine);
        BlueThisSem = findViewById(R.id.editTextNumber4);
        BlueAllTime =findViewById(R.id.editTextNumber3);
        TotSolve =findViewById(R.id.editTextNumber5);
        CFCount =findViewById(R.id.editTextNumber6);
        CFRating =findViewById(R.id.editTextNumberDecimal);
        WeeklyRating =findViewById(R.id.editTextNumberDecimal2);
        SetOutput = findViewById(R.id.textView7);
    }
    public double BlueScore(String s){
        int thisBlue=Integer.parseInt(s);
        double dnum=thisBlue/5.0; dnum=min(dnum,10.00);
        return dnum;
    }
    public double CFScore(String s){
        int solve=Integer.parseInt(s);
        double dnum=8;
        if(solve<1400) dnum-=1.0;
        if(solve<1350) dnum-=1.0;
        if(solve<1300) dnum-=1.0;
        if(solve<1250) dnum-=1.0;
        if(solve<1100) dnum-=1.0;
        if(solve<1050) dnum-=1.0;
        if(solve<1000) dnum-=1.0;
        return dnum;
    }
    public double SolveScore(String s){
        int solve=Integer.parseInt(s);
        double dnum=5;
        if(solve<200) dnum-=1.0;
        if(solve<150) dnum-=1.0;
        if(solve<130) dnum-=1.0;
        if(solve<120) dnum-=1.0;
        if(solve<100) dnum-=1.0;
        return dnum;
    }
    public double WeeklyScore(String s){
        int solve=Integer.parseInt(s);
        double dnum=5;
        if(solve<60) dnum-=1.0;
        if(solve<45) dnum-=1.0;
        if(solve<30) dnum-=1.0;
        if(solve<20) dnum-=1.0;
        if(solve<10) dnum-=1.0;
        return dnum;
    }
    public void CalcScore59(View v){
        String s=BlueAllTime.getText().toString();
        String st=CFCount.getText().toString();
        int totBlue = Integer.parseInt(s);
        int totCF = Integer.parseInt(st);
        String outs="";
        double dnum=BlueScore(BlueThisSem.getText().toString());
        dnum+=SolveScore(TotSolve.getText().toString());
        dnum+=WeeklyScore(WeeklyRating.getText().toString());
        dnum+=CFScore(CFRating.getText().toString());
        if(totBlue<80||totCF<10){
            outs="You are not Eligible for Incentive";
        } else{
            outs= String.format("%.2f", dnum);
            outs= "Your Incentive score is "+outs+" out of 28";
        }
        SetOutput.setText(outs);
    }
}