package com.serbatic.holyweekstorehouse.business.services.product;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    Product save(String name);
    List<Product> findAll();
}