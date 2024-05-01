package com.example.movie_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.movie_app.Activities.DetailActivity;
import com.example.movie_app.Domain.GenresItem;
import com.example.movie_app.Domain.ListFilm;
import com.example.movie_app.R;

import java.util.ArrayList;

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.Viewholder> {
    ArrayList<GenresItem> items;
    Context context;

    public CategoryListAdapter(ArrayList<GenresItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public CategoryListAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category,parent,false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListAdapter.Viewholder holder, int position) {
        holder.titleTxt.setText(items.get(position).getName());


        holder.itemView.setOnClickListener(v -> {

        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView titleTxt;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titleTxt=itemView.findViewById(R.id.TitleTxt);

        }
    }
}
