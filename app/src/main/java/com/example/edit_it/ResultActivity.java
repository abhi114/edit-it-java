package com.example.edit_it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.edit_it.databinding.ActivityMainBinding;
import com.example.edit_it.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.image.setImageURI(getIntent().getData());
    }
}