package com.serbatic.holyweekstorehouse.business.services.stockentry;

import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import com.serbatic.holyweekstorehouse.data.repositories.ProductEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductEntryServiceImpl implements ProductEntryService {

    @Autowired
    ProductEntryRepository entryRep;

    public List<ProductEntry> findAllEntries() {
        return entryRep.findAll();
    }

}
