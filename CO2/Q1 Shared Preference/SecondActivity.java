package com.example.sharedlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=findViewById(R.id.result1);
        t2=findViewById(R.id.result2);

        SharedPreferences sp3=getSharedPreferences("demo",MODE_PRIVATE);
        String s1=sp3.getString("name","");
        String s2=sp3.getString("password","");
        t1.setText(s1);
        t2.setText(s2);
    }
}
