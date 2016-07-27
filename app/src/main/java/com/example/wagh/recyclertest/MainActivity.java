package com.example.wagh.recyclertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.wagh.recyclertest.Adapter.SimpleAdapter;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    Button nextpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.rv1);

        //**************************************************************

        nextpage=(Button)findViewById(R.id.Nextlevel);


        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ii=new Intent(MainActivity.this,nextPage.class);

                startActivity(ii);

            }
        });

        //**************************************************************

        RecyclerView.LayoutManager mLayoutManager=new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(mLayoutManager);

        RecyclerView.Adapter mAdapter;

        mAdapter=new SimpleAdapter();

        recyclerView.setAdapter(mAdapter);


    }
}
