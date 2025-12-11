package org.example;

public class Department {
    private int ID;
    private String name;
    public Department(String _name) {
        name = _name;
        ID = (int) (_name.charAt(0) - 'A');
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String _name) {
        name = _name;
        ID = (int) (_name.charAt(0) - 'A');
    }
    @Override
    public String toString() {
        return "department ID = " + ID + ", department name = " + name;
    }
}
