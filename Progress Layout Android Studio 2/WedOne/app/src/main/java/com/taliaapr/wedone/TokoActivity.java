package com.taliaapr.wedone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TokoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toko);

        RecyclerView recyclerView = findViewById(R.id.rvToko);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DataBajuToko[] dataBajuToko = new DataBajuToko[]{
                new DataBajuToko("Baju Adat Jawa", "Rp.1.000.000", R.drawable.adatjawa),
                new DataBajuToko("Baju Adat Jambi", "Rp.750.000", R.drawable.adatjambi),
                new DataBajuToko("Baju Adat Riau", "Rp.800.000", R.drawable.adatriau),
                new DataBajuToko("Baju Adat Betawi", "Rp.500.000", R.drawable.adatbetawi),
                new DataBajuToko("Baju Modern Blue Dress", "Rp.1.300.000", R.drawable.moderndressblue),
                new DataBajuToko("Baju Modern Simple White", "Rp.800.000", R.drawable.modernsimple),
                new DataBajuToko("Baju Modern Gold Dress", "Rp.1.500.000", R.drawable.moderndressgold),
                new DataBajuToko("Baju Modern Long Dress", "Rp.2.350.000", R.drawable.modernlongdress),
        };

        BajuTokoAdapter bajuTokoAdapter = new BajuTokoAdapter(dataBajuToko, TokoActivity.this);
        recyclerView.setAdapter(bajuTokoAdapter);
    }
}