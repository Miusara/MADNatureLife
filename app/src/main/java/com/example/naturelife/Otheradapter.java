package com.example.naturelife;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  Otheradapter extends RecyclerView.Adapter<Otheradapter.MyViewHolder> {

    Context context;

    ArrayList<Other> list;


    public Otheradapter(Context context, ArrayList<Other> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.otheritem,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Other otherr = list.get(position);
        holder.code.setText(otherr.getCode());
        holder.price.setText(otherr.getPrice());
        holder.title.setText(otherr.getTitle());
        holder.description.setText(otherr.getDescription());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView code, price, title, description;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            code = itemView.findViewById(R.id.Ocode);
            price = itemView.findViewById(R.id.Oprice);
            title = itemView.findViewById(R.id.Otitle);
            description = itemView.findViewById(R.id.Odes);

        }
    }

}
