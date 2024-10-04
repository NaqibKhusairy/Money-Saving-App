package com.naqib.moneysaving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText enterid , enterpassword;
    TextView forgotpassword , signup;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterid=findViewById(R.id.enterid);
        enterpassword=findViewById(R.id.enterpassword);
        forgotpassword=findViewById(R.id.forgotpassword);
        signup=findViewById(R.id.signup);
        loginbtn=findViewById(R.id.loginbtn);
    }
}