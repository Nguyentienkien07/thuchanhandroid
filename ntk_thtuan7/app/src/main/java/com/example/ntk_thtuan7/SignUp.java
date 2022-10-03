package com.example.ntk_thtuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button btnBack= (Button)
                findViewById(R.id.btnsignup);
        btnBack.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View v) {
                                                   finish();
                                               }
                                           });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_sign_up, menu);
        return true;
    }
}