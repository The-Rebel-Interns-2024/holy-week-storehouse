package com.serbatic.holyweekstorehouse.business.services.stockentry;

import com.serbatic.holyweekstorehouse.data.entities.Product;
import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductRequest;

import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;

import java.util.List;

public interface ProductEntryService {
    ProductEntry save(ProductRequest prodReq);

    List<ProductEntry> findAllEntries();
}
