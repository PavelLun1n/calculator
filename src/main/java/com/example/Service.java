package com.example;

import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);

    public void inter()
    {
        System.out.println("Введите продукт");
        String product = scanner.nextLine();
        System.out.println("Введите граммы");
        String grams = scanner.nextLine();
    }

}
