package com.blueocean.tr_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button btnLogin, btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegis = findViewById(R.id.btnRegis);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (editTextUsername.getText().toString().length() == 0) {
                    editTextUsername.setError("Username required!");
                } else if (editTextPassword.getText().toString().length() == 0) {
                    editTextPassword.setError("Password required!");
                } else {
                    Toast.makeText(getApplicationContext(), "Anda Sudah Berhasil", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("user", username);
                    intent.putExtra("password", password);
                    startActivity(intent);
                }
            }
        });
    }

    public void registrasi(View view) {
        Intent intent2 = new Intent(this, Registrasi.class);
        startActivity(intent2);
    }

    public void login(View login){
        Intent intent4 = new Intent(Registrasi.this, MainActivity.class);
        startActivity(intent4);
    }
}