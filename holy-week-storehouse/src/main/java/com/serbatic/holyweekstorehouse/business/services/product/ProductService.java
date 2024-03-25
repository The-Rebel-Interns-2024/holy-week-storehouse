package com.serbatic.holyweekstorehouse.business.services.product;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import org.springframework.http.ResponseEntity;

public interface ProductService {
    Product save(String name);
}
