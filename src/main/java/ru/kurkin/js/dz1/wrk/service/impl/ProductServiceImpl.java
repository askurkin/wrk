package ru.kurkin.js.dz1.wrk.service.impl;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ru.kurkin.js.dz1.wrk.model.Product;
import ru.kurkin.js.dz1.wrk.service.ProductRepository;
import ru.kurkin.js.dz1.wrk.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return (Product) productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
