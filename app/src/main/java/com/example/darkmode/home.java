package com.example.darkmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btn1 = findViewById(R.id.google);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.home.this,google.class);
                startActivity(activity2Intent);
            }
        });


        Button btn2 = findViewById(R.id.microsoft);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.home.this,microsoft.class);
                startActivity(activity2Intent);
            }
        });






        Button princi = findViewById(R.id.princi);
        princi.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.home.this,princi.class);
                startActivity(activity2Intent);
            }
        });


        Button corres = findViewById(R.id.corres);
        corres.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.home.this, com.example.darkmode.corres.class);
                startActivity(activity2Intent);
            }
        });
    }
}