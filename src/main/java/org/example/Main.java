package org.example;

import java.util.List;

/**
 * Класс для показа функционала объекта созданного класса CSVProcessor
 * @version 1.0
 * @author ablakanovamin0-svg
 */
public class Main {
    /**
     * Показ функционала метода класса CSVProcessor
     */
    public static void main(String[] args) {
        CSVProcessor processor = new CSVProcessor();
        String path = "src/main/resources/foreign_names.csv";
        try {
            List<Person> personList = processor.process(path);
            for (Person person: personList) {
                System.out.println(person + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}