package com.example.joketelling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE = "joke";
    private static final String TAG = JokeActivity.class.getSimpleName();
    private TextView mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        setTitle("Joke");

        mJoke = findViewById(R.id.tv_joke);

        Bundle extras = getIntent().getExtras();
        String  joke = (String) extras.get(JOKE);

        Log.d(TAG, "Joke is: " + joke);

        if(joke != null && !joke.isEmpty()){
            mJoke.setText(joke);
        }
    }
}
