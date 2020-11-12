package com.example.darkmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class contactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        Button direction=(Button)findViewById(R.id.direction);
        direction.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent activity2Intent = new Intent(com.example.darkmode.contactUs.this, com.example.darkmode.directionAct.class);
                startActivity(activity2Intent);
            }
        });
        Button en=(Button)findViewById(R.id.enquiry);
        en.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent activity2Intent = new Intent(com.example.darkmode.contactUs.this,enquiryAct.class);
                startActivity(activity2Intent);
            }
        });
    }
}