package com.serbatic.holyweekstorehouse.business.services.product;

import com.serbatic.holyweekstorehouse.data.entities.Product;

import java.util.List;

public interface ProductService {
    Product save(String name);
    List<Product> findAll();
    Product findByCode(String code);

    Boolean existByCode(String code);

}
