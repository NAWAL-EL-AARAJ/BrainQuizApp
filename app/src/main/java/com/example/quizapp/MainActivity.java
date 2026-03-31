package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etMail , etPassword;
    Button btnLogin;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
            etMail = findViewById(R.id.Email);
            etPassword = findViewById(R.id.password_toggle);
            btnLogin = findViewById(R.id.signing);
            tvRegister = findViewById(R.id.register);
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (etMail.getText().toString().equals("asmae") && etPassword.getText().toString().equals("2026")) {
                        Intent i1 = new Intent(MainActivity.this, quiz1.class);
                        startActivity(i1);
                    } else {
                        Toast.makeText(MainActivity.this, "Wrong email or password", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            tvRegister.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i2 = new Intent(getApplicationContext(), Register.class);
                    startActivity(i2);
                }
            });
        });
    }
}