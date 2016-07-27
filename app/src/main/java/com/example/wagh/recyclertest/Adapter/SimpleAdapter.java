package com.example.wagh.recyclertest.Adapter;

import android.support.v7.widget.RecyclerView;
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
public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    List<String> mlist;

    public SimpleAdapter()
    {
        super();
        mlist=new ArrayList<String>();

        mlist.add("one object");
        mlist.add("Melody");
        mlist.add("PC");
        mlist.add("Mobile");
        mlist.add("Falero");
        mlist.add("Iball");
        mlist.add("Wifi");
        mlist.add("one object");
        mlist.add("Melody");
        mlist.add("PC");
        mlist.add("Mobile");
        mlist.add("Falero");
        mlist.add("Iball");
        mlist.add("Wifi");
        mlist.add("one object");
        mlist.add("Melody");
        mlist.add("PC");
        mlist.add("Mobile");
        mlist.add("Falero");
        mlist.add("Iball");
        mlist.add("Wifi");




    }

    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlayout,parent,false);

        ViewHolder viewHolder=new ViewHolder(v);


        return viewHolder;
    }

    //***actual data is shown using this line

    @Override
    public void onBindViewHolder(SimpleAdapter.ViewHolder holder, int position) {


        holder.tv1.setText(mlist.get(position));

    }


    //***just to get the size and need to override the system variables

    @Override
    public int getItemCount() {

        return mlist.size();
    }


    //****************Binding done in constructor and that is holder

    class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tv1;

        public ViewHolder(View tv1)
        {
            super(tv1);
            this.tv1=(TextView)tv1.findViewById(R.id.rv1tv1);
        }


    }

}
