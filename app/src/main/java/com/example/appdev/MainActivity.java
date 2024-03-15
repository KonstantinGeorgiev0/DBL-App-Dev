package com.example.appdev;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupDashboard();

//        BottomNavigationView navView = findViewById(R.id.navigation);
//        navView.setOnItemSelectedListener(item -> {
//            int itemId = item.getItemId();
//            if (itemId == R.id.navigation_matching) {
//                // Handle navigation for Matching
//            } else if (itemId == R.id.navigation_schedule) {
//                // Handle navigation for Schedule
//            } else if (itemId == R.id.navigation_profile) {
//                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
//                startActivity(intent);
//            }
//            return true; // Return true to display the item as the selected item
//        });
    }

    private void setupDashboard() {
        String[] titles = {"Matching", "Schedule", "Provide Help", "Seek Help", "Profile"};
        int[] icons = {
                R.drawable.ic_match,
                R.drawable.ic_schedule,
                R.drawable.ic_provide_help,
                R.drawable.ic_seek_help,
                R.drawable.ic_profile
        };

        int[] itemIds = {R.id.matching, R.id.schedule, R.id.provide_help, R.id.seek_help, R.id.profile};

        for (int i = 0; i < itemIds.length; i++) {
            TextView item = findViewById(itemIds[i]);
            item.setText(titles[i]);
            // Set the compound drawable on the start of the text
            item.setCompoundDrawablesWithIntrinsicBounds(icons[i], 0, 0, 0);
        }
    }
}
