package com.serbatic.holyweekstorehouse.business.services.product;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductStorageResource;

import java.util.List;

public interface ProductService {
    Product save(ProductStorageResource product);
    List<Product> findAll();
    Product findByCode(String code);



}
