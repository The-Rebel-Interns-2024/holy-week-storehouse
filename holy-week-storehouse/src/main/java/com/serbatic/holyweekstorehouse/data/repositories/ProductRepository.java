package com.serbatic.holyweekstorehouse.data.repositories;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);

    Optional<Product> findByName(String name);
}
