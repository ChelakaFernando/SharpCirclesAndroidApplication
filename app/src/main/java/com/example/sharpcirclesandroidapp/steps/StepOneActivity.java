package com.example.sharpcirclesandroidapp.steps;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.sharpcirclesandroidapp.R;

public class StepOneActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steppages);
        TextView stepheding = (TextView)findViewById(R.id.Stepheding);
        Intent intent = getIntent();
        String stepname = intent.getExtras().getString("Stepname");
        String stepnum = intent.getExtras().getString("Stepnum");

        stepheding.setText(stepname);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(stepnum);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
