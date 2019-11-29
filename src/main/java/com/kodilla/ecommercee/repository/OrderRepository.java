package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Order;
import com.kodilla.ecommercee.domain.OrderNotFoundException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Override
    List<Order> findAll();

    @Override
    Order save(Order order);

    Optional<Order> findById(Long id);

    default Optional<Order> findOrThrow(Long id) throws OrderNotFoundException {
        Optional<Order> order = Optional.ofNullable(findById(id).orElseThrow(OrderNotFoundException::new));
        return order;
    }

    void deleteById(Long id);
}
