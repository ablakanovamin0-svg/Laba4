package org.example;

/**
 * Класс объектов, содержащих
 * различную информацию о подразделении
 * @author ablakanovamin0-svg
 * @version 1.0
 */
public class Department {
    private int ID;
    private String name;

    /**
     * Конструктор объектов класса Department
     * с заданием имени подразделения и
     * генерацией айди подразделения
     * @param _name имя
     */
    public Department(String _name) {
        name = _name;
        ID = (int) (_name.charAt(0) - 'A');
    }

    /**
     * Получение айди
     * @return имя
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
     * Установление заданного имени
     * @param _name имя
     */
    public void setName(String _name) {
        name = _name;
        ID = (int) (_name.charAt(0) - 'A');
    }

    /**
     * Преобразование полей класса Department
     * в строковый формат для вывода
     * @return строка из данных о рассматриваемом подразделении
     */
    @Override
    public String toString() {
        return "department ID = " + ID + ", department name = " + name;
    }
}
