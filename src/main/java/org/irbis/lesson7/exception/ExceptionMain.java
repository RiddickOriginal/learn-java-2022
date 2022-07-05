package org.irbis.lesson7.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExceptionMain {
    public static void main(String[] args) throws CustomException {
        Path path = Path.of("kjlfhadhgfa");
        writeToFile(path, "sdfsdfsd");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                throw new CustomException("Ненавижу 5");
            }
            System.out.println(i);
        }
    }

    ////////////////////////////////////////////////////////////////

    public static void writeToFile(Path path, String text) {
        try {
            Files.createFile(path);                 // Cоздаю файл
            Files.write(path, text.getBytes());     // Пишу в файл
        } catch (IOException e) {                   // Ловлю исключение
            try {
                Files.createFile(path);             // пытюсь создать файл
            } catch (IOException ex) {
                throw new RuntimeException("Ну точно ничего не получилось"); // не получилось(
            }
        }
    }

}
