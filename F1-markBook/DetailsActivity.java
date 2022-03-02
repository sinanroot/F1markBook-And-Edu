package com.example.f1markbook;

import static com.example.f1markbook.MainActivity.chosenF1mark;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.f1markbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent intent = getIntent();



        //Casting
       // F1mark selectedF1mark = (F1mark) intent.getSerializableExtra("f1mark");

        //F1mark selectedF1mark = chosenF1mark;

        Singleton singleton = Singleton.getInstance();
        F1mark selectedF1mark = singleton.getSendF1mark();


        binding.nameText.setText(selectedF1mark.name);
        binding.countryText.setText(selectedF1mark.country);
        binding.imageView.setImageResource(selectedF1mark.image);





    }
}