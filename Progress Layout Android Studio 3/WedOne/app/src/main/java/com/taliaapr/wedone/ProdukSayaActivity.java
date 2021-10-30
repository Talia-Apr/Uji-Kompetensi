package com.taliaapr.wedone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProdukSayaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_saya);

        RecyclerView recyclerView = findViewById(R.id.rvProduk);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DataProduk[] dataProduk = new DataProduk[]{
                new DataProduk("Adat Jawa", "Rp.1.000.000", R.drawable.adatjawa, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
                new DataProduk("Adat Jambi", "Rp.750.000", R.drawable.adatjambi, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
                new DataProduk("Adat Riau", "Rp.800.000", R.drawable.adatriau, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
                new DataProduk("Adat Betawi", "Rp.500.000", R.drawable.adatbetawi, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
                new DataProduk("Blue Dress", "Rp.1.300.000", R.drawable.moderndressblue, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
                new DataProduk("Simple White", "Rp.800.000", R.drawable.modernsimple, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
                new DataProduk("Gold Dress", "Rp.1.500.000", R.drawable.moderndressgold, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
                new DataProduk("Long Dress", "Rp.2.350.000", R.drawable.modernlongdress, "Baju yang sangat nyaman dipakai dengan harga yang murah"),
        };

        ProdukTokoAdapter produkTokoAdapter = new ProdukTokoAdapter(dataProduk, ProdukSayaActivity.this);
        recyclerView.setAdapter(produkTokoAdapter);
    }

    public void btnTambahBaju(View view) {
        Intent intent = new Intent(this, TambahProdukActivity.class);
        startActivity(intent);
    }
}