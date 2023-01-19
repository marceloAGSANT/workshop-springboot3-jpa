package com.educandoweb.course.repositories;

import com.educandoweb.course.entites.OrderItem;
import com.educandoweb.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
