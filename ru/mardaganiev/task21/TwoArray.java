package ru.mardaganiev.task21;

import javax.swing.text.View;
import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        System.out.println("1.Проход с 1-ой до последней строки (первый способ):\n-----------------------------------" +
                "-----------------\n" + Arrays.deepToString(matrix));//применяем метод deepToString класса Arrays
        System.out.println("1.Проход с 1-ой до последней строки (второй способ):\n-----------------------------------" +
                "-----------------");
        for (int i = 0; i < 3; i++) {//идём по строкам
            for (int j = 0; j < 3; j++) {//идём по столбцам
                System.out.print(matrix[i][j] + "\t");//выводим элементы

            }
            System.out.println();// вывод пустой строки для визуализации массиваv
        }
        System.out.println("2.Проход с 1-го до предпоследнего элемента:\n-------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i ].length; j++) {

                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

