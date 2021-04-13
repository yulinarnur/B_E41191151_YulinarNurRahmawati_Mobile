package com.example.praktikumlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Tombol1(View view) {
        Intent intent = new Intent(MainActivity.this, LinearLayout.class);
        startActivity(intent);
    }

    public void Tombol2(View view) {
        Intent btnRelative = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(btnRelative);
    }

    public void Tombol3(View view) {
        Intent btnConstraint = new Intent(MainActivity.this, ConstraintLayout.class);
        startActivity(btnConstraint);
    }

    public void Tombol4(View view) {
        Intent btnFrame = new Intent(MainActivity.this, FrameLayout.class);
        startActivity(btnFrame);
    }

    public void Tombol5(View view) {
        Intent btnTable = new Intent(MainActivity.this, TableLayout.class);
        startActivity(btnTable);
    }

    public void Tombol6(View view) {
        Intent btnMaterial = new Intent(MainActivity.this, MaterialDesign.class);
        startActivity(btnMaterial);
    }

    public void Tombol7(View view) {
        Intent btnScroll = new Intent(MainActivity.this, ScrollView.class);
        startActivity(btnScroll);
    }

    public void Tombol8(View view) {
        Intent btnScrollHor = new Intent(MainActivity.this, ScrollViewHorizontal.class);
        startActivity(btnScrollHor);
    }
}