package com.example.naturelife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Retrieve extends RecyclerView.Adapter<Retrieve.MyViewHolder> {

    Context context;

    ArrayList<Tent> list;


    public Retrieve(Context context, ArrayList<Tent> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.tent_layout,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Tent Tent = list.get(position);
        holder.itemcode.setText(Tent.getCode());
        holder.itemprices.setText(Tent.getItemprices());
        holder.tenttitle.setText(Tent.getTenttitle());
        holder.tentdesription.setText(Tent.getTentdescription());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView itemcode, itemprices, tenttitle, tentdesription;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemcode = itemView.findViewById(R.id.Tcode);
            itemprices = itemView.findViewById(R.id.Tprize);
            tenttitle = itemView.findViewById(R.id.Ttitle);
            tentdesription = itemView.findViewById(R.id.Tdis);

        }
    }

}
