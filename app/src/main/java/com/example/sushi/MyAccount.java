package com.example.sushi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.sushi.databinding.ActivityMyAccountBinding;
import com.example.sushi.databinding.ActivityMyAccountBindingImpl;

public class MyAccount extends AppCompatActivity {
ActivityMyAccountBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_my_account);
    }
}