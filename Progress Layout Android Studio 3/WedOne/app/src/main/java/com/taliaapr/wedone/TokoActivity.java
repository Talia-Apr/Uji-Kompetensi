package com.taliaapr.wedone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_search_actionbar, menu);
        MenuItem menuItem = menu.findItem(R.id.search_actionbar);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("cari baju ditoko ini...");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}