package com.jayo.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.jayo.playzoom.databinding.ActivityNewPrincipalBinding;

public class NewPrincipalActivity extends AppCompatActivity {
    private ActivityNewPrincipalBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityNewPrincipalBinding.inflate(getLayoutInflater());
        new CountDownTimer(3000,1000) {
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish(){
                Intent intent = new Intent(NewPrincipalActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        }.start();
        setContentView(R.layout.activity_new_principal);
    }
}