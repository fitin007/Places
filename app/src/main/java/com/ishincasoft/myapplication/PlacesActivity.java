package com.ishincasoft.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class PlacesActivity extends AppCompatActivity {


    private MaterialButton showPlacesMaterialButton;
    private RecyclerView recyclerView;
    private PlaceAdapterRecyclerView placeAdapterRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        finds();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void finds(){
       showPlacesMaterialButton=findViewById(R.id.btnMostrarPlaces);
       recyclerView=findViewById(R.id.recyclerViewPlaces);


    }

    private void setupPlacesRecyclerView(){

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        placeAdapterRecyclerView=new PlaceAdapterRecyclerView(Place.getPlaces(), R.layout.item_place,this);
        recyclerView.setAdapter(placeAdapterRecyclerView);
    }
}
