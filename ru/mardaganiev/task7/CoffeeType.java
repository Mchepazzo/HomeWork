package ru.mardaganiev.task7.Drink;

import ru.mardaganiev.task7.DrinkType;

public enum CoffeeType implements DrinkType {
    LATTE("Латте", 100),
    AMERICANO("Американо", 80),
    CAPPUCINO("Капучино", 60);

    private final String name;
    private final double price;

    CoffeeType(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    }