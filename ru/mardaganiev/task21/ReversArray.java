package ru.mardaganiev.task21;

public class ReversArray {


    public void sort(int[] massive){
        int[]OriginalArray = new int[20];
        for(int i = 19; i >= 0; i--){
            OriginalArray[19 - i] = massive[i];
        }

        for(int a = 0; a < 20; a++){
            massive[a] = OriginalArray[a];
        }
    }

    public static void main(String[] arg){
        int[] mass = {91,41,23,54,798,42,12,33,78,510,161,55,23,77,30,28,47,14,51,118};
        System.out.println("Original Array:");
        for (int i = 0; i < 20; i++)
        {
            System.out.print(" [" + mass[i] + "] ");

        }

        ReversArray m = new ReversArray();
        m.sort(mass);
        System.out.println("");
        System.out.println("Revers Array:");
        for(int i: mass){

            System.out.print(" [" + i + "] ");

        }
    }
}