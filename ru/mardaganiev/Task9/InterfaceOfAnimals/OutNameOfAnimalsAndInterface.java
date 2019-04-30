package ru.mardaganiev.InterfaceOfAnimals;

public class OutNameOfAnimalsAndInterface {
    public static void main(String[] args) {

        Animals tiger = new Tiger();
        Animals fish = new Fish();
        Animals fox = new Fox();
        Animals eagle = new Eagle();
        System.out.println("Ниже наши объекты будут раскажут как их зовут- для этого задействованы " +
                "Абстракции. Так же они расскажут что умеют- в плане способности бегать, плавать или летать. " +
                "Эту споосбность они имеют благодаря Интерфейсам ");

        tiger.getNames();
        tiger.run();
        tiger.canSwim();

        fox.getNames();
        fox.run();
        fox.canSwim();

        fish.getNames();
        fish.canSwim();

        eagle.getNames();
        eagle.run();
        eagle.fly();
        eagle.canSwim();


    }
}