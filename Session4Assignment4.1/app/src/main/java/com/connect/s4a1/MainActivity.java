package com.connect.s4a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {



    Button btn_asc,btn_des;
    ListView list;
    ArrayList months = new ArrayList();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_asc= (Button) findViewById(R.id.btn_asc);
        btn_des= (Button) findViewById(R.id.btn_des);
        list=(ListView)findViewById(R.id.listview);

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        list.setAdapter(new ArrayAdapter<ArrayList>(MainActivity.this,android.R.layout.simple_list_item_1,months));

        btn_asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(months);


            }
        });
        btn_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(months, Collections.reverseOrder());


            }
        });

    }
}
