package com.taliaapr.wedone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder>{

    History[] history;
    Context context;

    public HistoryAdapter(History[] history, HistoryActivity activity) {
        this.history = history;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.history_list,parent,false);
        HistoryAdapter.ViewHolder viewHolder = new HistoryAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.ViewHolder holder, int position) {
        final History historyList = history[position];
        holder.tvNamaTokoHistory.setText(historyList.getNamaTokoHistory());
        holder.tvNamaBajuHistory.setText(historyList.getBajuSewaHistory());
        holder.tvAlamatTokoHistory.setText(historyList.getAlamatTokoHistory());
        holder.tvHargaSewaHistory.setText(historyList.getHargaSewaHistory());
        holder.btnDataSewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DataSewaActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return history.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNamaTokoHistory;
        TextView tvNamaBajuHistory;
        TextView tvAlamatTokoHistory;
        TextView tvHargaSewaHistory;
        Button btnDataSewa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaTokoHistory = itemView.findViewById(R.id.tvNamaTokoHistory);
            tvNamaBajuHistory = itemView.findViewById(R.id.tvNamaBajuHistory);
            tvAlamatTokoHistory = itemView.findViewById(R.id.tvAlamatTokoHistory);
            tvHargaSewaHistory = itemView.findViewById(R.id.tvHargaSewaHistory);
            btnDataSewa = itemView.findViewById(R.id.btnDataSewa);
        }
    }
}
