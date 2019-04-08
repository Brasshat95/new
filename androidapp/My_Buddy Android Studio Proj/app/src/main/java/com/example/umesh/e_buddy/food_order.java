package com.example.umesh.e_buddy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class f0ood_order extends AppCompatActivity implements View.OnClickListener {

    private int entries = 6;
    private String phoneNum[];
    private String buttonLabels[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);

        phoneNum = new String[entries];
        buttonLabels = new String[entries];

        // Populate the data arrays
        populateArrays();

        // Set up buttons and attach click listeners

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setText(buttonLabels[0]);
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setText(buttonLabels[1]);
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setText(buttonLabels[2]);
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setText(buttonLabels[3]);
        button4.setOnClickListener(this);

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setText(buttonLabels[4]);
        button5.setOnClickListener(this);

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setText(buttonLabels[5]);
        button6.setOnClickListener(this);
    }

    // Launch the phone dialer

    public void launchDialer(String number){
        String numberToDial = "tel:"+number;
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(numberToDial)));
    }


    /** Method to populate the data arrays */

    public void populateArrays(){

        /** In a practical application the arrays phoneNum and buttonLabels could be
         * updated dynamically from the Web in this method.  For this project we just
         * hard-wire in some values to illustrate how to use such data, once obtained,
         * to make phone calls. The names and numbers are made up.*/

        phoneNum[0] = "9876543210";
        phoneNum[1] = "9876543210";
        phoneNum[2] = "9876543210";
        phoneNum[3] = "9876543210";
        phoneNum[4] = "9876543210";
        phoneNum[5] = "8696740501";

        buttonLabels[0] = "Bits 'n' Bites";
        buttonLabels[1] = "Recharge";
        buttonLabels[2] = "Milan";
        buttonLabels[3] = "Hotspot";
        buttonLabels[4] = "Sangrila";
        buttonLabels[5] = "Foodiquettes";
    }

    /** Process button events */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                launchDialer(phoneNum[0]);
                break;

            case R.id.button2:
                launchDialer(phoneNum[1]);
                break;

            case R.id.button3:
                launchDialer(phoneNum[2]);
                break;

            case R.id.button4:
                launchDialer(phoneNum[3]);
                break;

            case R.id.button5:
                launchDialer(phoneNum[4]);
                break;

            case R.id.button6:
                launchDialer(phoneNum[5]);
                break;
        }
    }
}
