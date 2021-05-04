package com.example.sushi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.sushi.databinding.ActivityHomeBinding;
public class Home extends AppCompatActivity {
ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
binding= DataBindingUtil.setContentView(this,R.layout.activity_home);
binding.signButtonSign.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
     Intent intent=new Intent(Home.this,SignIn.class);
     startActivity(intent);
    }
});

binding.signButtonRegister.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

            Intent intent=new Intent(Home.this,Register.class);
            startActivity(intent);

    }
});
    }
}