package ru.mardaganiev.InterfaceOfAnimals;

public class Fish extends Animals implements CanSwim{
    @Override
    public void getNames() {
        System.out.print("Меня зовут Рыба");
    }

    @Override
    public void canSwim() {
        System.out.println(" и я умею только плавать(((");
    }
}
