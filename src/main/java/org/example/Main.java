package org.example;

import java.util.List;

public class Main {
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