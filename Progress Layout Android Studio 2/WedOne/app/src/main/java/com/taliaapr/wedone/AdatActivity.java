package com.taliaapr.wedone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

public class AdatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat);

        RecyclerView recyclerView = findViewById(R.id.rvAdat);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DataBajuAdat[] dataBajuAdat = new DataBajuAdat[]{
                new DataBajuAdat("Baju Adat Jawa", "Rp.1.000.000", R.drawable.adatjawa),
                new DataBajuAdat("Baju Adat Jambi", "Rp.750.000", R.drawable.adatjambi),
                new DataBajuAdat("Baju Adat Riau", "Rp.800.000", R.drawable.adatriau),
                new DataBajuAdat("Baju Adat Betawi", "Rp.500.000", R.drawable.adatbetawi),
        };

        BajuAdatAdapter bajuAdatAdapter = new BajuAdatAdapter(dataBajuAdat, AdatActivity.this);
        recyclerView.setAdapter(bajuAdatAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }
}