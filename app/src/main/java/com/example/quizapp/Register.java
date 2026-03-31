package com.example.quizapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {
    EditText etName , etMail , etPassword , etConfpassword;
    Button btnRegister ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etName = findViewById(R.id.Name);
        etMail = findViewById(R.id.Email);
        etPassword = findViewById(R.id.password_toggle);
        etConfpassword= findViewById(R.id.confirm_password_toggle);
        btnRegister = findViewById(R.id.register_button);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = etMail.getText().toString();
                String  password = etPassword.getText().toString();
                String confpassword = etConfpassword.getText().toString();
                if (TextUtils.isEmpty(mail)(
                        Toast.makeText(Register.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                        return;
            }
            if (TextUtils.isEmpty(password)){
                Toast.makeText(Register.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                return;
            }
            if (TextUtils.isEmpty(confpassword)){
                Toast.makeText(Register.this, "Please enter your confirm password", Toast.LENGTH_SHORT).show();
                return;
            }
            if (password.length()<6){
                Toast.makeText(Register.this, "Password too short", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!password.equals(confpassword)){
                Toast.makeText(Register.this, "Password doesn't match", Toast.LENGTH_SHORT).show();
                return;

            }
            Toast.makeText(Register.this, "Your account has been created", Toast.LENGTH_SHORT).show();



                ))
            }

            }



    }
}