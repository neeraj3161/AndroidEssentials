package com.example.gymmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class birthday extends Fragment {

    //importing recycler view,its adapter and layout manager

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    //we'll also create a array list of type our recycler to set / send the items to it

    ArrayList<birth_day_recycler_represents> myBList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.birthdays, container, false);

        //below set the id of the main view which was dragged
        recyclerView= v.findViewById(R.id.birthday_recycler);

        //below line is good for performance
        recyclerView.setHasFixedSize(true);



        //initializing the array list

        myBList = new ArrayList<>();

        //below you can add the item

        //calling the recycler view method here so that we can set the setters

        birth_day_recycler_represents br = new birth_day_recycler_represents();
        br.setName("John");
        br.setSurname("Albert");
        br.setDob("2000-03-03");


        //adding this to myBList

        myBList.add(br);

        //setting the layout
        layoutManager= new LinearLayoutManager(getContext());

        //setting the layout to the recycler view
        recyclerView.setLayoutManager(layoutManager);

        //sending the items to the adapter

        myAdapter= new birthday_adapter(getContext(),myBList);

        //initializing / setting the adapter to the recycler view

        recyclerView.setAdapter(myAdapter);



        return v;
    }
}
