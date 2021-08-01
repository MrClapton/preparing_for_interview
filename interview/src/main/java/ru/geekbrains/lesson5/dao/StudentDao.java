package ru.geekbrains.lesson5.dao;

import ru.geekbrains.lesson5.entities.Student;

public class StudentDao extends AbstractEntityDao<Student, Integer> {

    public StudentDao() {
        super(Student.class);
    }

}