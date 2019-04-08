package com.example.umesh.e_buddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class claim extends Activity implements OnItemSelectedListener{
    /** Called when the activity is first created. */
    EditText num1;
    Button button01;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;

    ImageView iv1;
    Spinner spinOps;
    String[] ops={"RANK","Lt - Maj","Lt Col - Brig","Maj Gen & Above"};
    String opselected;
    int accn,messing, duration,total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim);



        tv1 = findViewById(R.id.TextView01);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6 = findViewById(R.id.textView6);


        //iv1= (ImageView)findViewById(R.id.);//try imageview

        button01 = findViewById(R.id.Button01);
        button01.setText("Calculate");
        button01.setOnClickListener(myClickListener);

        num1 = findViewById(R.id.EditText01);

        if (num1!=null)
            num1.setText("");
        else
            num1.setText("Enter Duration");


        //list of operations
        spinOps = findViewById(R.id.Spinner01);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, ops);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinOps.setAdapter(adapter);
        spinOps.setOnItemSelectedListener(this);

    }

    private OnClickListener myClickListener = new OnClickListener()
    {
        public void onClick(View v) {

            duration=Integer.parseInt(num1.getText().toString());

            if (opselected=="Lt - Maj"){accn=duration*2250; messing=duration*900; total = accn+messing;
                tv1.setText("Accn:");
                tv2.setText(Double.toString(accn));
                tv3.setText("Messing:");
                tv4.setText(Double.toString(messing));
                tv5.setText("Total:");
                tv6.setText(Double.toString(total));


            }



            else if (opselected=="Lt Col - Brig") {
                accn = duration * 4500;
                messing = duration * 1000;
                total = accn + messing;
                tv1.setText("Accn:");
                tv2.setText(Double.toString(accn));
                tv3.setText("Messing:");
                tv4.setText(Double.toString(messing));
                tv5.setText("Total:");
                tv6.setText(Double.toString(total));
            }


            else if (opselected=="Maj Gen & Above") {
                accn = duration * 7500;
                messing = duration * 1200;
                total = accn + messing;
                tv1.setText("Accn:");
                tv2.setText(Double.toString(accn));
                tv3.setText("Messing:");
                tv4.setText(Double.toString(messing));
                tv5.setText("Total:");
                tv6.setText(Double.toString(total));
            }

            else {tv1.setText("Please select the Rank");}
            //tv1 = (TextView)findViewById(R.id.TextView01);



        }
    };

    public void onItemSelected (AdapterView<?> p,View v,int position,long id) {
        opselected=ops[position];

    }
    public void onNothingSelected(AdapterView<?> p) {
        tv1.setText("Please select ops");
    }
}