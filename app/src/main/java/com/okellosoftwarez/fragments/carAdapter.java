package com.okellosoftwarez.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class carAdapter extends RecyclerView.Adapter<carAdapter.ViewHolder> {

    private ArrayList<carOwnership> people;


    itemClicked activity;

    public interface itemClicked{
        public void onItenClicked(int index);
    }

    public carAdapter(Context context, ArrayList<carOwnership> list){
        people = list ;
        activity = (itemClicked) context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemView.setTag(people.get(position));
        holder.tvName.setText(people.get(position).getName());
//        holder.tvPhone.setText(people.get(position).getPhoneNo());
//        holder.tvModelVersion.setText(people.get(position).getCarModelVersion());
        holder.tvModelVersion.setText(people.get(position).getCarModelVersion());

        if (people.get(position).getCarModel().equals("Mercedes")){
            holder.carBrand.setImageResource(R.drawable.mercedes);
        }else if (people.get(position).getCarModel().equals("Nissan")){
            holder.carBrand.setImageResource(R.drawable.nissan);
        }else if (people.get(position).getCarModel().equals("Volkswagen")){
            holder.carBrand.setImageResource(R.drawable.volkswagen);
        }else {
            holder.carBrand.setImageResource(R.drawable.fruit);
        }

    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView carBrand;
        TextView tvName,tvPhone,tvModelVersion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            carBrand = itemView.findViewById(R.id.carBrand);
            tvName = itemView.findViewById(R.id.tvName);
//            tvPhone = itemView.findViewById(R.id.tvPhone);
            tvModelVersion = itemView.findViewById(R.id.tvModelVersion);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItenClicked(people.indexOf((carOwnership)view.getTag()));

                }
            });
        }
    }
}
