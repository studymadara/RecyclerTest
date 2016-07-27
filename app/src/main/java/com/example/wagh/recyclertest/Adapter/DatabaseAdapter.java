package com.example.wagh.recyclertest.Adapter;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wagh.recyclertest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagh on 27/7/16.
 */
public class DatabaseAdapter extends RecyclerView.Adapter<DatabaseAdapter.Viewholder> {




    List<Attack> Attack=new ArrayList<Attack>();

    public DatabaseAdapter(List<Attack> Zttack)
    {
     super();

        this.Attack=Zttack;


    }


    @Override
    public DatabaseAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View data= LayoutInflater.from(parent.getContext()).inflate(R.layout.databasepagerecycler,parent,false);

        Viewholder viewholder=new Viewholder(data);

        return viewholder;

    }



    @Override
    public void onBindViewHolder(Viewholder holder, int position) {

        com.example.wagh.recyclertest.Adapter.Attack attack=Attack.get(position);

        holder.t1.setText(attack.getTest());


    }

    @Override
    public int getItemCount() {
        return Attack.size();
    }


    class Viewholder extends RecyclerView.ViewHolder
    {

        public TextView t1;


        public Viewholder(View data)
        {
            super(data);
            t1=(TextView)data.findViewById(R.id.tvdata);

        }
    }


}
