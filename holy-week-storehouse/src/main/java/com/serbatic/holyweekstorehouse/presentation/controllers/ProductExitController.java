package com.serbatic.holyweekstorehouse.presentation.controllers;

import com.serbatic.holyweekstorehouse.business.services.stockexit.ProductExitService;
import com.serbatic.holyweekstorehouse.data.entities.ProductExit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
