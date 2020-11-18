package ru.penza.aabr.deviceinfo.starbuzz;

import ru.penza.aabr.deviceinfo.R;

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte","A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino","Espresso, couple of espresso shots with steamed milk", R.drawable.cappuccino),
            new Drink("Filter","Highest couple of espresso shots with steamed milk", R.drawable.filter)
    };

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
