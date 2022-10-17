package com.example.ntk_th_bai9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.LaptopViewHolder>{

    private Context kContext;
    private List<Laptop> kListLaptop;

    public LaptopAdapter(Context kContext) {
        this.kContext = kContext;
    }
    public void setData(List<Laptop> list){
        this.kListLaptop = list;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_laptop, parent, false);

        return new LaptopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position) {
        Laptop laptop = kListLaptop.get(position);
        if (laptop == null){
            return;
        }

        holder.imgLaptop.setImageResource(laptop.getResourceId());
        holder.tvName.setText(laptop.getName());
    }

    @Override
    public int getItemCount() {
        if (kListLaptop != null){
            return kListLaptop.size();
        }
        return 0;
    }

    public  class  LaptopViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgLaptop;
        private TextView tvName;



        public LaptopViewHolder(@NonNull View itemView) {
            super(itemView);

            imgLaptop = itemView.findViewById(R.id.img_laptop);
            tvName = itemView.findViewById(R.id.tv_name);
        }
    }
}
