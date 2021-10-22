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

public class BajuModernAdapter extends RecyclerView.Adapter<BajuModernAdapter.ViewHolder>{

    DataBajuModern[] dataBajuModern;
    Context context;

    public BajuModernAdapter(DataBajuModern[] dataBajuModern, ModernActivity activity) {
        this.dataBajuModern =  dataBajuModern;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.modern_item_list,parent,false);
        BajuModernAdapter.ViewHolder viewHolder = new BajuModernAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BajuModernAdapter.ViewHolder holder, int position) {
        final DataBajuModern dataBajuModernList = dataBajuModern[position];
        holder.tvNamaBajuModern.setText(dataBajuModernList.getNamaBajuModern());
        holder.tvHargaSewaModern.setText(dataBajuModernList.getHargaSewaModern());
        holder.imgBajuModern.setImageResource(dataBajuModernList.getImgBajuModern());
        holder.btnProdukModern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), BajuModernDetail.class);
                intent.putExtra("imgBajuModern", dataBajuModernList.getImgBajuModern());
                intent.putExtra("namaBajuModern", dataBajuModernList.getNamaBajuModern());
                intent.putExtra("hargaSewaModern", dataBajuModernList.getHargaSewaModern());
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
        return dataBajuModern.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBajuModern;
        TextView tvNamaBajuModern;
        TextView tvHargaSewaModern;
        Button btnProdukModern;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBajuModern = itemView.findViewById(R.id.imageModern);
            tvNamaBajuModern = itemView.findViewById(R.id.tvNamaBajuModern);
            tvHargaSewaModern = itemView.findViewById(R.id.tvHargaSewaModern);
            btnProdukModern = itemView.findViewById(R.id.btnProdukModern);
        }
    }
}
