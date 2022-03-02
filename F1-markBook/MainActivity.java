package com.example.f1markbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.f1markbook.databinding.ActivityDetailsBinding;
import com.example.f1markbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<F1mark> f1markArrayList;
    private ActivityMainBinding binding;
    static F1mark chosenF1mark;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        f1markArrayList = new ArrayList<>();


        //Data

        F1mark mercedes = new F1mark("Mercedes", "Germany", R.drawable.mercedes);
        F1mark ferrari = new F1mark("Ferrari", "Italy", R.drawable.ferrari);
        F1mark redbull = new F1mark("RedBull", "Austria", R.drawable.redbull);
        F1mark amr = new F1mark("Aston-Martin", "England", R.drawable.amr);

        f1markArrayList.add(mercedes);
        f1markArrayList.add(ferrari);
        f1markArrayList.add(redbull);
        f1markArrayList.add(amr);


        //Bitmap
        Bitmap amrBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.amr);



        binding.recycleView.setLayoutManager(new LinearLayoutManager(this));
        F1markAdapter f1markAdapter = new F1markAdapter(f1markArrayList);
        binding.recycleView.setAdapter(f1markAdapter);


        /*
        //Adapter
            //ListView


        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                f1markArrayList.stream().map(f1mark -> f1mark.name).collect(Collectors.toList())

        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Toast.makeText(MainActivity.this, f1markArrayList.get(i).name, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("f1mark", f1markArrayList.get(i));
                startActivity(intent);


            }
        }));

        */







    }
}