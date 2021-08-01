package ru.geekbrains.lesson1.task1.classbook;

import ru.geekbrains.lesson1.task1.lombok.Genders;

import java.util.logging.Logger;

/**
 * 1. Создать builder для класса Person со следующими полями:
 *    String firstName, String lastName, String middleName, String country, String address, String phone,
 *    int age, String gender.
 */
public class Task1ClassBook {
    private static final Logger log = Logger.getLogger(Task1ClassBook.class.getName());

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstName("Alex")
                .lastName("Kitaev")
                .middleName("Vasil'yevich")
                .age(26)
                .gender(Genders.Male.name())
                .country("Russia")
                .address("Normandia-Neman, 4")
                .phone("+7-000-000-00-00")
                .build();

        log.info(person.toString());
        log.info(person.getFirstName());
    }
}
