package com.taliaapr.wedone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BajuDetail extends AppCompatActivity {

    ImageView imgBaju;
    TextView tvNamaBaju,tvHargaSewa,tvDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baju_detail);

        imgBaju = findViewById(R.id.home_detail_img);
        tvNamaBaju = findViewById(R.id.home_namabaju_detail);
        tvHargaSewa = findViewById(R.id.home_hargabaju_detail);
//        tvDesc = findViewById(R.id.home_descbaju_detail);

        imgBaju.setImageResource(getIntent().getExtras().getInt("imgBaju"));
        tvNamaBaju.setText(getIntent().getExtras().getString("namaBaju"));
        tvHargaSewa.setText(getIntent().getExtras().getString("hargaSewa"));
//        tvDesc.setText(getIntent().getExtras().getString("DeskripsiProduk"));
    }

    public void btnDetailToko(View view) {
        Intent intent = new Intent(this, TokoActivity.class);
        startActivity(intent);
    }

    public void btnSewa(View view) {
        Intent intent = new Intent(this, SewaActivity.class);
        startActivity(intent);
    }
}