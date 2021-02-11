package bupaljr.com.fikzar.handyman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import bupaljr.com.fikzar.R;
import bupaljr.com.fikzar.customer.AccountActivity;
import bupaljr.com.fikzar.customer.ChatsActivity;
import bupaljr.com.fikzar.customer.JobsActivity;
import bupaljr.com.fikzar.customer.SearchActivity;

public class HandymanDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handyman_dashboard);


        // Initialize variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perform ItemSelectedListener bottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
//                        startActivity(new Intent(getApplicationContext()
//                                , HandymanDashboard.class));
//                        overridePendingTransition(0, 0);
//                        return true;
                    case R.id.jobs:
                        startActivity(new Intent(getApplicationContext()
                                , HandymanJobs.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.packs:
                        startActivity(new Intent(getApplicationContext()
                                , HandymanPacks.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.chats:
                        startActivity(new Intent(getApplicationContext()
                                , HandymanChats.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext()
                                , HandymanAccount.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}