package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {
    public static final double CONVERSION = 1852;
    public static void main(String[] args) {
        Scanner objScaner = new Scanner(System.in);
        System.out.println("Teclea millas nauticas");
        float millas = objScaner.nextFloat();
        float metros = (float) (millas * CONVERSION);
        System.out.println(millas + " millas naúticas son " + metros + " metros");
    }

}
