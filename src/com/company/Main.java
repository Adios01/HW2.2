package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int ranNum = r.nextInt(107);
        System.out.println("Случайное число " + ranNum);

    }
}
