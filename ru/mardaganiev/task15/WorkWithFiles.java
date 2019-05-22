package ru.mardaganiev.task15;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class WorkWithFiles {
    public static void main(String[] args) {
        System.out.println("==Создание файла==");

        File file = new File("C:/Users/DNS/Downloads/Учёба Java/Занятия/Task15/temp.txt");

        try {
            System.out.println("Файл " + file.getName() + " был создан: " + file.createNewFile());
        } catch (IOException e) {
            System.out.println("Не удалось создать файл: " + file.getName() + " : " + e.getMessage());
        }

        System.out.println(" ");
        System.out.println("==Запись в файл==");

        try (FileWriter writer = new FileWriter("C:/Users/DNS/Downloads/" +
                "Учёба Java/Занятия/Task15/temp.txt", false)) {
            String text = "Запись";
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(" ");
        System.out.println("==Чтение из файла==");

        try(FileReader reader = new FileReader("C:/Users/DNS/Downloads/Учёба Java/Занятия/Task15/temp.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.println((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println("Файл " + file.getName() + " существует: " + file.exists());

        System.out.println(" ");
        System.out.println("==Копирование файла==");

        Path originalPath = Paths.get("C:/Users/DNS/Downloads/Учёба Java/Занятия/Task15/temp.txt");
        Path pathTarget = Paths.get("C:/Users/DNS/Downloads/Учёба Java/Занятия/Task15/CopyOfTemp.txt");

        try {

            Files.copy(originalPath, pathTarget, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл был скопирован");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        System.out.println("==Переименовывание файла==");

        System.out.println("Файл " + file.getName() + " был переименован: " + file.renameTo(file));
        file.renameTo(new File("C:/Users/DNS/Downloads/Учёба Java/Занятия/Task15/temp2.txt"));

        File newFile = new File("C:/Users/DNS/Downloads/Учёба Java/Занятия/Task15/temp2.txt");
        System.out.println("Файл " + newFile.getName() + " существует: " + newFile.exists());

        System.out.println(" ");
        System.out.println("==Удаление файлов==");

        System.out.println("Файл " + newFile.getName() + " был удалён: " + ": " + newFile.delete());

        File copyFile = new File("C:/Users/DNS/Downloads/Учёба Java/Занятия/Task15/CopyOfTemp.txt");
        System.out.println("Файл " + copyFile.getName() + " был удалён: " + ": " + copyFile.delete());
    }
}