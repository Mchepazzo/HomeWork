package ru.maradaganiev.Converter;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CodeConversion {
    public static void main(String[] args) throws IOException {
        File file = new File("NewFile.txt");
        String string = new String("Значимость этих проблем настолько очевидна, что укрепление и развитие структ" +
                "уры представляет собой интересный эксперимент проверки позиций, занимаемых участниками в отношении " +
                "поставленных задач. Повседневная практика показывает, что рамки и место обучения кадров требуют от нас" +
                " анализа существенных финансовых и административных условий. Повседневная практика показывает," +
                " что консультация с широким активом требуют определения и уточнения систем массового участия." +
                " Значимость этих проблем настолько очевидна, что рамки и место обучения кадров влечет за собой " +
                "процесс внедрения и модернизации системы обучения кадров, соответствует насущным потребностям." +
                " Разнообразный и богатый опыт сложившаяся структура организации представляет собой интересный" +
                " эксперимент проверки позиций, занимаемых участниками в отношении поставленных задач. ");
        try (OutputStream os = new FileOutputStream(file)) {
            os.write(string.getBytes());
        }
        Path path = Paths.get("ConversionFile.txt");
        try (OutputStream os = new FileOutputStream(path.toFile())) {
            os.write(string.getBytes("Windows-1251"));
        }
    }
}
