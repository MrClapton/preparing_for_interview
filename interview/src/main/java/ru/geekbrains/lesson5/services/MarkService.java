package ru.geekbrains.lesson5.services;

import ru.geekbrains.lesson5.dao.MarkDao;
import ru.geekbrains.lesson5.entities.Mark;

public class MarkService extends AbstractEntityService<Mark, Short> {

    public MarkService() {
        dao = new MarkDao();
    }

}
