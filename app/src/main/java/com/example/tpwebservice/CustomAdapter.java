package com.example.tpwebservice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

  //  CustomAdapter customAdapter ;
    ArrayList<User> data ;

    public CustomAdapter(ArrayList<User> data )
    {
        this.data=data ;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ligne,parent,false),this);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String ch=data.get(position).getName()+data.get(position).getUsername()+data.get(position).getEmail() ;
       holder.textView.setText(ch);
      //  holder.bind(data.get(position));
    }



    @Override
    public int getItemCount() {
        return data.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView ;
        CustomAdapter customAdapter ;

        public MyViewHolder(@NonNull View itemView,CustomAdapter adapter) {
            super(itemView);
            textView=itemView.findViewById(R.id.text);
           customAdapter=adapter ;

        }

        /*public void bind(final String item)
        {
            textView.setText(item);
        }*/
    }

    // extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>
}
