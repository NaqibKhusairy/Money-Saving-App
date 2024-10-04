package com.naqib.moneysaving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText enterid , enterpassword;
    TextView forgotpassword , signup;
    Button loginbtn;
    String id , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterid=findViewById(R.id.enterid);
        enterpassword=findViewById(R.id.enterpassword);
        forgotpassword=findViewById(R.id.forgotpassword);
        signup=findViewById(R.id.signup);
        loginbtn=findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id = enterid.getText().toString();
                password = enterpassword.getText().toString();
                try{
                    if(required()){
                        Toast.makeText(getApplicationContext(), "welcome back" + id, Toast.LENGTH_SHORT).show();
                        Intent i= new Intent(getApplicationContext(),dashboard.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("id", id);
                        i.putExtras(bundle);
                        startActivity(i);
                    }
                } catch (Exception e) {
                    required();
                }
            }
        });

        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r= new Intent(getApplicationContext(),ResetPassword.class);
                startActivity(r);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r= new Intent(getApplicationContext(),SignIn.class);
                startActivity(r);
            }
        });
    }
    public boolean required() {
        if(id.isEmpty() && password.isEmpty()){
            enterid.setError("Please enter your Id.");
            enterpassword.setError("Please enter your Password.");
            return false;
        }
        else if(id.isEmpty()){
            enterpassword.setError("Please enter your Password.");
            return false;
        }
        else if(password.isEmpty()){
            enterid.setError("Please enter your Id.");
            return false;
        }
        else {
            return true;
        }
    }
}