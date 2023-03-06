package com.example.router_home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        Button loginButton = (Button) findViewById(R.id.loginbtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") &&
                   password.getText().toString().equals("admin"))   {
                    Intent intent = new Intent(LogIn.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LogIn.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
