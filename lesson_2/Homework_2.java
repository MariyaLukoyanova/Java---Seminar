package lesson_2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Homework_2 {
    public static void main(String[] args) throws IOException {
        // Создать файл с названием file.txt. Если файл уже есть,
        // то создавать не надо Записать в него Слово "TEXT" 100 раз
        Path of = Path.of("file.txt");
        if (Files.exists(of) == false) {
            Files.createFile(of);
        }
        FileWriter writer = new FileWriter("file.txt"); 
        for (int i = 0; i < 100; i++) {
            writer.write("TEXT\n");
        }
        writer.close();
    }
}
