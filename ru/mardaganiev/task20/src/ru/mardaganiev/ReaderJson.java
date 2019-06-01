package ru.mardaganiev;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReaderJson {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.adviceslip.com/advice");
            try (InputStream is = url.openStream();
                Reader reader = new  InputStreamReader(is);
                 BufferedReader br = new BufferedReader (reader);
            ) {
                System.out.println(br.readLine());//выводим случайные советы

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
