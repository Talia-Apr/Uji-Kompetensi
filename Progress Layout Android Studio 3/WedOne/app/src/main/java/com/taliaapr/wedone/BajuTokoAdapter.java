package com.taliaapr.wedone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BajuTokoAdapter extends RecyclerView.Adapter<BajuTokoAdapter.ViewHolder>{

    DataBajuToko[] dataBajuToko;
    Context context;

    public BajuTokoAdapter(DataBajuToko[] dataBajuToko, TokoActivity activity) {
        this.dataBajuToko = dataBajuToko;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.toko_item_list,parent,false);
        BajuTokoAdapter.ViewHolder viewHolder = new BajuTokoAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BajuTokoAdapter.ViewHolder holder, int position) {
        final DataBajuToko dataBajuTokoList = dataBajuToko[position];
        holder.tvNamaBajuToko.setText(dataBajuTokoList.getNamaBajuToko());
        holder.tvHargaSewaToko.setText(dataBajuTokoList.getHargaSewaToko());
        holder.imgBajuToko.setImageResource(dataBajuTokoList.getImgBajuToko());
        holder.btnProdukToko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), BajuModernDetail.class);
                intent.putExtra("imgBajuModern", dataBajuTokoList.getImgBajuToko());
                intent.putExtra("namaBajuModern", dataBajuTokoList.getNamaBajuToko());
                intent.putExtra("hargaSewaModern", dataBajuTokoList.getHargaSewaToko());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.getApplicationContext().startActivity(intent);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataBajuToko.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBajuToko;
        TextView tvNamaBajuToko;
        TextView tvHargaSewaToko;
        Button btnProdukToko;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBajuToko = itemView.findViewById(R.id.imageToko);
            tvNamaBajuToko = itemView.findViewById(R.id.tvNamaBajuToko);
            tvHargaSewaToko = itemView.findViewById(R.id.tvHargaSewaToko);
            btnProdukToko = itemView.findViewById(R.id.btnProdukToko);
        }
    }
}
