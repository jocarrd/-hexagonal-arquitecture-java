package com.example.application.port;


import com.example.domain.model.Order;
import io.quarkus.hibernate.orm.panache. PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderRepository implements PanacheRepository<Order> {
}
