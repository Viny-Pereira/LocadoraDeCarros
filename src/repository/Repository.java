package src.repository;

import java.util.List;

public interface Repository<T> {
    boolean create(T obj);

    boolean delete(T obj);

    boolean update(T obj);

    T findById(int id);

    List<T> findAll();
}
