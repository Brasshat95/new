package com.example.umesh.e_buddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class course_info extends AppCompatActivity {

    private ImageView imageView3;
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);


        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openclaim();
            }


        });

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensyllabus();
            }


        });

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencomingsoon();
            }


        });

        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencomingsoon();
            }


        });



    }


    public void openclaim(){

        Intent intent = new Intent(course_info.this, claim.class);
        startActivity(intent);
    }

    public void opensyllabus(){

        Intent intent = new Intent(course_info.this, syllabus.class);
        startActivity(intent);
    }
    public void opencomingsoon(){

        Intent intent = new Intent(course_info.this, comingsoon.class);
        startActivity(intent);
    }
}
