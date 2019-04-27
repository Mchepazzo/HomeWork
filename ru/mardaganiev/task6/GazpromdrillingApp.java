package ru.mardaganiev.task6;

import ru.mardaganiev.Person;

import java.time.LocalDate;

public class GazpromdrillingApp {
    public static void main(String[] args) {
        Worker rodion = new Worker("Родион", "Бесчастных", LocalDate.now());
        rodion.setPersonnelNumber(2065);
        Worker danila = new Worker("Данила", "Грунин", LocalDate.now());
        danila.setPersonnelNumber(2066);

        DrillingBrigada ngkm10 = new DrillingBrigada();
        RigShop numberOne =  new RigShop();
        RigShop numberTwo =  new RigShop();

        numberOne.setWorkers(new Worker[]{rodion});
        numberTwo.setWorkers(new Worker[]{danila});
        ngkm10.getRigShops(new RigShop[]{numberOne});
        ngkm10.getRigShops(new RigShop[]{numberTwo});

        System.out.println(ngkm10);
        System.out.println(numberTwo);
        System.out.println(rodion);
        System.out.println(danila);


    }
}
