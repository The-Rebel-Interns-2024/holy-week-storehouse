package com.serbatic.holyweekstorehouse.presentation.Dto;

public class ProductResource {
    String code;
    Integer quantity;

    public ProductResource() {
    }

    public ProductResource(String code, Integer quantity) {
        this.code = code;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
