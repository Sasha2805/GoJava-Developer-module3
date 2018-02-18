package com.company.hibernate.dao;

import java.util.List;

public interface Dao<T, ID> {
    void save(T t);

    T getById(ID id);

    void remove(ID id);

    List<T> getAll();

    void update(T t);
}
