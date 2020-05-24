package com.kjsingh002.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int image;
    public static Drink[] drinks = {new Drink("Latte","",R.drawable.latte),new Drink("Cappuccino","",R.drawable.cappuccino),new Drink("Filter","",R.drawable.filter)};

    public Drink(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return name;
    }
}
