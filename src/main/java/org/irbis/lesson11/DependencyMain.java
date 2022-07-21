package org.irbis.lesson11;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DependencyMain {

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://author.today/work/genre/fanfiction").get();
        Elements elements = document.select(".book-row");
        for (Element element : elements) {
            System.out.println("Заголовок: " + element.select(".book-title").text());
            System.out.println("Автор: " + element.select(".book-author").text());
        }
    }

}
