package com.serbatic.holyweekstorehouse.business.services.stockexit;

import com.serbatic.holyweekstorehouse.data.entities.ProductExit;
import com.serbatic.holyweekstorehouse.presentation.Dto.ProductResource;

import java.util.List;

public interface ProductExitService {

    List<ProductExit> findAllExits();

    ProductResource save(ProductResource productResource);
}
