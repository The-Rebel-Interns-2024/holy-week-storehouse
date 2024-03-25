package com.serbatic.holyweekstorehouse.business.services.stockexit;

import com.serbatic.holyweekstorehouse.data.entities.ProductExit;
import com.serbatic.holyweekstorehouse.data.repositories.ProductExitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductExitServiceImpl implements ProductExitService {
    @Autowired
    ProductExitRepository exitRep;

    @Override
    public List<ProductExit> findAllExits() {
        return exitRep.findAll();
    }
}
