package ru.mardaganiev.task8;

/**
 * Created by Marat Mardaganiev on 26.04.2019
 * Cчетчик количества создаваемых объектов.
 */

public class HowManyObjects {

    public static void main(String[] args) {
        B oneObject = new B();
        System.out.println("Создан объект №: " + B.count);
        B twoObject = new B();
        System.out.println("Создан объект №: " + B.count);

        B threeObject = new B();
        System.out.println("Создан объект №: " + B.count);

        B fourObject = new B();
        System.out.println("Создан объект №: " + B.count);

        B fiveObject = new B();
        System.out.println("Создан объект №: " + B.count);

        B sixObject = new B();
        System.out.println("Создан объект №: " + B.count);

        B sevenObject = new B();
        System.out.println("Создан объект №: " + B.count);
    }

}

class B {

    static int count;

    B() {
        count++;
        System.out.println("Всего создано "+ count + " объектов");
    }
}