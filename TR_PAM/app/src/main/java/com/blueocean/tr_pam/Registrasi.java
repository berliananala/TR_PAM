package com.blueocean.tr_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrasi extends AppCompatActivity {

    private EditText editTextUsername, editTextEmail, editTextPassword, editTextRePassword;
    private Button btnRegis, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextRePassword = (EditText) findViewById(R.id.editTextRePassword);
        btnRegis = (Button) findViewById(R.id.btnRegis);
        btnBack = (Button) findViewById(R.id.btnBack);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = editTextUsername.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                String repassword = editTextRePassword.getText().toString();

                if (editTextPassword.getText().toString().length()==0)
                {
                    editTextPassword.setError("Kata sandi diperlukan!");
                } else if (editTextRePassword.getText().toString().length()==0)
                {
                    editTextRePassword.setError("Harus diisi!");
                } else {
                    Toast.makeText(getApplicationContext(), "Registration Berhasil", Toast.LENGTH_LONG).show();
                    Intent intent2 = new Intent(Registrasi.this, MainActivity.class);
                    intent2.putExtra("user", username);
                    intent2.putExtra("email", email);
                    intent2.putExtra("password", password);
                    intent2.putExtra("repassword", repassword);
                    startActivity(intent2);
                }
            }
        });
    }

    public void registrasi(View view) {
        Intent intent3 = new Intent(this, Registrasi.class);
        startActivity(intent3);
    }

    public void back(View view) {
        Intent intent5 = new Intent(this, Registrasi.class);
        startActivity(intent5);
    }

    public void login(View login){
        Intent intent4 = new Intent(Registrasi.this, HomeActivity.class);
        startActivity(intent4);
    }
}
