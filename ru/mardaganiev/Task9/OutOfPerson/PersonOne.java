package ru.mardaganiev.task9.OutOfPerson;

public class PersonOne extends AdstractOfPerson implements CanRun, CanSwim  {
    @Override
    public void swimBreaststroke() {
        System.out.println("Плаваю брасом");

    }

    @Override
    public void swimCrawl() {
        System.out.println("Плаваю кролем");

    }

    @Override
    public void run() {
        System.out.println("Я бегаю");

    }

    @Override
    public void highSpeedRun() {
        System.out.println("Очень  быстро бегаю");

    }
}
