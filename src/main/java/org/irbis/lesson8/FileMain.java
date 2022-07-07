package org.irbis.lesson8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMain {
    public static void main(String[] args) throws IOException {
        File dir = new File("testDir");
        dir.mkdir();

        File file = new File(dir, "file.txt");
        file.createNewFile();
        
        try (
                FileOutputStream stream = new FileOutputStream(file)
        ) {
            stream.write("Привет файл".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.createDirectory(Paths.get("testDir1"));
            Files.writeString(Paths.get("testDir1/file.txt"), "Привет файл");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
