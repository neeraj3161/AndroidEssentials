package com.example.gymmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class birthday_adapter extends RecyclerView.Adapter<birthday_adapter.viewHolder> {

    //creating the array which will hold the element which will be of type of recycler_representation

    private ArrayList<birth_day_recycler_represents> birthday_list;


    //getting access to the objects in the list

    //constructor

    public birthday_adapter(Context context,ArrayList<birth_day_recycler_represents> list){
        birthday_list=list;
    }



    //creating a view holder which will hold the view

    public class viewHolder extends RecyclerView.ViewHolder{

        //create all the items which wil be there in the view holder

        ImageView whats_app,phone,message;
        TextView name,surname,dob;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

//            define the id's

            whats_app= itemView.findViewById(R.id.whats_app_view);
            phone= itemView.findViewById(R.id.phone_view);
            message=itemView.findViewById(R.id.message_view);
            name=itemView.findViewById(R.id.birth_name);
            surname=itemView.findViewById(R.id.birth_surname);
            dob=itemView.findViewById(R.id.birth_dob);

            //on click listener if you click on any item

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //code later
                }
            });


        }
    }

    //3 methods of adapter

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //we have to send the view after onCreate
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.birthday_recycler,parent,false);

        //returning the view holder in the view
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        //this binds the view together runs for everyitem in the arayList

        //holding the item from the above created viewHolder class
        holder.itemView.setTag(birthday_list.get(position));

        //holding the other parameters

        holder.name.setText(birthday_list.get(position).getName());
        holder.surname.setText(birthday_list.get(position).getSurname());
        holder.dob.setText(birthday_list.get(position).getDob());
        holder.whats_app.setImageResource(R.drawable.whatsapp);
        holder.phone.setImageResource(R.drawable.telephonecall);
        holder.message.setImageResource(R.drawable.messages);

    }

    @Override
    public int getItemCount() {
        return birthday_list.size();
    }

}
