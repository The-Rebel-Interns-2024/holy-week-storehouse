package com.serbatic.holyweekstorehouse.presentation.Dto;

import com.serbatic.holyweekstorehouse.data.entities.Product;

public class ProductStorageResource {
    String code;
    String name;

    public ProductStorageResource(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static ProductStorageResource productStorageResourceMapping(Product product) {
        ProductStorageResource productStorageResource = new ProductStorageResource(product.getCode(), product.getName());
        return productStorageResource;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
