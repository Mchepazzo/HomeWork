package ru.mardaganiev.task1.Task2;

/**
 * Created by Marat Mardaganiev on 14.04.2019
 * Перевод секунд в часы
 */
import java.util.Scanner;//импорт метода

public class SecondToHoursConverterTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создание метода
        System.out.println("Для перевода количества секунд в часы введите количество секунд и нажмите Enter");
        int a = in.nextInt();//ввод суммы через метод
        float b = (float) a / 3600; //выведены  секунды в часы
        System.out.print(a + " секунд будут равны " + b + " часов"); //вывод результата
    }
}
