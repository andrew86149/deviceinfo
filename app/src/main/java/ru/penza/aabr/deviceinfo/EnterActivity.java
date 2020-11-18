package ru.penza.aabr.deviceinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ru.penza.aabr.deviceinfo.criminalIntent.CrimeListActivity;
import ru.penza.aabr.deviceinfo.photogallery.PhotoGalleryActivity;
import ru.penza.aabr.deviceinfo.starbuzz.StopwatchActivity;
import ru.penza.aabr.deviceinfo.starbuzz.TopLevelActivity;
import ru.penza.aabr.deviceinfo.starbuzz.WorkoutActivity;

public class EnterActivity extends AppCompatActivity {

    private Button mButton;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        mButton = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);
        mButton5 = findViewById(R.id.button5);
        mButton6 = findViewById(R.id.button6);
        mButton7 = findViewById(R.id.button7);

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnterActivity.this, WorkoutActivity.class);
                startActivity(intent);
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnterActivity.this, StopwatchActivity.class);
                startActivity(intent);
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnterActivity.this, TopLevelActivity.class);
                startActivity(intent);
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnterActivity.this, CrimeListActivity.class);
                startActivity(intent);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnterActivity.this, PhotoGalleryActivity.class);
                startActivity(intent);
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EnterActivity.this,"Test",Toast.LENGTH_SHORT).show();
            }
        });
    }
}