package ru.mardaganiev.InterfaceOfAnimals;

public class Fox extends Animals implements CanRun, CanSwim {
    @Override
    public void getNames() {
            System.out.print("Mеня зовут Лиса");
        }

    @Override
    public void run() {
        System.out.print(" и я целыми днями бегаю за колобком, ");
    }

    @Override
    public void canSwim() {
        System.out.println("плаваю же только когда спасаюсь от охотника!");
    }
}

