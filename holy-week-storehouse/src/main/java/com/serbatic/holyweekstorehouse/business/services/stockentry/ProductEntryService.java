package com.serbatic.holyweekstorehouse.business.services.stockentry;

import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;

import java.util.List;

public interface ProductEntryService {

    List<ProductEntry> findAllEntries();
}
