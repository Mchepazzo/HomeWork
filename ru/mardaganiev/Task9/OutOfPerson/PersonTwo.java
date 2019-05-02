package ru.mardaganiev.task9.OutOfPerson;

public class PersonTwo extends AdstractOfPerson implements CanRun, CanSwim  {
    @Override
    public void swimBreaststroke() {
        System.out.println("Я тоже брасом плаваю");

    }

    @Override
    public void swimCrawl() {
        System.out.println("Я тоже кролем плаваю");

    }

    @Override
    public void run() {
        System.out.println("Я тоже бегаю");

    }

    @Override
    public void highSpeedRun() {
        System.out.println("Я тоже очень быстро бегаю");

    }
}
