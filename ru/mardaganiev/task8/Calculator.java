package ru.mardaganiev.task8;
/**
 * Created by Marat Mardaganiev on 27.04.2019
 * Калькулятор
 * Для ввода десятичных цифр необходимо использовать "."
 * Для сложения, вычитания, деления, умножения применяем соответсвующие символы с клавиатуры
 * Для нахождения процента сначала вводим число от которого нужно найти процент, затем вводим символ "%" и вводим
 * величину процента который необходимо вычислить
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calculator {


    public static void main(String[] args) throws Exception {
        BufferedReader button = new BufferedReader(new InputStreamReader(System.in));

        String f = button.readLine();
        float aFloat = Float.parseFloat(f);
        String act = button.readLine();
        String s = button.readLine();

        float bFloat = Float.parseFloat(s);
        float res = 0;

        if (act.equals("+")) {
            res = aFloat + bFloat;
        }

        if (act.equals("-")) {
            res = aFloat - bFloat;
        }

        if (act.equals("*")) {
            res = aFloat * bFloat;
        }

        if (act.equals("/")) {
            res = aFloat / bFloat;
        }

        if (act.equals("%")) {
            res = ((aFloat / 100) * bFloat);
        }
        System.out.println(res);
    }
}