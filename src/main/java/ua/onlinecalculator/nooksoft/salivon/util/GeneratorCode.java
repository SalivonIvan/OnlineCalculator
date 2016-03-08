package ua.onlinecalculator.nooksoft.salivon.util;

import java.util.Random;

public class GeneratorCode {

    public static String getCode() {
        Random random = new Random();
        int number = (int) (random.nextDouble() * 10000);
        return String.valueOf(number);
    }
}
