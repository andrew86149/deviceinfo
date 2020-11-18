package ru.penza.aabr.deviceinfo.starbuzz;

public class Workout {

    private  String name;
    private String description;

    public static  final Workout[] workouts = {
            new Workout("The Limb Loosener","5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony","15 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("The Wimp Special","25 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Strength and Length","35 Handstand push-ups\n10 1-legged squats\n15 Pull-ups")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
