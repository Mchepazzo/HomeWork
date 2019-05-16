package ru.mardaganiev.task7;

import ru.mardaganiev.task7.Drink.CarbonatedDrinkType;
import ru.mardaganiev.task7.Drink.DrinkType;
import ru.mardaganiev.task7.Drink.CoffeeType;
import ru.mardaganiev.task7.Drink.Product;

import java.util.concurrent.ArrayBlockingQueue;

public class VendingMachine {
    private double money = 0;
    private Product[] drinks = new Product[]{
            new Product(CarbonatedDrinkType.COCA_COLA, 20),
            new Product(CarbonatedDrinkType.PEPSI, 30),
            new Product(CarbonatedDrinkType.MIRINDA, 40),
            new Product(CarbonatedDrinkType.SEVENUP, 50),
            new Product(CoffeeType.LATTE, 60),
            new Product(CoffeeType.AMERICANO, 70),
            new Product(CoffeeType.CAPPUCINO, 80)
    };

    public double addMoney(double money) {
        this.money += money;
        return this.money;
    }

    public DrinkType giveMeADrink(int key) throws InterruptedException {
        if (!isKeyValid(key)) {
            return null;
        }
        ArrayBlockingQueue<Object> selected = null;
        assert selected != null;
        DrinkType drink = (DrinkType) selected.take();
        money -= drink.getPrice();
        return drink;
    }

    public String[] getDrinkTypes() {
        String[] result = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            result[i] = String.format("%d - %12s: %6.2f ру", i, drinks[i].getName(), drinks[i].getPrice);
        }
        return result;
    }

    private boolean isMoneyEnought(Product selected) {
        return money >= selected.getPrice();
    }

    private boolean isKeyValid(int key) {
        return key >=0 && key < drinks.length;
    }

    public double getChange() {
        double money = this.money;
        this.money = 0;
        return money;
    }
}
