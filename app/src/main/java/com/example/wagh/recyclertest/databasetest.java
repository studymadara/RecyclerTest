package com.example.wagh.recyclertest;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.wagh.recyclertest.Adapter.Attack;
import com.example.wagh.recyclertest.Adapter.DatabaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagh on 27/7/16.
 */
public class databasetest extends AppCompatActivity {

    RecyclerView rvdata;

    SQLiteDatabase mydb;

    List<com.example.wagh.recyclertest.Adapter.Attack> Attack=new ArrayList<Attack>();

    String tablename1="TEST";

    String[] values={"10","20","30","40","50","60","7","70","80","09","10","00","56","50","6","55","88","89","66","22"};

    public void datasetup()
    {

        try
        {
            mydb =this.openOrCreateDatabase(tablename1,MODE_PRIVATE,null);

            mydb.execSQL("CREATE TABLE IF NOT EXISTS "+tablename1+ "(COL_NAME VARCHAR2);");

            Toast.makeText(getApplicationContext(),"Database Created",Toast.LENGTH_LONG).show();

        }
        catch (Exception e)
        {
            Log.e("Error","OpenDatabase",e);
        }
        finally {
            mydb.close();
        }

    }

    public void getdata() {

        try {
            mydb = this.openOrCreateDatabase(tablename1, MODE_PRIVATE, null);

            int i;

            int Mlength;

            Mlength=values.length-1;

            for(i=0;i<=Mlength;i++)
            {

                mydb.execSQL("INSERT INTO "+tablename1+" (COL_NAME) VALUES ("+values[i]+");");

            }

            Toast.makeText(getApplicationContext(),"Database Get Data",Toast.LENGTH_LONG).show();

        } catch (Exception e)
        {
            Log.e("Error","GetDatabase",e);
        }
        finally {
            mydb.close();
        }
    }

    public void setdata() {

        try {

            String doit;

            mydb = this.openOrCreateDatabase(tablename1, MODE_PRIVATE, null);

            int count,ii;

            count=0;

            Cursor cursor=mydb.rawQuery("SELECT * FROM "+tablename1,null);

            int i2=cursor.getColumnIndex("COL_NAME");

            count=cursor.getCount();

            cursor.moveToFirst();

            com.example.wagh.recyclertest.Adapter.Attack attack;

            for (ii=1;ii<=count;ii++)
            {
                doit=cursor.getString(i2);

                attack=new Attack();

                attack.setTest(doit);

                Attack.add(attack);

                cursor.moveToNext();

            }


            Toast.makeText(getApplicationContext(),"Database Fetch Data",Toast.LENGTH_LONG).show();

        } catch (Exception e)
        {
            Log.e("Error","SetDatabase",e);
        }
        finally {
            mydb.close();
        }
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.databasepage);

        rvdata=(RecyclerView)findViewById(R.id.rvdata);

        rvdata.setHasFixedSize(true);

        datasetup();

        getdata();

        setdata();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        rvdata.setLayoutManager(linearLayoutManager);

        RecyclerView.Adapter madapter11;

        madapter11=new DatabaseAdapter(Attack);

        rvdata.setAdapter(madapter11);

    }
}
