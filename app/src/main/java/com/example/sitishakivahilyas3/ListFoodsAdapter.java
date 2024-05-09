package com.example.sitishakivahilyas3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFoodsAdapter extends RecyclerView.Adapter<ListFoodsAdapter.ListViewHolder> {
    private ArrayList<Foods> listFoods;
    public ListFoodsAdapter(ArrayList<Foods> list){
        this.listFoods = list;
    }
    @NonNull
        @Override
        public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_foods, parent, false);
            return new ListViewHolder(view);
        }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Foods foods = listFoods.get(position);
        Glide.with(holder.itemView.getContext())
                .load(foods.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(foods.getName());
        holder.tvDetail.setText(foods.getDetail());
    }

    @Override
    public int getItemCount() {
        return listFoods.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
