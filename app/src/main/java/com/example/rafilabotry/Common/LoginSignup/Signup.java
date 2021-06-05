package com.example.rafilabotry.Common.LoginSignup;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rafilabotry.R;

public class Signup extends AppCompatActivity {

    //Variables
    private ImageView backbtn;
    private TextView titleText;
    private Button next, login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_signup);


        //Hooks
        backbtn = findViewById(R.id.signupback_btn);
        next = findViewById(R.id.sign_up_next_btn);
        login = findViewById(R.id.login_btn);
        titleText = findViewById(R.id.signup_title_text);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, SignUp2ndClass.class);

                Intent intent1 = new Intent(Signup.this, SignUp2ndClass.class);
                startActivity(intent1);

            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, RetailerStartupScreen.class);
                startActivity(intent);
            }
        });


    }

}
