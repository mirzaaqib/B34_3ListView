package com.pallefire.b34_3listview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    //ListView lv1;
    ArrayAdapter<String> a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       // lv1 = (ListView) findViewById(R.id.lv);
        String[] str= {"AQIB","SATYA","MANAS","VIPIN","AB OSAMA","HEMANTH","KUNDAN","SOORAJ"};
        a = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);


        //lv1.setAdapter(a);
        setListAdapter(a);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this, "The Item is "+a.getItem(position), Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);

    }
}
//for optimize the code  instead of passing the str directly pass this string array

   // new String[]{"AQIB","SATYA","MANAS","VIPIN","AB OSAMA","HEMANTH","KUNDAN","SOORAJ"});