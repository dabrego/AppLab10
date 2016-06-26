/*
    This app makes use of a spinner
    and also styles a button using image buttons
*/


package com.developerandroid.applab10;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public static boolean selected = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /*
            The createFromResource() method allows you to create an ArrayAdapter from the string array.
            The third argument for this method is a layout resource that defines how the selected choice
            appears in the spinner control. The simple_spinner_item layout is provided by the platform
            and is the default layout you should use unless you'd like to define your own layout
            for the spinner's appearance.

            You should then call setDropDownViewResource(int) to specify the layout the adapter should
            use to display the list of spinner choices (simple_spinner_dropdown_item is another
            standard layout defined by the platform).

            Call setAdapter() to apply the adapter to your Spinner.
        */


        // Setting up spinners, supply the spinner with the array using an instance of ArrayAdapter:
        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.err.println("**************" + position);
                String item = parent.getItemAtPosition(position).toString();

                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent i = new Intent();
                        i.setClass(MainActivity.this, VenusActivity.class);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array,
                android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        System.err.println("**************" + position);
        String item = parent.getItemAtPosition(position).toString();

        switch (position) {
            case 0:
                Intent i = new Intent();
                i.setClass(MainActivity.this, VenusActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }

    }



    public void onNothingSelected(AdapterView<?> parent){
        Toast.makeText(parent.getContext(), "Nada ha sido seleccionado...", Toast.LENGTH_LONG).show();
    }

}


























