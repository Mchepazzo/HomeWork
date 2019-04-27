package ru.mardaganiev.task1;

/**
 * Created by Marat Mardaganiev on 12.04.2019
 * Подсчёт заработной платы на руки после вычета НДФЛ
 */


public class WagesAreATaxDeduction {
    public static void main(String[] args) {
        double a = 59125; //заработная плата
        double b = 13; // величина НДФЛ
        double c = a - ((a / 100) * b); // заработная плата " на руки "
        System.out.println(c = a - ((a / 100) * b));

    }
}