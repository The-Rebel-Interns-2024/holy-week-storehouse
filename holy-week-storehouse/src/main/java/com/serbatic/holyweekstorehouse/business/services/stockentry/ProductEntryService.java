package com.serbatic.holyweekstorehouse.business.services.stockentry;

import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;

import java.util.List;

import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;

public interface ProductEntryService {
    ProductEntry save(ProductResource prodReq);

    List<ProductEntry> findAllEntries();
}
