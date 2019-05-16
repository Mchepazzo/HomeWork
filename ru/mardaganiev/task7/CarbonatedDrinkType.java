package ru.mardaganiev.task7.Drink;

import ru.mardaganiev.task7.DrinkType;

public enum CarbonatedDrinkType implements DrinkType {
    COCA_COLA("Кока-кола", 80),
    PEPSI("Пепси", 70),
    MIRINDA("Спрайт", 60),
    SEVENUP("Фанта", 50);

    private final String name;
    private final double price;

    CarbonatedDrinkType(String name, int price) {
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

