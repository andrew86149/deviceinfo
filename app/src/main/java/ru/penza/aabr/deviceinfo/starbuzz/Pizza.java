package ru.penza.aabr.deviceinfo.starbuzz;

import ru.penza.aabr.deviceinfo.R;

public class Pizza {
    private String name;
    private int inageResourceId;
    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi",R.drawable.funghi)
    };

    public Pizza(String name, int inageResourceId) {
        this.name = name;
        this.inageResourceId = inageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getInageResourceId() {
        return inageResourceId;
    }
}
