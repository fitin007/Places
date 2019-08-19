package com.ishincasoft.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlaceAdapterRecyclerView extends RecyclerView.Adapter<PlaceAdapterRecyclerView.PlaceViewHolder> {

      private List<Place>places;
      private int resource;
      private Activity activity;

    public PlaceAdapterRecyclerView(List<Place> places, int resource, Activity activity) {
        this.places = places;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(resource, parent, false);

        return new PlaceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place=this.places.get(position);
        holder.namePlaceTextView.setText(place.getName());
        holder.image.setImageResource(place.getImage());

    }

    @Override
    public int getItemCount() {
        return this.places.size();
    }

    public class PlaceViewHolder  extends RecyclerView.ViewHolder {
        public TextView namePlaceTextView;
        public ImageView image;

        public PlaceViewHolder(View view) {
            super(view);
            namePlaceTextView = view.findViewById(R.id.txtNamePlace);
            image = view.findViewById(R.id.imgPlace);

        }
    }
}
