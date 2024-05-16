package ru.kurkin.js.dz1.wrk.service.impl;

import org.springframework.stereotype.Service;
import ru.kurkin.js.dz1.wrk.model.Order;
import ru.kurkin.js.dz1.wrk.service.OrderRepository;

@Service
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public Iterable<Order> findAll() {
        return null;
    }

    @Override
    public Order save(Order order) {
        return null;
    }
}
