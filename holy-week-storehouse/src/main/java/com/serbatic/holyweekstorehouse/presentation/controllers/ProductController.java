package com.serbatic.holyweekstorehouse.presentation.controllers;

import com.serbatic.holyweekstorehouse.business.services.product.ProductService;
import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductStorageResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping()
    public ResponseEntity<ProductStorageResource> createProduct(@RequestBody ProductStorageResource productStorageResource) {
        Product product = productService.save(productStorageResource);
        return ResponseEntity.ok(ProductStorageResource.mapToProductStorageResource(product));
    }

    @GetMapping()
    public ResponseEntity<List<Product>> findAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{code}")
    public ResponseEntity<Product> findProductByCode(@PathVariable(name = "code") String code) {
        return ResponseEntity.ok(productService.findByCode(code));
    }

}
