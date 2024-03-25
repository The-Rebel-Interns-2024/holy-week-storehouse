package com.serbatic.holyweekstorehouse.business.services.stockexit;

import com.serbatic.holyweekstorehouse.data.entities.ProductExit;

import java.util.List;

public interface ProductExitService {

    List<ProductExit> findAllExits();
}
