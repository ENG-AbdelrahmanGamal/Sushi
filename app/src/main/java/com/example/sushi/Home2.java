package com.example.sushi;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.sushi.databinding.ActivityHome2Binding;

public class Home2 extends AppCompatActivity {
    ActivityHome2Binding binding;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(Home2.this, R.layout.activity_home2);

drawerLayout=findViewById(R.id.drawer_layout);

        }
public void ClickMenue(View view)
{
    openDrawer(drawerLayout);

}

    private static void openDrawer(DrawerLayout drawerLayout) {

        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void clickLogo(View view)
    {
        closeDrawer( drawerLayout);
    }

    private static void closeDrawer(DrawerLayout drawerLayout) {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
    }
    public void clickHome(View view)
    {
        recreate();
    }
    public void clickDash(View view)
    {
        redirectActivity(this,DrawerLayout.class);

    }

    private static void redirectActivity(Activity activity,Class classs) {

        Intent intent=new Intent(activity,classs);
        activity.startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optinal_menue,menu);
        return super.onCreateOptionsMenu(menu);
    }

    }
