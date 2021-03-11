package com.example.lab_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    private ListView schedule;
    String[] classes = {"German 101", "CSCI320", "CSCI350", "CSCI370", "Japanese202"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schedule = (ListView)findViewById(R.id.class_schedule);
        ArrayAdapter class_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes);
        schedule.setAdapter(class_adapter);

        schedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                String s = (String) adapterView.getItemAtPosition(position);
                displayToast("Works!!!");
                return true;
            }
        });
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}