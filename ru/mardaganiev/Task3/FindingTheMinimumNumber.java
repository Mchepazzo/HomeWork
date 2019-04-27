package ru.mardaganiev.Task3;

/**
 * Created by Marat Mardaganiev on 18.04.2019
 * Вывод минимального из двух чисел
 */

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class FindingTheMinimumNumber {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); //создание метода
        System.out.println("Для того чтобы узнать наименьшее из двух числе сначала введите первое число и нажмите" +
                " Enter");
        float a = in.nextFloat();
        System.out.println("Введите второе число и нажмите вновь Enter");
        float b = in.nextFloat();
        System.out.print("из двух введённых чисел " + (Math.min(a, b)) + " меньше");

    }
}
