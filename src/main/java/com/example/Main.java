package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Service service = new Service();
        Parser parser = new Parser();
       System.out.println( parser.out());
      //  service.inter();
    }
}