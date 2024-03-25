package com.serbatic.holyweekstorehouse.data.repositories;

import com.serbatic.holyweekstorehouse.data.entities.ProductEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntryRepository extends JpaRepository<ProductEntry, Long> {
}
