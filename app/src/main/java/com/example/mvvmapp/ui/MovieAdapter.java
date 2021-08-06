package com.example.mvvmapp.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmapp.R;
import com.example.mvvmapp.pojo.Data;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private ArrayList<Data> moviesList = new ArrayList<>();

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        holder.mName.setText(moviesList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void fillList(ArrayList<Data> data){
        this.moviesList=data;
        notifyDataSetChanged();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.movie_name_tv);
        }
    }

}
