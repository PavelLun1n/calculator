package com.example;

import java.util.Scanner;

public class Service {
    private final Scanner scanner = new Scanner(System.in);
    private String product;
    private Double grams;

    public Service() {
        product = "гречка";
        grams = 0.0;
    }


    public void inter() {
        System.out.println("Введите продукт");
        String product = scanner.nextLine();
        System.out.println("Введите граммы");
        Double grams = Double.valueOf(scanner.nextLine());
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getGrams() {
        return grams;
    }

    public void setGrams(Double grams) {
        this.grams = grams;
    }
}
