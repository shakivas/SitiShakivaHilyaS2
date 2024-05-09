package com.example.sitishakivahilyas3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridFoodsAdapter extends RecyclerView.Adapter<GridFoodsAdapter.GridViewHolder> {
    private ArrayList<Foods> listFoods;
    public GridFoodsAdapter(ArrayList<Foods> list) {
        this.listFoods = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_foods, parent, false);
        return new GridViewHolder(view);
    }
        @Override
        public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
            Glide.with(holder.itemView.getContext()).load(listFoods.get(position).getPhoto()).apply(new RequestOptions().override(350, 550)).into(holder.imgPhoto);
    }
                @Override
                public int getItemCount() {
                    return listFoods.size();
                }

            class GridViewHolder extends RecyclerView.ViewHolder {
                ImageView imgPhoto;
                GridViewHolder(View itemView) {
                    super(itemView);
                    imgPhoto = itemView.findViewById(R.id.img_item_photo);
            }
    }
}
