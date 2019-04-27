package ru.mardaganiev.task6;

import java.util.Arrays;

public class DrillingBrigada {
    private String title;
    private RigShop[] rigShops = new RigShop[5];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RigShop[] getRigShops(RigShop[] rigShops) {
        return this.rigShops;
    }

    public void setRigShops(RigShop[] rigShops) {
        this.rigShops = rigShops;
    }

    @Override
    public String toString() {
        return "DrillingBrigada{" +
                "title='" + title + '\'' +
                ", rigShops=" + Arrays.toString(rigShops) +
                '}';
    }
}
