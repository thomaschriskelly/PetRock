package com.example.tokel.petrock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pet(View view) {
        // feed
        Toast toast = Toast.makeText(view.getContext(), "You pet the rock", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void feed(View view) {
        // feed
        Toast toast = Toast.makeText(view.getContext(), "You can't feed it. It's a rock!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void train(View view) {
        // feed
        Toast toast = Toast.makeText(view.getContext(), "You can't train it. It's a rock!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
git