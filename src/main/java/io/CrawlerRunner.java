package io;

import java.io.File;

public class CrawlerRunner {
    public static void main(String[] args) {
        File file = new File("src");
        DirectoryCrawler.crawl(file);
    }
}
