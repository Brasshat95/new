package com.example.umesh.e_buddy;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class utilities extends AppCompatActivity {


    private ImageView imageView3;
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilities);

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfood_order();
            }


        });


        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8696740501"));

                if (ActivityCompat.checkSelfPermission(utilities.this,
                        Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }


        });

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8696740501"));

                if (ActivityCompat.checkSelfPermission(utilities.this,
                        Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }


        });


        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8696740501"));

                if (ActivityCompat.checkSelfPermission(utilities.this,
                        Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }


        });
    }
        public void openfood_order(){

            Intent intent = new Intent(utilities.this, food_order.class);
            startActivity(intent);
        }
    }