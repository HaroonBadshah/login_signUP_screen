package com.example.rafilabotry.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rafilabotry.R;

import java.security.PrivateKey;

public class VarifyOTP extends AppCompatActivity {

    private ImageView imageView;
    private Button varifybtn;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varify_otp);

        imageView = findViewById(R.id.signupback_btn);
        varifybtn = findViewById(R.id.Varifybtn);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VarifyOTP.this, SignUp3rdClass.class);
                startActivity(intent);
            }
        });


    }
}
