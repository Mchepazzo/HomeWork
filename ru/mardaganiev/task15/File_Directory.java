package ru.mardaganiev.task15;

import java.io.*;
import java.util.*;


class File_Directory {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите адрес исследуемого каталога: ");
        String Path = scanner.nextLine();
        printTreeFiles(Path);
    }

    public static void printTreeFiles(String Path) {
        File Directory = new File(Path);

        if (Directory.exists()) {
            getContent(Directory, 0);
        } else System.out.println("Введён неверный адрес каталога...");
    }

    public static void getContent(File Directory, int Indents) {
        for (int i = 0; i < Indents; i++) System.out.print("\t");

        if (Directory.isFile()) System.out.println("В каталоге: " + Directory.getParent() + " находится" +
                " файл: " + Directory.getName() + ", размером/длинной: " + Directory.length() + " байт");
        else {
            System.out.println(Directory.getName());
            File[] SubDirectory = Directory.listFiles();
            for (File SubWay : SubDirectory)
                getContent(SubWay, Indents + 1);
        }
    }
}