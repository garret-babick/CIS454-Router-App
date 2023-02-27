package com.example.router;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context context;
    ArrayList<Routes> routesArrayList;

    public MyAdapter(Context context, ArrayList<Routes> routesArrayList){
        this.context = context;
        this.routesArrayList = routesArrayList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Routes routes = routesArrayList.get(position);
        holder.routesType.setText(routes.routesType);
        holder.routesStart.setText(routes.routesStart);
        holder.routesEnd.setText(routes.routesEnd);
        holder.routesTime.setText(routes.routesTime);
    }

    @Override
    public int getItemCount() {
        return routesArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
            TextView routesType;
            TextView routesStart;
            TextView routesEnd;
            TextView routesTime;
            public MyViewHolder(@NonNull View itemView){
                super(itemView);
                routesType = itemView.findViewById(R.id.routesType);
                routesStart = itemView.findViewById(R.id.routesStart);
                routesEnd = itemView.findViewById(R.id.routesEnd);
                routesTime = itemView.findViewById(R.id.routesTime);

            }
    }
}
