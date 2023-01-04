package com.example.sharedlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n,p;
    Button b1,b2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=findViewById(R.id.name);
        p=findViewById(R.id.passord);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        t=findViewById(R.id.demo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=n.getText().toString();
                String s2=p.getText().toString();

                SharedPreferences sp=getSharedPreferences("demo",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();

                editor.putString("name",s1);
                editor.putString("password",s2);

                editor.apply();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(in);
            }
        });

        SharedPreferences sp2=getSharedPreferences("demo",MODE_PRIVATE);
        String test=sp2.getString("password","default");
        t.setText(test);

    }
}
