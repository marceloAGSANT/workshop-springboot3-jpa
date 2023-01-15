package com.educandoweb.course.repositories;

import com.educandoweb.course.entites.Category;
import com.educandoweb.course.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
