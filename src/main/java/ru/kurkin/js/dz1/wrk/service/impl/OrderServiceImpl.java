package ru.kurkin.js.dz1.wrk.service.impl;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ru.kurkin.js.dz1.wrk.model.Order;
import ru.kurkin.js.dz1.wrk.service.OrderRepository;
import ru.kurkin.js.dz1.wrk.service.OrderService;

import java.time.LocalDate;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        order.setDateCreated(LocalDate.now());
        return this.orderRepository.save(order);
    }

    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}
