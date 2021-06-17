package com.example.assignment.ui.main;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.assignment.R;
import com.example.assignment.pojo.Data;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    public List<Data> data = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.brand.setText(data.get(position).getBrand());
        holder.isUsed.setText(data.get(position).isUsed()+"");
        holder.conYear.setText(data.get(position).getConstractionYear());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setList(List<Data> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView brand, isUsed, conYear;
        ImageView image;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            brand = itemView.findViewById(R.id.brandText);
            isUsed = itemView.findViewById(R.id.isUsedText);
            conYear = itemView.findViewById(R.id.conYearText);
            image= itemView.findViewById(R.id.imageView);
        }
    }
}