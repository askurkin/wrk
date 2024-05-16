package ru.kurkin.js.dz1.wrk.service.impl;

import org.springframework.stereotype.Service;
import ru.kurkin.js.dz1.wrk.model.Product;
import ru.kurkin.js.dz1.wrk.service.ProductRepository;

import java.util.Optional;

@Service
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Iterable<Product> findAll() {
        return null;
    }

    @Override
    public Optional<Object> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}
