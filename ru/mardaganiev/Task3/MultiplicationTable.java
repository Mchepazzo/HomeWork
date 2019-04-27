package ru.mardaganiev.Task3;

/**
 * Created by Marat Mardaganiev on 18.04.2019
 * Вывод таблицы умножения для чисел от 1 до 10
 */

public class MultiplicationTable {

    public static void main(String... args) {
        for (int i = 1; i < 11; i++) {
            for (int k = 1; k < 11; k++) {
                System.out.print(k * i + " ");
            }
            System.out.println(" ");
        }
    }
}