package com.taliaapr.wedone;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;

public class ProdukTokoAdapter extends RecyclerView.Adapter<ProdukTokoAdapter.ViewHolder>{

    DataProduk[] dataProduk;
    Context context;

    public ProdukTokoAdapter(DataProduk[] dataProduk, ProdukSayaActivity activity) {
        this.dataProduk = dataProduk;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.produk_list,parent,false);
        ProdukTokoAdapter.ViewHolder viewHolder = new ProdukTokoAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProdukTokoAdapter.ViewHolder holder, int position) {
        final DataProduk dataProdukList = dataProduk[position];
        holder.tvNamaProduk.setText(dataProdukList.getNamaBajuProduk());
        holder.tvHargaSewaProduk.setText(dataProdukList.getHargaSewaProduk());
        holder.tvDeskripsiProduk.setText(dataProdukList.getDeskripsiProduk());
        holder.imageProduk.setImageResource(dataProdukList.getImgBajuProduk());
    }

    @Override
    public int getItemCount() {
        return dataProduk.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

        TextView tvNamaProduk;
        TextView tvHargaSewaProduk;
        TextView tvDeskripsiProduk;
        ImageView imageProduk;
        ImageButton popMenu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaProduk = itemView.findViewById(R.id.tvNamaProduk);
            tvHargaSewaProduk = itemView.findViewById(R.id.tvHargaSewaProduk);
            tvDeskripsiProduk = itemView.findViewById(R.id.tvDeskripsiProduk);
            imageProduk = itemView.findViewById(R.id.imageProduk);
            popMenu = itemView.findViewById(R.id.popMenu);
            popMenu.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            showPopMenu(v);
        }

        public void showPopMenu(View view) {
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            popupMenu.inflate(R.menu.popup_menu);
            popupMenu.setOnMenuItemClickListener(this);
            popupMenu.show();
        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()){
                case R.id.editProduk:
                    Toast.makeText(context, "Edit Produk", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.hapusProduk:
                    Toast.makeText(context, "Hapus Produk", Toast.LENGTH_SHORT).show();
                    return true;

                default:
                    return false;
            }
        }
    }
}
