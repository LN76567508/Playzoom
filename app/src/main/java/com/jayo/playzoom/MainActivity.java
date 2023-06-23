package com.jayo.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jayo.playzoom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
   // private Button btnGetStarted;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetStarted.setOnClickListener(v -> {
            Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
        });
        binding.txtMoview.setText("Siente la 3UPH0R14");
//        setContentView(R.layout.activity_main);
//        btnGetStarted = findViewById(R.id.btn_get_started);
//        btnGetStarted.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Comenzar", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}