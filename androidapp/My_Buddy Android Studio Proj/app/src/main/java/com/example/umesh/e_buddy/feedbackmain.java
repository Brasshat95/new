package com.example.umesh.e_buddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class feedbackmain extends AppCompatActivity {

    EditText editTextname, editTextmessage, editTextcourse;
    Button send;

    DatabaseReference databaseFeedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackmain);

        databaseFeedback = FirebaseDatabase.getInstance().getReference("Feedback");

        //getting views
        editTextname = (EditText) findViewById(R.id.editTextName);
        editTextcourse = (EditText) findViewById(R.id.editTextCourse);
        editTextmessage = (EditText) findViewById(R.id.editTextMessage);


        send = (Button) findViewById(R.id.button2);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addFeedback();
            }
        });


    }

    private void addFeedback() {

        String name = editTextname.getText().toString().trim();
        String course = editTextcourse.getText().toString().trim();
        String complaint = editTextmessage.getText().toString().trim();


        if ((!TextUtils.isEmpty(name)) && (!TextUtils.isEmpty(course)) && (!TextUtils.isEmpty(complaint))) {


            String id = databaseFeedback.push().getKey();


            Feedback feedback = new Feedback(id, name, course, complaint);

            databaseFeedback.child(id).setValue(feedback);

            editTextname.setText("");
            editTextcourse.setText("");
            editTextmessage.setText("");


            Toast.makeText(this, "Your feedback successfully sent", Toast.LENGTH_LONG).show();
        } else {
            //if the value is not given displaying a toast
            Toast.makeText(this, "Please fill all details", Toast.LENGTH_LONG).show();
        }

    }
}
