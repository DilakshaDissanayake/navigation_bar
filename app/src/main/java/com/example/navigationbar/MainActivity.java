package com.example.navigationbar;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navigationbar.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.navigationbar.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "PlaceHolder", Toast.LENGTH_SHORT).show());

        navView.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navigation_home) {
                showToast("Home");
                return true;
            } else if (item.getItemId() == R.id.navigation_search) {
                showToast("Search");
                return true;
            } else if (item.getItemId() == R.id.navigation_account) {
                showToast("Account");
                return true;
            } else if (item.getItemId() == R.id.navigation_setting) {
                showToast("Settings");
                return true;
            }
            return false;
        });

    }

    private void showToast(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();
    }



    }

