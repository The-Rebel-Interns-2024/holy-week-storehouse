package com.serbatic.holyweekstorehouse.presentation.controllers;

import com.serbatic.holyweekstorehouse.business.services.stockentry.ProductEntryService;
import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductEntryStorageResponse;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;
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

    @PostMapping("/code/{code}/add/{quantity}")
    public ResponseEntity<ProductEntryStorageResponse> createProduct(@PathVariable(name = "code") String code, @PathVariable(name = "quantity") Long quantity) {
        return ResponseEntity.ok(ProductEntryStorageResponse.from(productEntryService.save(code, quantity)));
    }

    /*@PostMapping()
    public ResponseEntity<ProductEntry> createProduct(@RequestBody ProductResource prodRequest) {
        return ResponseEntity.ok(productEntryService.save(prodRequest));
    }*/
}
