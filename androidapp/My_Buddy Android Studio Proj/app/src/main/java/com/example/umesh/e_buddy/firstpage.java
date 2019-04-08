package com.example.umesh.e_buddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;

public class firstpage extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencourse_info();


            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmmm();


            }
        });



        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openutilities();

            }
        });


        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfeedback();

            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();


            }
        });


    }

    public void opencourse_info() {

        Intent intent = new Intent(firstpage.this, course_info.class);
        startActivity(intent);
    }

    public void openmmm(){

        Intent intent = new Intent(firstpage.this, mmm.class);
        startActivity(intent);
    }
    public void openutilities(){

        Intent intent = new Intent(firstpage.this, utilities.class);
        startActivity(intent);
    }

    public void openlogin(){

        FirebaseAuth.getInstance().signOut();

        startActivity(new Intent(this,login.class));
        finish();
    }


    public void openfeedback(){


        Intent intent = new Intent(this,feedbackmain.class);
        startActivity(intent);
    }


}
