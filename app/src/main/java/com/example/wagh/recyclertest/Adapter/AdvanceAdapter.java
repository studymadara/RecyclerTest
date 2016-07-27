package com.example.wagh.recyclertest.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wagh.recyclertest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagh on 27/7/16.
 */
public class AdvanceAdapter extends RecyclerView.Adapter<AdvanceAdapter.ViewHolder> {


    List<Movie> mlist2;

    public AdvanceAdapter()
    {
        super();

        mlist2=new ArrayList<Movie>();

        Movie movie=new Movie();
        movie.setName("Spiderman2");
        movie.setThumb(android.R.mipmap.sym_def_app_icon);
        mlist2.add(movie);

        movie=new Movie();
        movie.setName("HelloWorld");
        movie.setThumb(android.R.mipmap.sym_def_app_icon);
        mlist2.add(movie);

        movie=new Movie();
        movie.setName("Batman");
        movie.setThumb(android.R.mipmap.sym_def_app_icon);
        mlist2.add(movie);

        movie=new Movie();
        movie.setName("HAHA");
        movie.setThumb(android.R.mipmap.sym_def_app_icon);
        mlist2.add(movie);

        movie=new Movie();
        movie.setName("Pewdiepie");
        movie.setThumb(android.R.mipmap.sym_def_app_icon);
        mlist2.add(movie);

        movie=new Movie();
        movie.setName("Viraj");
        movie.setThumb(android.R.mipmap.sym_def_app_icon);
        mlist2.add(movie);

        movie=new Movie();
        movie.setName("zzIball");
        movie.setThumb(android.R.mipmap.sym_def_app_icon);
        mlist2.add(movie);



    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclertesting,parent,false);

        ViewHolder viewHolder=new ViewHolder(v);

        return viewHolder;

    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        Movie movie=mlist2.get(position);
        holder.tv11.setText(movie.getName());
        holder.iv11.setImageResource(movie.getThumb());

    }




    @Override
    public int getItemCount() {
        return mlist2.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView tv11;
        public ImageView iv11;

        public ViewHolder(View test)
        {
            super(test);

            tv11=(TextView)test.findViewById(R.id.rttv);
            iv11=(ImageView)test.findViewById(R.id.rtiv);





        }
    }
}



