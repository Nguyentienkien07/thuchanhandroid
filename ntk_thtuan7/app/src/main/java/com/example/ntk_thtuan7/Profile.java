package com.example.ntk_thtuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button btnOpen=(Button)
                findViewById(R.id.btnback);
        btnOpen.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View arg0) {
                                                   doCloseProfile();
                                               }
                                           });
    }
    public void doCloseProfile()
    {
        Intent myIntent=new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_profile, menu);
        return true;
    }
}