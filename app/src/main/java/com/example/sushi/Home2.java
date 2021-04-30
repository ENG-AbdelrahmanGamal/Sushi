package com.example.sushi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.Menu;

import com.example.sushi.databinding.ActivityHome2Binding;

public class Home2 extends AppCompatActivity {
    ActivityHome2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(Home2.this, R.layout.activity_home2);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optinal_menue,menu);
        return super.onCreateOptionsMenu(menu);
    }
    }
