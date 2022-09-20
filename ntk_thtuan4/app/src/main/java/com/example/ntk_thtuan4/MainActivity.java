package com.example.ntk_thtuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtuser,edtpassword;
    Button btndangnhap, btnOpen;
    String ten,mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btnOpen = (Button) findViewById(R.id.btndangki);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length() != 0 && edtpassword.getText().length() !=0){
                    if (edtuser.getText().toString().equals(ten) && edtpassword.getText().toString().equals(mk)){
                        Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,Profile.class);
                        startActivity(intent);
                    }else if (edtuser.getText().toString().equals("kien0712") && edtpassword.getText().toString().equals("07122002")){
                        Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,Profile.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this,"Sai mật khẩu",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnOpen.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View arg0) {
                                                   doOpenSignUp();
                                               }
                                           });
    }
    public void doOpenSignUp()
    {
        Intent myIntent=new Intent(this, SignUp.class);
        startActivity(myIntent);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    private void Anhxa(){
        edtuser = (EditText) findViewById(R.id.edtuser);
        edtpassword = (EditText) findViewById(R.id.edtpassword);
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btnOpen = (Button) findViewById(R.id.btndangki);
    }

}