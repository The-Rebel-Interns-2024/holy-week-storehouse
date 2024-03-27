package com.serbatic.holyweekstorehouse.business.services.stockentry;

import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;

import java.util.List;

public interface ProductEntryService {

    //ProductEntry save(ProductResource prodReq);
    ProductEntry save(String code, Long quantity);

    List<ProductEntry> findAllEntries();
}
