package com.example.naturelife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CookingItemadapter extends RecyclerView.Adapter<CookingItemadapter.MyViewHolder> {

    Context context;

    ArrayList<cooking> list;


    public CookingItemadapter(Context context, ArrayList<cooking> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.cookingitem,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        cooking CookingItems = list.get(position);
        holder.Itemcode.setText(CookingItems.getItemcode());
        holder.Prize.setText(CookingItems.getPrize());
        holder.title.setText(CookingItems.getTitle());
        holder.Description.setText(CookingItems.getDescription());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Itemcode, Prize, title,Description;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Itemcode = itemView.findViewById(R.id.Cprize);
            Prize = itemView.findViewById(R.id.Cprize);
            title = itemView.findViewById(R.id.Ctitle);
            Description = itemView.findViewById(R.id.Cdes);

        }
    }

}
