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

public class BajuAdatAdapter extends RecyclerView.Adapter<BajuAdatAdapter.ViewHolder>{

    DataBajuAdat[] dataBajuAdat;
    Context context;

    public BajuAdatAdapter(DataBajuAdat[] dataBajuAdat, AdatActivity activity) {
        this.dataBajuAdat =  dataBajuAdat;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.adat_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BajuAdatAdapter.ViewHolder holder, int position) {
        final DataBajuAdat dataBajuAdatList = dataBajuAdat[position];
        holder.tvNamaBajuAdat.setText(dataBajuAdatList.getNamaBajuAdat());
        holder.tvHargaSewaAdat.setText(dataBajuAdatList.getHargaSewaAdat());
        holder.imgBajuAdat.setImageResource(dataBajuAdatList.getImgBajuAdat());
        holder.btnProdukAdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), BajuAdatDetail.class);
                intent.putExtra("imgBajuAdat", dataBajuAdatList.getImgBajuAdat());
                intent.putExtra("namaBajuAdat", dataBajuAdatList.getNamaBajuAdat());
                intent.putExtra("hargaSewaAdat", dataBajuAdatList.getHargaSewaAdat());
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
        return dataBajuAdat.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBajuAdat;
        TextView tvNamaBajuAdat;
        TextView tvHargaSewaAdat;
        Button btnProdukAdat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBajuAdat = itemView.findViewById(R.id.imageAdat);
            tvNamaBajuAdat = itemView.findViewById(R.id.tvNamaBajuAdat);
            tvHargaSewaAdat = itemView.findViewById(R.id.tvHargaSewaAdat);
            btnProdukAdat = itemView.findViewById(R.id.btnProdukAdat);
        }
    }
}
