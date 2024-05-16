package ru.kurkin.js.dz1.wrk.service;

import ru.kurkin.js.dz1.wrk.model.Order;

public interface OrderRepository {
    Iterable<Order> findAll();

    Order save(Order order);
}
