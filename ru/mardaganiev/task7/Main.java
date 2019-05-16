package ru.mardaganiev.task7;

import ru.mardaganiev.task7.Drink.DrinkType;

import java.util.Scanner;

public class Main {
    private static VendingMachine vm = new VendingMachine();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Наши напитки: ");
        for (String line : vm.getDrinkTypes()){
            System.out.println(line);
        }
        Scanner scan = new Scanner(System.in);
        printHelp();
        while (scan.hasNext()) {
            String command = scan.next();
            switch (command) {
                case "add": {
                    int money = scan.nextInt();
                    processAddMoney(money);
                    break;
                }
                case "get": {
                    int key = scan.nextInt();
                    processGetDrink(key);
                    break;
                }
                case "end": {
                    processEnd();
                    return;
                }
                default:
                    System.out.println("Команда не определена");
            }
            scan.nextLine();
        }
    }
    private static void processAddMoney(int money) {
        System.out.println("Текvщий баланс" + vm.addMoney(money));
    }
    private static void processGetDrink(int key) throws InterruptedException {
        DrinkType drinkType = vm.giveMeADrink(key);
        if (drinkType != null) {
            System.out.println("Получите Ваш " + drinkType.getName() + "!");
        }else {
            System.out.println("Проблемы");
    }

}
    private static void processEnd() {
        System.out.println("Ваша сдача" + vm.getChange());
    }
    private static void printHelp() {
        System.out.println("Введите 'add <количество >' для ввода денег");
        System.out.println("Введите 'get <код напитка >' для получения напитка");
        System.out.println("Введите 'end' для получения сдачи и выхода из программы");}
}