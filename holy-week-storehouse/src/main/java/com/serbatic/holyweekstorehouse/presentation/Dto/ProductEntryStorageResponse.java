package com.serbatic.holyweekstorehouse.presentation.Dto;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;

public class ProductEntryStorageResponse {
    String name;
    String code;
    Long quantity;

    public ProductEntryStorageResponse() {
    }

    public ProductEntryStorageResponse(String name, String code, Long quantity) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public static ProductEntryStorageResponse from(ProductEntry productEntry){
        return new ProductEntryStorageResponse(
                productEntry.getProductCode().getName(),
                productEntry.getProductCode().getCode(),
                productEntry.getQuantity());
    }
}
