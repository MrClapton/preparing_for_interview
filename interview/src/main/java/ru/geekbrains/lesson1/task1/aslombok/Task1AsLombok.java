package ru.geekbrains.lesson1.task1.aslombok;

import ru.geekbrains.lesson1.task1.lombok.Genders;

import java.util.logging.Logger;

public class Task1AsLombok {
    static Logger log = Logger.getLogger(Task1AsLombok.class.getName());

    public static void main(String[] args) {
        Person person = Person.builder()
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