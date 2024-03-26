package com.serbatic.holyweekstorehouse.business.services.stockexit;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.data.entities.ProductExit;
import com.serbatic.holyweekstorehouse.data.repositories.ProductExitRepository;
import com.serbatic.holyweekstorehouse.data.repositories.ProductRepository;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

        float quantityEntry=0;
        float quantityExist=0;

        Product product = productRepository.findByCode(productResource.getCode()).get();


        if (product.getProductEntryList().isEmpty()){

            throw new IllegalArgumentException("The product with code: "+product.getCode()+" has no entries made ");

        } else {

            for(ProductEntry prodEnt : product.getProductEntryList()){
                quantityEntry += prodEnt.getQuantity();
            }

            if(!product.getProductExitList().isEmpty()){

                for(ProductExit prodExit : product.getProductExitList()){
                    quantityExist += prodExit.getQuantity();
                }
            }

            if(quantityEntry - quantityExist > productResource.getQuantity()){

                ProductExit productExitNew = new ProductExit();
                productExitNew.setExitDate(LocalDate.now());
                productExitNew.setProductCode(product);
                productExitNew.setQuantity(Long.valueOf(productResource.getQuantity()));
                return exitRep.save(productExitNew);

            } else {
                throw new IllegalArgumentException("The product with the code: "+product.getCode()+", does not have enough stock for that quantity. ");
            }
        }
    }


}
