package org.example;

public class Person {
    private int ID;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String birthdate;
    public Person(int _ID, String _name, String _gender, Department _department, int _salary, String _birthdate) {
        ID = _ID;
        name = _name;
        gender = _gender;
        department = _department;
        salary = _salary;
        birthdate = _birthdate;
    }
}
