package org.example;

/**
 * Класс объектов, содержащих
 * различную информацию о людях
 * @author ablakanovamin0-svg
 * @version 1.0
 */
public class Person {
    private int ID;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String birthdate;

    /**
     * Конструктор объектов класса Person
     * @param _ID айди
     * @param _name имя
     * @param _gender пол
     * @param _department подразделение
     * @param _salary зарплата
     * @param _birthdate дата рождения
     */
    public Person(int _ID, String _name, String _gender, Department _department, int _salary, String _birthdate) {
        ID = _ID;
        name = _name;
        gender = _gender;
        department = _department;
        salary = _salary;
        birthdate = _birthdate;
    }

    /**
     * Получение айди
     * @return айди
     */
    public int getID() {
        return ID;
    }

    /**
     * Получение имени
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Получение пола
     * @return пол
     */
    public String getGender() {
        return gender;
    }

    /**
     * Получение подразделения
     * @return подразделение
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Получение зарплаты
     * @return зарплата
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Получение даты рождения
     * @return дата рождения
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Установление заданного айди
     * @param _ID айди
     */
    public void setID(int _ID) {
        ID = _ID;
    }

    /**
     * Установление заданного имени
     * @param _name имя
     */
    public void setName(String _name) {
        name = _name;
    }

    /**
     * Установление заданного пола
     * @param _gender пол
     */
    public void setGender(String _gender) {
        gender = _gender;
    }

    /**
     * Установление заданного подразделения
     * @param _department подразделение
     */
    public void setDepartment(Department _department) {
        department = _department;
    }

    /**
     * Установление заданной зарплаты
     * @param _salary зарплата
     */
    public void setSalary(int _salary) {
        salary = _salary;
    }

    /**
     * Установление заданной даты рождения
     * @param _birthdate дата рождения
     */
    public void setBirthdate(String _birthdate) {
        birthdate = _birthdate;
    }

    /**
     * Преобразование полей класса Person
     * в строковый формат для вывода
     * @return строка из данных о рассматриваемом человеке
     */
    @Override
    public String toString() {
        return "ID = " + ID + ", name = " + name + ", gender = " + gender + ", " + department + ", salary = " + salary + ", birthdate = " + birthdate;
    }
}
