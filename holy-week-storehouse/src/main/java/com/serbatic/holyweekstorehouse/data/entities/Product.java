package com.serbatic.holyweekstorehouse.data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name="name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ProductEntry> productEntryList;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ProductExit> productExitList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ProductEntry> getProductEntryList() {
        return productEntryList;
    }

    public void setProductEntryList(List<ProductEntry> productEntryList) {
        this.productEntryList = productEntryList;
    }

    public List<ProductExit> getProductExitList() {
        return productExitList;
    }

    public void setProductExitList(List<ProductExit> productExitList) {
        this.productExitList = productExitList;
    }
}
