package com.apolis.lanny.recyclerview;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    List<MyProject> myProjects;

    public MyAdapter(List<MyProject> myProjects){
        this.myProjects = myProjects;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, genere, year;
        public CardView bg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textViewTitle);
            genere = itemView.findViewById(R.id.textViewGenre);
            year = itemView.findViewById(R.id.textViewYear);
            bg = itemView.findViewById(R.id.card_view);

        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        MyProject list = myProjects.get(i);
        myViewHolder.title.setText((list.getTitle()));
        myViewHolder.genere.setText((list.getGenre()));
        myViewHolder.year.setText((list.getYear()));

        if(i == 1){
            myViewHolder.bg.setCardBackgroundColor(Color.BLUE);
        }
        if(i == 2){
            myViewHolder.bg.setCardBackgroundColor(Color.YELLOW);
        }
        if(i == 3){
            myViewHolder.bg.setCardBackgroundColor(Color.GRAY);
        }
        if(i == 4){
            myViewHolder.bg.setCardBackgroundColor(Color.GREEN);
        }
    }

    @Override
    public int getItemCount() {
        return myProjects.size();
    }

}
