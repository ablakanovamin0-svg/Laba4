package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVProcessor {
    private List<Person> personList;
    public CSVProcessor() {
        personList = new ArrayList<>();
    }
    public List<Person> process(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        String str = scanner.nextLine();
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            str = str.replace(" ", "");
            if (!str.isEmpty()) {
                String[] cols = str.split(";");
                Person person = new Person(Integer.parseInt(cols[0]), cols[1], cols[2], new Department(cols[4]), Integer.parseInt(cols[5]), cols[3]);
                personList.add(person);
            }
        }
        scanner.close();
        return personList;
    }
}
