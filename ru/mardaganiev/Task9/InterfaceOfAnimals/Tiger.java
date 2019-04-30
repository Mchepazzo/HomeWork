package ru.mardaganiev.InterfaceOfAnimals;

public class Tiger extends Animals implements CanRun, CanSwim  {
    @Override
    public void getNames() {
        System.out.print("Mеня зовут Тигр");
    }

    @Override
    public void run() {
        System.out.print(" и я бегаю быстрее всех, ");
    }

    @Override
    public void canSwim() {
        System.out.println("плаваю через реку.");
    }
}
