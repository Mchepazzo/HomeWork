package ru.mardaganiev.task9.OutOfPerson;

public class InfoPerson{
    public static void main(String[] args) {

        PersonOne John = new PersonOne();
        PersonTwo Robert = new PersonTwo();

        System.out.println("------------");

        John.highSpeedRun();
        Robert.highSpeedRun();

        System.out.println("------------");

        John.run();
        Robert.run();

        System.out.println("------------");

        John.swimCrawl();
        Robert.swimCrawl();

        System.out.println("------------");

        John.swimBreaststroke();
        Robert.swimBreaststroke();

    }
}
