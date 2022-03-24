package com.shop.service;

import com.shop.entity.CatalogEntity;
import org.springframework.stereotype.Service;

@Service
public interface CatalogService {

    public void addCatalog(CatalogEntity catalogEntity);
}
