package com.example.dhrubo.textencryption;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    boolean exit_state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        exit_state = false;
    }

    @Override
    public void onBackPressed() {
        if(exit_state==false) {
            exit_state = true;

            Handler handler = new Handler();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    exit_state = false;
                }
            };
            handler.postDelayed(runnable,1500);

            Toast.makeText(HomeActivity.this, "Press again to exit.", Toast.LENGTH_SHORT).show();
        } else {
            super.onBackPressed();
            finish();
        }
    }
}
