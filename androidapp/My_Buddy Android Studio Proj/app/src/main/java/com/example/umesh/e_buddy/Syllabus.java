package com.example.umesh.e_buddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ITPMSyllabus extends AppCompatActivity {

    ImageView imageViewSyllabus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itpmsyllabus);

        imageViewSyllabus = (ImageView) findViewById(R.id.imageViewSyllabus);


        String url = "https://firebasestorage.googleapis.com/v0/b/ebuddy-ea9be.appspot.com/o/ITPM%20Syllabus.jpg?alt=media&token=56b19cee-5bc8-4b52-aafb-92e37e9101ad";


        Glide.with(this).load(url).into(imageViewSyllabus);
    }
}
