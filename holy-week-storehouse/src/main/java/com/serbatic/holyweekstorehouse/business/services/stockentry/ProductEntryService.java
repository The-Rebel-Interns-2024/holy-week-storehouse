package com.serbatic.holyweekstorehouse.business.services.stockentry;

import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductEntryStorageResponse;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductStorageResource;

import java.util.List;

public interface ProductEntryService {

    ProductEntry save(ProductResource prodReq);

    List<ProductEntry> findAllEntries();
}
