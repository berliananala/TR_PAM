package com.blueocean.webservice;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = findViewById(R.id.txtNama);

    }

    public void StartRequest(View view) {
        APIList apis = RetrofitClient.getRetrofitClient().create(APIList.class);
        Call<ArrayList<Mahasiswa>> call = apis.getAllMahasiswa();
        call.enqueue(new Callback<ArrayList<Mahasiswa>>() {
            @Override
            public void onResponse(Call<ArrayList<Mahasiswa>> call, Response<ArrayList<Mahasiswa>> response) {
            if (response.isSuccessful()) {
                ArrayList<Mahasiswa> data = response.body();
            } else {
                Toast.makeText(getApplicationContext(), "Response from server is not success!", Toast.LENGTH_SHORT).show();
            }
            }

            @Override
            public void onFailure(Call<ArrayList<Mahasiswa>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failed to send/get data from server!",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }



}