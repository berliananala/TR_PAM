package com.blueocean.tr_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {

    ImageView img, back;
    TextView proName, proPrice, proQty, proDesc, proUnit;

    String name, price, desc, qty, unit;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image", R.drawable.ab);
        price = i.getStringExtra("price");
        desc = i.getStringExtra("desc");
        qty = i.getStringExtra("qty");
        unit = i.getStringExtra("unit");

        proName = findViewById(R.id.productName);
        proPrice = findViewById(R.id.prodPrice);
        proUnit = findViewById(R.id.unit);
        proDesc = findViewById(R.id.prodDesc);
        proQty = findViewById(R.id.qty);
        img = findViewById(R.id.big_image);

        proName.setText(name);
        proPrice.setText(price);
        proDesc.setText(desc);
        proQty.setText(qty);
        proUnit.setText(unit);

        img.setImageResource(image);

        back.setOnClickListener((view) -> {
            Intent intent6 = new Intent(ProductDetails.this, HomeActivity.class);
            startActivity(intent6);
            finish();
        });
    }
}
