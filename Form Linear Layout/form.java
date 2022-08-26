package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText n,a,p,ph ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.sub);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=findViewById(R.id.name);
                a=findViewById(R.id.age);
                p=findViewById(R.id.place);
                ph=findViewById(R.id.phone);
                String c1=n.getText().toString().trim();
                if(c1.equals("")){
                    Toast.makeText(MainActivity.this, "Enter valid name", Toast.LENGTH_SHORT).show();
                }
                else if(a.getText().toString().trim().equals("") || Integer.parseInt(a.getText().toString())<0){
                    Toast.makeText(MainActivity.this, "Enter valid age", Toast.LENGTH_SHORT).show();
                }
                else if(p.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Enter a place", Toast.LENGTH_SHORT).show();
                }
                else if(ph.getText().toString().trim().equals("") || ph.getText().toString().trim().length()<10){
                    Toast.makeText(MainActivity.this, "Enter a valid phone number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
