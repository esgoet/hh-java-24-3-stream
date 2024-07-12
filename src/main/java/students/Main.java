package students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Path.of("students.csv"))) {
                lines
                    .skip(1)
                    .filter(student -> !student.isEmpty())
                    .map(student -> {
                        String[] subStudent = student.split(",");
                        return new Student(Integer.parseInt(subStudent[0]), subStudent[1], Integer.parseInt(subStudent[2]), Integer.parseInt(subStudent[3]));
                    })
                    .distinct()
                    .forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
