package com.example.pmob_dian.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pmob_dian.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdt, PassEdt;
    private Button loginBtn;
    
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        initView();
    }

    private void initView() {
        userEdt=findViewById(R.id.editTextText);
        PassEdt = findViewById(R.id.editTextPassword);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userEdt.getText().toString().isEmpty() || PassEdt.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please fill your user and password", Toast.LENGTH_LONG).show();
                }else if(userEdt.getText().toString().equals("test") && PassEdt.getText().toString().equals("test")){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));

                }else{
                    Toast.makeText(LoginActivity.this, "your user and password is not correct", Toast.LENGTH_LONG).show();
                }
            }
        });
        
    }

}