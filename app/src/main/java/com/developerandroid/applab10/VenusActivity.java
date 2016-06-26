package com.developerandroid.applab10;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


import java.io.FileDescriptor;
import java.io.PrintWriter;

public class VenusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus);

        Button backMain = (Button) findViewById(R.id.mensaje);



        /*backMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });*/


    }

    public void createMessage(View view){
        Intent i = new Intent();
        i.setClass(VenusActivity.this, MainActivity.class);
        startActivity(i);
    }


}
