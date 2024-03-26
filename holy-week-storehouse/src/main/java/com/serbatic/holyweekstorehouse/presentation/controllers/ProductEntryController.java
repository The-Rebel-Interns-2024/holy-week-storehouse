package com.serbatic.holyweekstorehouse.presentation.controllers;

import com.serbatic.holyweekstorehouse.business.services.stockentry.ProductEntryService;
import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productEntry")
public class ProductEntryController {
    @Autowired
    ProductEntryService productEntryService;
    @PostMapping()
    public ResponseEntity<ProductEntry> createProduct(@RequestBody ProductRequest prodRequest) {
        return ResponseEntity.ok(productEntryService.save(prodRequest));
    }
}
