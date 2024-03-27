package com.serbatic.holyweekstorehouse.business.services.dto;

public class ProductResourceService {
    String code;
    Long quantity;

    public ProductResourceService() {
    }

    public ProductResourceService(String code, Long quantity) {
        this.code = code;
        this.quantity = quantity;
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

}
