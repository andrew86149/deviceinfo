package ru.penza.aabr.deviceinfo.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class DrinkCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1,Drink.drinks);
        listDrinks.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        //super.onListItemClick(listView, itemView, position, id);
        Intent intent = new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO,(int)id);
        //int drinkNo = 2;
        //Intent intent = DrinkActivity.newIntent(DrinkCategoryActivity.this,drinkNo);
        startActivity(intent);
    }
}
