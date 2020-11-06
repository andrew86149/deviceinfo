package ru.penza.aabr.deviceinfo.criminalIntent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.UUID;

import ru.penza.aabr.deviceinfo.R;

public class CrimeActivity2 {//extends AppCompatActivity {
/*
    public static final String EXTRA_CRIME_ID = "crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId){
        Intent intent = new Intent(packageContext, CrimeActivity2.class);
        intent.putExtra(EXTRA_CRIME_ID,crimeId);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment==null){
            fragment = new FragmentCrime();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }*/
}