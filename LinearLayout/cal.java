package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button a,s,m,d;
    private EditText num1,num2;
    private TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.n1);
        num2=findViewById(R.id.n2);
        r=findViewById(R.id.res);
        a=findViewById(R.id.abtn);
        s=findViewById(R.id.sbtn);
        m=findViewById(R.id.mbtn);
        d=findViewById(R.id.dbtn);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int n3=n1+n2;
                r.setText(String.valueOf(n3));
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int n3=n1-n2;
                r.setText(String.valueOf(n3));
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int n3=n1*n2;
                r.setText(String.valueOf(n3));
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                int n3=n1/n2;
                r.setText(String.valueOf(n3));
            }
        });
    }
}
