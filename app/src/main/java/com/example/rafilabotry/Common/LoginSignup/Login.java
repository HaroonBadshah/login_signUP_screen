package com.example.rafilabotry.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rafilabotry.R;

public class Login extends AppCompatActivity {
    private ImageView loginback_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_login);

        loginback_btn = findViewById(R.id.loginback_btn);

        loginback_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Login.this,RetailerStartupScreen.class);
                startActivity(intent);
            }
        });
    }
}
