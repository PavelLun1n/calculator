package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Service service = new Service();
        Parser parser = new Parser();
        //service.inter();
        // parser.search();
        parser.parseNotDinamic("https://health-diet.ru/base_of_food/sostav/79.php");
    }
}