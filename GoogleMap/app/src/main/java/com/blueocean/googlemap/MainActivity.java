package com.blueocean.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private Button btnsave;
    private EditText editTextLongitude;
    private EditText editTextLatitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        editTextLongitude = (EditText)findViewById(R.id.editTextLongitude);
        editTextLatitude = (EditText)findViewById(R.id.editTextLatitude);
        btnsave = (Button)findViewById(R.id.btnsave);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });

    }
    private void saveUserInformasi() {
        double longitude = Double.parseDouble(editTextLongitude.getText().toString().trim());
        double latitude = Double.parseDouble(editTextLatitude.getText().toString().trim());
        UserInformasi userInformasi = new UserInformasi(longitude,latitude);
        mDatabase.child("Users").setValue(UserInformasi);
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        if (view==btnsave) {
            editTextLongitude.getText().clear();
            editTextLatitude.getText().clear();
        }
    }

}