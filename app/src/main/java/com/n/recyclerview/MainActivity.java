package com.n.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.Contactsadapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvOne);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add (new Contacts( "Saugat Malla", "9801122562", R.drawable.saugat));
        contactsList.add (new Contacts ("Rajesh Hamal", "9856321457", R.drawable.rajesh));
        contactsList.add (new Contacts ("Dayang Rai", "9874123658", R.drawable.dahayang));
        contactsList.add (new Contacts ("Bhuwan Kc", "9856321457", R.drawable.bhuwan));

        Contactsadapter contactsadapter = new Contactsadapter(this, contactsList);
        recyclerView.setAdapter(contactsadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
