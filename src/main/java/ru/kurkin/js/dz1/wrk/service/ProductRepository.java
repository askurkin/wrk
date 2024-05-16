package ru.kurkin.js.dz1.wrk.service;

import ru.kurkin.js.dz1.wrk.model.Product;

import java.util.Optional;

public interface ProductRepository {
    Iterable<Product> findAll();

    Optional<Object> findById(long id);

    Product save(Product product);
}
