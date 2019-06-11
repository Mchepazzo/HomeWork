package ru.mardaganiev.task21;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //TODO Проход с 1-ой до последней строки
        for (int i = 0; i < array.length; i++) //1.Пройти с 1-ой до последней строки
            System.out.printf("%d ", array[i]);
        System.out.println(": Проход с 1-ой до последней строки");

        //TODO Проход с 1-го до предпоследнего элемента
        for (int i = 0; i < array.length - 1; i++)
            System.out.printf("%d ", array[i]);

        System.out.println(": Проход с 1-го до предпоследнего элемента");


        System.out.println("В текущую ячейку помещаем значение следующей");
        //TODO 3.В текущую ячейку помещаем значение следующей
        toLeft(array);

        //TODO Последнему элементу присваиваем  другое значение
        int tmp = 0;
        array[8] = array[tmp];
        array[8] = tmp;

        System.out.println("Последнему элементу присваиваем  другое значение: ");
        for (int i = 0; i < array.length; i++)
            System.out.printf("%d ", array[i]);

    }

    private static void toLeft(int[] array) {
        int k = 1; //TODO задаём шаг сдвига
        int[] array2 = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                array2[i] = array[i];
                continue;
            }
            array[i - k] = array[i];
        }
        System.arraycopy(array2, 0, array, array.length - k, k);
        System.out.println(Arrays.toString(array));
    }

}




