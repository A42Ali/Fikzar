package bupaljr.com.fikzar.customer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import bupaljr.com.fikzar.R;
import bupaljr.com.fikzar.StartChatActivity;

public class DisplaySearch extends AppCompatActivity {


    ImageView chat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_search);

        chat2 = findViewById(R.id.chat_2);

        chat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisplaySearch.this, StartChatActivity.class));
            }
        });

    }
}