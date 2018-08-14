package io;

import java.io.File;

public class DirectoryCrawler {

    public static void crawl(File file){

        if (file.exists()) {

            File[] files = file.listFiles(File::isFile);

            if (files != null) {
                for (File f : files) {
                    System.out.println(f);
                }
            }

            File[] dirs = file.listFiles(File::isDirectory);

            if (dirs != null){

                for (File dir : dirs) {
                    crawl(dir);
                }
            }
        }
    }

}
