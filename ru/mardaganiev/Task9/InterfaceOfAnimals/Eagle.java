package ru.mardaganiev.InterfaceOfAnimals;

public class Eagle extends Animals implements CanRun, CanSwim, Flyeble {
    @Override
    public void getNames() {
        System.out.print ("Меня зовут Oрёл");
    }

    @Override
    public void run() {

        System.out.print(" и я бегаю в припрыжку когда на земле,");
    }

    @Override
    public void canSwim() {
        System.out.print(" плываю же только по необходимости, если упаду в воду.");
    }

    @Override
    public void fly() {
        System.out.print(" в отличии от всех вас- еще и летать умею,");
    }
}
