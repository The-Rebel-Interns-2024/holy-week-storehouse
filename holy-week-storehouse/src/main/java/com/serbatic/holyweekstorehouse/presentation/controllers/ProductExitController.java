package com.serbatic.holyweekstorehouse.presentation.controllers;

import com.serbatic.holyweekstorehouse.business.services.stockexit.ProductExitService;
import com.serbatic.holyweekstorehouse.data.entities.ProductExit;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exits")
public class ProductExitController {

    @Autowired
    ProductExitService productExitService;

    @GetMapping()
    public List<ProductExit> findAllExits() {
        return productExitService.findAllExits();
    }

    @PostMapping()
    public ResponseEntity<ProductExit> createProduct(@RequestBody ProductResource prodRequest) {



        return ResponseEntity.ok(productExitService.save(prodRequest));
    }
}
