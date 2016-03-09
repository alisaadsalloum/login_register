package com.example.ali.login_register;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    Button bLogOut;
    EditText etPassword,etAge,etUsername;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPassword=(EditText)findViewById(R.id.etPassword);
        etAge=(EditText)findViewById(R.id.etAge);

        etUsername=(EditText)findViewById(R.id.etUsername);
        bLogOut=(Button)findViewById(R.id.bregister);
        bLogOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogOut:
                startActivity(new Intent(this,login.class));
                break;
        }
    }
}