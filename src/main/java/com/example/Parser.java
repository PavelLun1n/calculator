package com.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Parser {
    Document document = Jsoup.connect("https://health-diet.ru/base_of_food/sostav/79.php").userAgent("Mozilla/5.0 " +
                    "(Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36")
            .referrer("http://www.google.com").get();
    public Parser() throws IOException {

    }
    public Elements out()
    {
        return document.select("div.mzr-block.mzr-nutrition-value");
    }


}
