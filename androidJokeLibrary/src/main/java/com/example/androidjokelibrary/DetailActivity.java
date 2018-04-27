package com.example.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView jokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();

        if(intent!=null && intent.hasExtra(Intent.EXTRA_TEXT)){

            String jokeString = intent.getStringExtra(Intent.EXTRA_TEXT);

            jokeTextView.setText(jokeString);


        }
    }
}
