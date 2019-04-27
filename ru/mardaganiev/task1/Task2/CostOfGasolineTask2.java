package ru.mardaganiev.task1.Task2;

/**
 * Created by Marat Mardaganiev on 14.04.2019
 * Расчёт стоимости бензина
 */
import java.util.Scanner;//импорт метода
public class CostOfGasolineTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создание метода
        System.out.println("Введите количество литров (целое число) и нажмите Enter");
        int a = in.nextInt();//ввод количества литров через консоль
        System.out.print("Введите стоимость одного литра бензина (копейки через запятую)  и нажмите Enter");
        float b = in.nextFloat();// ввод стоимости бензина в консоли
        float c = a * b;//вычисление стоимости  бензина
        System.out.print("Стоимость заправленного бензина составила " + c + " рублей");//вывод результата
    }
}

