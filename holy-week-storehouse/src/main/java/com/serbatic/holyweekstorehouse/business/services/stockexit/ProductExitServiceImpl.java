package com.serbatic.holyweekstorehouse.business.services.stockexit;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.entities.ProductExit;
import com.serbatic.holyweekstorehouse.data.repositories.ProductExitRepository;
import com.serbatic.holyweekstorehouse.data.repositories.ProductRepository;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;
import com.serbatic.holyweekstorehouse.presentation.GlobalExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductExitServiceImpl implements ProductExitService {
    @Autowired
    ProductExitRepository exitRep;

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductExit> findAllExits() {
        return exitRep.findAll();
    }

    @Override
    public ProductExit save(ProductResource productResource) {

        Product product = productRepository.findByCode(productResource.getCode()).get();

        if (product.getProductEntryList().isEmpty()){

            new IllegalArgumentException("The product with code: "+product.getCode()+" has no entries made ");

        } else {

        }

        return null;
    }


}
