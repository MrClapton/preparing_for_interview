package ru.geekbrains.lesson1.task1.lombok;

/**
 * 1. Создать builder для класса Person со следующими полями:
 *    String firstName, String lastName, String middleName, String country, String address, String phone,
 *    int age, String gender.
 */
public class Task1Lombok {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.createNewPerson("Alex", "Kitaev", "Vasil'yevich", 26,
                Genders.Male.name(), "Russia", "Normandia-Neman, 4", "+7-000-000-00-00");
    }
}