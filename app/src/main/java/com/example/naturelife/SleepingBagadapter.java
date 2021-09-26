package com.example.naturelife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SleepingBagadapter extends RecyclerView.Adapter<SleepingBagadapter.MyViewHolder> {

    Context context;

    ArrayList<SleepingBag> list;


    public SleepingBagadapter(Context context, ArrayList<SleepingBag> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.sleepingbagitem,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        SleepingBag sleepingbags = list.get(position);
        holder.code.setText(sleepingbags.getCode());
        holder.price.setText(sleepingbags.getPrice());
        holder.title.setText(sleepingbags.getTitle());
        holder.description.setText(sleepingbags.getDescription());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView code, price, title, description;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            code= itemView.findViewById(R.id.Scode);
            price = itemView.findViewById(R.id.Stitle);
            title= itemView.findViewById(R.id.Sprice);
            description = itemView.findViewById(R.id.Sdis);

        }
    }

}
