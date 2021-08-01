package ru.geekbrains.lesson5.dao;

import ru.geekbrains.lesson5.entities.Mark;

public class MarkDao extends AbstractEntityDao<Mark, Short> {

    public MarkDao() {
        super(Mark.class);
    }

}
