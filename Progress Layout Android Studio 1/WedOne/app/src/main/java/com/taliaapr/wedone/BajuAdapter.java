package com.taliaapr.wedone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BajuAdapter extends RecyclerView.Adapter<BajuAdapter.ViewHolder>{

    DataBaju[] dataBaju;
    Context context;

    public BajuAdapter(DataBaju[] dataBaju, HomeActivity activity) {
        this.dataBaju = dataBaju;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = android.view.LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.home_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BajuAdapter.ViewHolder holder, int position) {
        final DataBaju dataBajuList = dataBaju[position];
        holder.tvNamaBaju.setText(dataBajuList.getNamaBaju());
        holder.tvHargaSewa.setText(dataBajuList.getHargaSewa());
        holder.imgBaju.setImageResource(dataBajuList.getImgBaju());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, dataBajuList.getNamaBaju(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataBaju.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBaju;
        TextView tvNamaBaju;
        TextView tvHargaSewa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBaju = itemView.findViewById(R.id.imageHome);
            tvNamaBaju = itemView.findViewById(R.id.tvNamaBaju);
            tvHargaSewa = itemView.findViewById(R.id.tvHargaSewa);
        }
    }
}
