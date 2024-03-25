package com.serbatic.holyweekstorehouse.business.services.product;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository proRep;
    Random r = new Random();

    @Override
    public Product save(String name) {
        Optional<Product> productOpt = proRep.findByName(name);
        if (productOpt.isPresent()) {
            throw new IllegalArgumentException("Product with that name already exist");
        }
        String code = "";
        do {
            code = name.substring(1, 4).toUpperCase() + "-" + r.nextInt(100, 1000);
            productOpt = proRep.findByCode(code);
        } while (productOpt.isPresent());
        Product product = new Product();
        product.setName(name);
        product.setCode(code);
        return proRep.save(product);
    }

    @Override
    public List<Product> findAll() {
        if(proRep.findAll().isEmpty()){
            return  proRep.findAll();
        } else{
            throw new NoSuchElementException("The list of products is empty");
        }
    }
}
