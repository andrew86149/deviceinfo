package ru.penza.aabr.deviceinfo.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ru.penza.aabr.deviceinfo.R;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";
    //public static final String EXTRA_DRINKNO = "ru.penza.aabr.deviceinfo.starbuzz.drinkNo";
/*
    public static Intent newIntent(Context context,int drinkNo){
        Intent intent = new Intent(context,DrinkActivity.class);
        intent.putExtra(EXTRA_DRINKNO,drinkNo);
        return intent;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //int drinkNo = (Integer) getIntent().getExtras().get("EXTRA_DRINKNO");
        int drinkNo = getIntent().getIntExtra("EXTRA_DRINKNO",0);

        Drink drink = Drink.drinks[drinkNo];

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}