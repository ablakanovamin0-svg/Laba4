package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования функционала методов
 * классов Person и Department
 * @author ablakanovamin0-svg
 * @version 1.0
 */
public class Tests {

    /**
     * Проверка работы конструкторов и методов get
     */
    @Test
    void createTest() {
        Department department = new Department("H");
        assertEquals("H", department.getName());
        assertEquals(7, department.getID());
        Person person = new Person(54174, "Zuwena", "Female", new Department("L"), 3100, "05.12.1943");
        assertEquals(54174, person.getID());
        assertEquals("Zuwena", person.getName());
        assertEquals("Female", person.getGender());
        assertEquals("L", person.getDepartment().getName());
        assertEquals(11, person.getDepartment().getID());
        assertEquals(3100, person.getSalary());
        assertEquals("05.12.1943", person.getBirthdate());
    }

    /**
     * Проверка работы методов set
     */
    @Test
    void setTest() {
        Department department = new Department("H");
        department.setName("C");
        assertEquals("C", department.getName());
        assertEquals(2, department.getID());
        Person person = new Person(54174, "Zuwena", "Female", new Department("L"), 3100, "05.12.1943");
        person.setID(45609);
        assertEquals(45609, person.getID());
        person.setName("Marsyas");
        assertEquals("Marsyas", person.getName());
        person.setGender("Male");
        assertEquals("Male", person.getGender());
        person.setDepartment(new Department("M"));
        assertEquals("M", person.getDepartment().getName());
        assertEquals(12, person.getDepartment().getID());
        person.setSalary(2700);
        assertEquals(2700, person.getSalary());
        person.setBirthdate("27.08.1972");
        assertEquals("27.08.1972", person.getBirthdate());
        String fileName = "src/main/resources/foreign_names.csv";
    }
}
