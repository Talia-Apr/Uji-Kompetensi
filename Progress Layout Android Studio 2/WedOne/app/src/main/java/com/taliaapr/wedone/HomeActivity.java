package com.taliaapr.wedone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.rvHome);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DataBaju[] dataBaju = new DataBaju[]{
                new DataBaju("Baju Adat Jawa", "Rp.1.000.000", R.drawable.adatjawa),
                new DataBaju("Baju Adat Jambi", "Rp.750.000", R.drawable.adatjambi),
                new DataBaju("Baju Adat Riau", "Rp.800.000", R.drawable.adatriau),
                new DataBaju("Baju Adat Betawi", "Rp.500.000", R.drawable.adatbetawi),
                new DataBaju("Baju Modern Blue Dress", "Rp.1.300.000", R.drawable.moderndressblue),
                new DataBaju("Baju Modern Simple White", "Rp.800.000", R.drawable.modernsimple),
                new DataBaju("Baju Modern Gold Dress", "Rp.1.500.000", R.drawable.moderndressgold),
                new DataBaju("Baju Modern Long Dress", "Rp.2.350.000", R.drawable.modernlongdress),
        };

        BajuAdapter bajuAdapter = new BajuAdapter(dataBaju, HomeActivity.this);
        recyclerView.setAdapter(bajuAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.btmNav);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return true;

                    case R.id.history:
                        startActivity(new Intent(getApplicationContext(), HistoryActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.akun:
                        startActivity(new Intent(getApplicationContext(), AkunActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    public void btnAdat(View view) {
        Intent intent = new Intent(this, AdatActivity.class);
        startActivity(intent);
    }


    public void btnModern(View view) {
        Intent intent = new Intent(this, ModernActivity.class);
        startActivity(intent);
    }
}