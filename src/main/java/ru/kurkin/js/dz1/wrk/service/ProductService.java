package ru.kurkin.js.dz1.wrk.service;

import ru.kurkin.js.dz1.wrk.model.Product;

public interface ProductService {
    Iterable<Product> getAllProducts();

    Product getProduct(long id);

    Product save(Product product);
}
