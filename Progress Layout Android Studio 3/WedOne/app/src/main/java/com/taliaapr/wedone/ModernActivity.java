package com.taliaapr.wedone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ModernActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern);

        RecyclerView recyclerView = findViewById(R.id.rvModern);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DataBajuModern[] dataBajuModern = new DataBajuModern[]{
                new DataBajuModern("Baju Modern Blue Dress", "Rp.1.300.000", R.drawable.moderndressblue),
                new DataBajuModern("Baju Modern Simple White", "Rp.800.000", R.drawable.modernsimple),
                new DataBajuModern("Baju Modern Gold Dress", "Rp.1.500.000", R.drawable.moderndressgold),
                new DataBajuModern("Baju Modern Long Dress", "Rp.2.350.000", R.drawable.modernlongdress),
        };

        BajuModernAdapter bajuModernAdapter = new BajuModernAdapter(dataBajuModern, ModernActivity.this);
        recyclerView.setAdapter(bajuModernAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_search_actionbar, menu);
        MenuItem menuItem = menu.findItem(R.id.search_actionbar);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("cari baju modern disini...");
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