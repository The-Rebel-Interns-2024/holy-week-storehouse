package com.serbatic.holyweekstorehouse.business.services.product;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.repositories.ProductRepository;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductStorageResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository proRep;

    public ProductServiceImpl(ProductRepository proRep) {
        this.proRep = proRep;
    }

    @Override
    public Product save(ProductStorageResource productStorageResource) {
        if (proRep.existsByCode(productStorageResource.getCode())) {
            throw new IllegalArgumentException("The code already exists.");
        }
        Product product = new Product();
        product.setCode(productStorageResource.getCode());
        product.setName(productStorageResource.getName());
        return proRep.save(product);
    }

    @Override
    public List<Product> findAll() {
        if (!proRep.findAll().isEmpty()) {
            return proRep.findAll();
        } else {
            throw new NoSuchElementException("The list of products is empty");
        }
    }

    @Override
    public Product findByCode(String code) {
        Optional<Product> products = proRep.findByCode(code);
        if(products.isEmpty()){
            throw new NoSuchElementException("The product don´t exist");
        }
        return products.get();
    }
}
