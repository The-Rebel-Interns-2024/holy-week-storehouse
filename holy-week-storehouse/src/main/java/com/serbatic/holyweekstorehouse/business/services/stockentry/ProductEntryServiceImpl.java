package com.serbatic.holyweekstorehouse.business.services.stockentry;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.data.repositories.ProductEntryRepository;
import com.serbatic.holyweekstorehouse.data.repositories.ProductRepository;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

import java.util.List;

@Service
public class ProductEntryServiceImpl implements ProductEntryService {

    @Autowired
    ProductEntryRepository entryRep;

    @Autowired
    ProductRepository proRep;
    public List<ProductEntry> findAllEntries() {
        return entryRep.findAll();
    }

    @Override
    public ProductEntry save(String code, Long quantity) {
        Optional<Product> productOpt = proRep.findByCode(code);
        if(productOpt.isPresent()){
            if(quantity > 0){
                Product product = productOpt.get();
                ProductEntry proEntry = new ProductEntry();
                proEntry.setEntryDate(LocalDate.now());
                proEntry.setProductCode(product);
                proEntry.setQuantity(quantity);
                return entryRep.save(proEntry);
            } else{
                throw new IllegalArgumentException("The product quantity is not valid.");
            }

        } else{
            throw new IllegalArgumentException("The product with code: "+code+" does not exist");
        }
    }
}
