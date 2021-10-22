package com.taliaapr.wedone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
}