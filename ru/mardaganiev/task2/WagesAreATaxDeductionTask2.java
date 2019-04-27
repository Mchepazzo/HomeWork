package ru.mardaganiev.task1.Task2;

/**
 * Created by Marat Mardaganiev on 14.04.2019
 * Подсчёт заработной платы на руки после вычета НДФЛ
 */
import java.util.Scanner;//импорт метода

public class WagesAreATaxDeductionTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //создание метода
        System.out.println("Введите начисленную сумму (копейки через запятую) и нажмите Enter");//вывод запроса о
        // вооде данных
        float a = in.nextFloat();//ввод суммы через метод
        int b = 13; // величина НДФЛ
        float c = (float) (a - ((a / 100) * b)); // заработная плата " на руки "
        System.out.print("Ваша заработная плата после вычета НДФЛ составит " + (c = a - ((a / 100) * b)) + " рублей");
        //коментарий в консоль
    }
}