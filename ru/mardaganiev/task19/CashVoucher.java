package mardaganiev.ru;


import java.io.*;
import java.util.Scanner;


public class CashVoucher {
    public static void main(String[] args) throws IOException {
        FileOutputStream read = new FileOutputStream(new File("C:/Users/Mchepazzo/Downloads/out.txt"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(read);
        outputStreamWriter.write("C:/Users/Mchepazzo/Downloads/out.txt");
        Scanner scanner = new Scanner(new FileInputStream(new File("C:/Users/Mchepazzo/Downloads/out.txt")));

        try (FileReader fr = new FileReader("C:/Users/Mchepazzo/Downloads/products.txt");
             Scanner scanner1 = new Scanner(fr);
             FileWriter fw = new FileWriter("C:/Users/Mchepazzo/Downloads/out.txt");) {

            float total = 0;

            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                boolean isNextFloat = scanner.hasNextFloat();
                float quantity = scanner.nextFloat();
                float price = scanner.nextFloat();
                scanner.nextLine();
                if ("q".equals(name)) {
                    break;
                }
                if (isNextFloat) {
                    System.out.printf("%s\n %f\n %f = %f\n", name, quantity, price, quantity * price);
                } else {
                    System.out.printf("%s\n %d\n %f = %f\n", name, quantity, price, quantity * price);
                }
                total += quantity * price;
            }
            System.out.printf("total: = %f\n", total);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
