package org.example.labs.lab7.DAO;

import java.util.List;

public interface CrudDao<E, I> {
    E findById(I id);
    void save(E entity);
    void update(E entity);
    void delete(E entity);
    List<E> findAll();
}
