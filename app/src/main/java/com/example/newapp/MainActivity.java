package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button submit;
    CheckBox c1,c2,c3,c4;
    Switch sw;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        tv=findViewById(R.id.status);
        submit=findViewById(R.id.submit);
        c1=findViewById(R.id.chb1);
        c2=findViewById(R.id.chb2);
        c3=findViewById(R.id.chb3);
        c4=findViewById(R.id.chb4);
        sw=findViewById(R.id.switch1);
        radioGroup=findViewById(R.id.);


        /*submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()){
                    tv.setText("You clicked "+c1.getText().toString());
                    Toast.makeText(getApplicationContext(),"You clicked "+c1.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c2.isChecked()){
                    tv.setText("You clicked "+c2.getText().toString());
                    Toast.makeText(getApplicationContext(),"You clicked "+c2.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c3.isChecked()){
                    tv.setText("You clicked "+c3.getText().toString());
                    Toast.makeText(getApplicationContext(),"You clicked "+c3.getText().toString(),Toast.LENGTH_LONG).show();
                }
                if(c4.isChecked()){
                    tv.setText("You clicked "+c4.getText().toString());
                    Toast.makeText(getApplicationContext(),"You clicked "+c4.getText().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });*/
       /* submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Please choose atlas one checkbox, Do you want to Cancel").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You clicked yes", Toast.LENGTH_LONG).show();
                        finish();
                    }
                }).setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You Clicked No", Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog= builder.create();
                alertDialog.setTitle("My 1st alert dialog");
                alertDialog.show();
            }
        });*/
    /*    submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(i);
                Toast.makeText(getApplicationContext(),radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(radioButton.getText().toString()).setCancelable(true);
                AlertDialog alertDialog= builder.create();
                alertDialog.setTitle("My 2nd alert dialog");
                alertDialog.show();
            }
        }); */
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {

                    Toast.makeText(getApplicationContext(), "Switch On", Toast.LENGTH_SHORT).show();
                    WifiManager wifiManager=(WifiManager) getSystemService(getApplicationContext().WIFI_SERVICE);
                    wifiManager.setWifiEnabled(true);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Switch On", Toast.LENGTH_SHORT).show();
                    WifiManager wifiManager=(WifiManager) getSystemService(getApplicationContext().WIFI_SERVICE);
                    wifiManager.setWifiEnabled(false);
                }
            }
        });

    }
}