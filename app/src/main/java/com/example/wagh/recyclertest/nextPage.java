package com.example.wagh.recyclertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.wagh.recyclertest.Adapter.AdvanceAdapter;

/**
 * Created by wagh on 27/7/16.
 */
public class nextPage extends AppCompatActivity {


    RecyclerView recyclerView;
    Button b22;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.nextpage);

        //***********************************************

        b22=(Button)findViewById(R.id.Nextlevel2);

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(nextPage.this,databasetest.class);

                startActivity(i);

            }
        });

        //****************************************************

        recyclerView=(RecyclerView)findViewById(R.id.rv2);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager mLinearLayout =new LinearLayoutManager(this);

        recyclerView.setLayoutManager(mLinearLayout);

        RecyclerView.Adapter mAdapter2;

        mAdapter2 =new AdvanceAdapter();

        recyclerView.setAdapter(mAdapter2);



    }
}
