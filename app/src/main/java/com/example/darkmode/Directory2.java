package com.example.darkmode;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Directory2 extends AppCompatActivity {

    TextView tvname, tvemail, tvdepartment, tvbatch, tvcountry;
    ImageView Image;
    int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory2);

        tvname = findViewById(R.id.NameValue);
        tvemail = findViewById(R.id.EmailValue);
        tvdepartment = findViewById(R.id.DepartmentValue);
        tvcountry = findViewById(R.id.CountryValue);
        tvbatch = findViewById(R.id.BatchValue);

        Image = findViewById(R.id.image);


        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");

        tvname.setText(Directory.SubjectList.get(position).getName());
        tvemail.setText(Directory.SubjectList.get(position).getEmail());
        tvdepartment.setText(Directory.SubjectList.get(position).getDepartment());
        tvbatch.setText(Directory.SubjectList.get(position).getBatch());
        tvcountry.setText(Directory.SubjectList.get(position).getCountry());
        Glide.with(Image.getContext()).load(Directory.SubjectList.get(position).getImage()).into(Image);

    }
}
