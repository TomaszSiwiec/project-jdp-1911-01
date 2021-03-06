package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends GenericEntityRepository<Order> {
}
