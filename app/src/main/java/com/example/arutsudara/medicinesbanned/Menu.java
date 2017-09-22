package com.example.arutsudara.medicinesbanned;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by arutsudar.a on 27-09-2015.
 */
public class Menu extends ListActivity {

    String medicinesList[] = {"Astemizole and terfinadine","Fenfluramine and dexfenfluramine","Gatifloxacin","Phenformin","rimonabant","Rofecoxib and valdecoxib","rosiglitazone","sibutramine","tegaserod","terfenadine","valdecoxib"};
    int[] elements = {R.string.e1,R.string.e2,R.string.e3,R.string.e4,R.string.e5,R.string.e6,
        R.string.e7,R.string.e8,R.string.e9,R.string.e10,R.string.e11};
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1,medicinesList));


     }
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l,v,position,id);
        Integer bread=elements[position];
        Integer bread1=position;
        Bundle extras=new Bundle();
        extras.putInt("key",bread);
        extras.putInt("position",bread1);
        Intent i= new Intent(this, com.example.arutsudara.medicinesbanned.Page3.class);
        i.putExtras(extras);
        startActivity(i);
    }
}
