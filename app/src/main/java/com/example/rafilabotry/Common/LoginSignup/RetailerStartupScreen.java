package com.example.rafilabotry.Common.LoginSignup;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import com.example.rafilabotry.R;

public class RetailerStartupScreen extends AppCompatActivity {

    private Button Signupbtn, Loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_startup_screen);

        Loginbtn = findViewById(R.id.login_btn);
        Signupbtn = findViewById(R.id.signup_btn);


        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerStartupScreen.this, Login.class);
                startActivity(intent);
            }
        });

        Signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetailerStartupScreen.this, Signup.class);
                startActivity(intent);
            }
        });

    }
}
