package com.example.darkmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class contribution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribution);

        Button buttonOne = findViewById(R.id.btn1);
        buttonOne.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.contribution.this,com.example.darkmode.intern.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonOne1 = findViewById(R.id.btn2);
        buttonOne1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.contribution.this,com.example.darkmode.iv.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonOne2 = findViewById(R.id.btn3);
        buttonOne2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.contribution.this,com.example.darkmode.op.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonOne3 = findViewById(R.id.btn4);
        buttonOne3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.contribution.this,com.example.darkmode.recruit.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonOne4 = findViewById(R.id.btn5);
        buttonOne4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.contribution.this,com.example.darkmode.mentor.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonOne5 = findViewById(R.id.btn6);
        buttonOne5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.contribution.this,com.example.darkmode.guest.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonOne6 = findViewById(R.id.btn7);
        buttonOne6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println("Button1 Clicked");
                Intent activity2Intent = new Intent(com.example.darkmode.contribution.this,com.example.darkmode.others.class);
                startActivity(activity2Intent);
            }
        });

    }
}