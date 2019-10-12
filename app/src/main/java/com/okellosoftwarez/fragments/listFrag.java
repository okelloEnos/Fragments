package com.okellosoftwarez.fragments;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class listFrag extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager myLayoutManager;
    View view;


    public listFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_list, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView = view.findViewById(R.id.rcView);
        recyclerView.setHasFixedSize(true);

        myLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(myLayoutManager);

        myAdapter = new carAdapter(this.getContext(), ApplicationClass.people);
        recyclerView.setAdapter(myAdapter);


    }
}
