package com.shop.service.impl;

import com.shop.entity.CatalogEntity;
import com.shop.repository.CatalogRepository;
import com.shop.service.CatalogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CatalogServiceImpl implements CatalogService {

    CatalogRepository catalogRepository;
    @Override
    @Transactional
    public void addCatalog(CatalogEntity catalogEntity) {

        CatalogEntity response=catalogRepository.save(catalogEntity);

    }
}
