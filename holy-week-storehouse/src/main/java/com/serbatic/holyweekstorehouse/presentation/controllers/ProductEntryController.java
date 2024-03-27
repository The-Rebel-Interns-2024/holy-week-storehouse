package com.serbatic.holyweekstorehouse.presentation.controllers;

import com.serbatic.holyweekstorehouse.business.services.stockentry.ProductEntryService;
import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductEntryStorageResponse;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductStorageResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entries")
public class ProductEntryController {

    @Autowired
    ProductEntryService productEntryService;

    @GetMapping()
    public List<ProductEntry> getAllEntries() {
        return productEntryService.findAllEntries();
    }

    @PostMapping()
    public ResponseEntity<ProductEntryStorageResponse> createProduct(@RequestBody ProductResource prodRequest) {
        if(prodRequest.getQuantity() > 0){
            ProductEntry saveEntry = productEntryService.save(prodRequest);
            return ResponseEntity.ok(ProductEntryStorageResponse.from(saveEntry));
        } else{
            throw new IllegalArgumentException("The product quantity is not valid.");
        }
    }
}
