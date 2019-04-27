package ru.mardaganiev.Task3;

/**
 * Created by Marat Mardaganiev on 18.04.2019
 * Проверка "Арифметическая ли прогрессия"
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOfArithmeticProgression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Сколько чисел? ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Введите число: ");
            list.add(sc.nextInt());
        }

        System.out.println("последовательность арифметическая? " + isArifmethicProgression(list));
    }

    public static boolean isArifmethicProgression(List enterList) {
        List<Integer> list = enterList;

        // Проверка прогрессий
        int temp = 0;
        int temp2 = 0;
        temp = list.get(1) - list.get(0);
        for (int i = 1; i < list.size(); i++) {
            temp2 = list.get(i) - list.get(i - 1);
            if (temp2 != temp) {
                return false;
            }

        }
        return true;
    }
}