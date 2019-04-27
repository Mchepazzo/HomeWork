package ru.mardaganiev.Task3;
/**
 * Created by Marat Mardaganiev on 18.04.2019
 * Получение описания числа- чётное оно или не чётное, нулевое или нет, положительное или отрицательное
 */

import java.util.Scanner;

public class DescriptionOfTheEnteredNumber {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); //создание метода
        String res = "";
        System.out.println("Для того чтобы узнать число - отрицательное, положительно или же нулевое введите его" +
                " значение и нажмите Enter");
        float a = in.nextFloat();
        if (a > 0) res = " положительное ";
        if (a < 0) res = " отрицательное";
        if (a == 0) res = " нулевое, сам ноль не может быть не больше, не меньше себя, а следовательно он не относи" +
                "тся ни к положительным, ни к отрицательным числам";
        if (a % 2 == 0) {
            System.out.print("Число четное и");
        } else {
            System.out.print("Число нечетное и");
        }

        System.out.print(res);

    }
}

