package com.example.crudlibrary;

import java.util.Optional;


public interface ICrudRepository<T, ID> {
    //...

    long count();

    boolean existsById(ID id);

    void delete(T entity);

    void deleteAll(Iterable<T> entities);

    void deleteById(ID id);

    void deleteAllById(Iterable<? extends ID> entities);

    void deleteAll();

    Iterable<T> findAll();

    Iterable<T> findAllById(Iterable<ID> iterable);

    Optional<T> findById(ID id);

    <E extends T> E save(T entity);

    <E extends T> Iterable<E> saveAll(Iterable<E> entities);
}
