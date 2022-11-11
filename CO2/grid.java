package com.example.gridcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Boolean newop=true;
    String old,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.res);
    }
    public void numberEvent(View view){
        if(newop){
            ed1.setText("");
        }
        newop=false;
        String num=ed1.getText().toString();
        switch(view.getId()) {
            case R.id.bu1:
                num += "1";
                break;
            case R.id.bu2:
                num += "2";
                break;
            case R.id.bu3:
                num += "3";
                break;
            case R.id.bu4:
                num += "4";
                break;
            case R.id.bu5:
                num += "5";
                break;
            case R.id.bu6:
                num += "6";
                break;
            case R.id.bu7:
                num += "7";
                break;
            case R.id.bu8:
                num += "8";
                break;
            case R.id.bu9:
                num += "9";
                break;
            case R.id.bu0:
                num += "0";
                break;
            case R.id.bu_clr:
                num = " ";
                break;

        }
        ed1.setText(num);
    }

    public void operatorEvent(View view){
        newop=true;
        old=ed1.getText().toString();
        switch(view.getId()) {
            case R.id.bu_add:
                op = "+";
                break;
            case R.id.bu_sub:
                op = "-";
                break;
            case R.id.bu_div:
                op = "/";
                break;
            case R.id.bu_mul:
                op = "*";
                break;
        }
    }


    public void equalEvent(View view){
        String newno=ed1.getText().toString();
        double result=0.0;
        switch (op){
            case "+":
                result=Double.parseDouble(old)+Double.parseDouble(newno);
                break;
            case "-":
                result=Double.parseDouble(old)-Double.parseDouble(newno);
                break;
            case "/":
                result=Double.parseDouble(old)/Double.parseDouble(newno);
                break;
            case "*":
                result=Double.parseDouble(old)*Double.parseDouble(newno);
                break;
        }
        ed1.setText(result+"");
    }
}
