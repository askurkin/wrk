package ru.kurkin.js.dz1.wrk.service;

import ru.kurkin.js.dz1.wrk.model.Order;

public interface OrderService {
    Iterable<Order> getAllOrders();

    Order create(Order order);

    void update(Order order);
}
