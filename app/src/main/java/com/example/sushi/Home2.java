package com.example.sushi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.sushi.databinding.ActivityHome2Binding;
import com.google.android.material.navigation.NavigationView;

public class Home2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ActivityHome2Binding binding;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(Home2.this, R.layout.activity_home2);
drawerLayout=binding.DrawerLayout;
navigationView=binding.navigationView;
toolbar=binding.toolsbar;
//   *************************** Navigation Drawer ***************************
        navigationView.bringToFront();
ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.navigaton_open,R.string.navigaton_close);
drawerLayout.addDrawerListener(toggle);
toggle.syncState();
navigationView.setNavigationItemSelectedListener(this);


        }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else {
            super.onBackPressed();
        }
    }
    public void openHome(){

    }
    public void openOrder(){

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.home2_menue_home:
            {
                Intent intent=new Intent(Home2.this,Home3.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_order:
            {
                Intent intent=new Intent(Home2.this,Order.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_Mnue:
            {
                Intent intent=new Intent(Home2.this,Menue.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_restaurant:
            {
                Intent intent=new Intent(Home2.this,Restaurant.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_favorites:
            {
                Intent intent=new Intent(Home2.this,Favorites.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_myCard:
            {
                Intent intent=new Intent(Home2.this,MyCard.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_myAccount:
            {
                Intent intent=new Intent(Home2.this,MyAccount.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_aboutUs:
            {
                Intent intent=new Intent(Home2.this,AboutUS.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_contactUS:
            {
                Intent intent=new Intent(Home2.this,ContactsUs.class);
                startActivity(intent);
                break;
            }
            case R.id.home2_menue_Terms_and_conditions:
            {
                Intent intent=new Intent(Home2.this,TermsAndConditions.class);
                startActivity(intent);
                break;
            }


        }
        return true;
    }
}
