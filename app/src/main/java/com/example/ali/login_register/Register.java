package com.example.ali.login_register;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.test.ApplicationTestCase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.R.*;
import android.R.array;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class Register extends Activity implements View.OnClickListener {
  Button bregister;
    EditText etName,etPassword,etAge,etConfirmPassword,etUsername;

  @Override
  protected void onCreate (Bundle SavedInstanceState){
super.onCreate(SavedInstanceState);
setContentView(layout.R.simple_list_item_1.activity_Register);
      etName=(EditText)findViewById(R.id.etName);
      etPassword=(EditText)findViewById(R.id.etPassword);
      etAge=(EditText)findViewById(R.id.etAge);
       etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
      etUsername=(EditText)findViewById(R.id.etUsername);
      bregister=(Button)findViewById(R.id.bregister);
      bregister.setOnClickListener(this);
  }


  @Override
  public void onClick(View v) {
 switch (v.getId()){
      case R.id.bregister:
        break;
    }

  }
}