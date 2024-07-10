package com.research.webscraper.util;

import com.research.webscraper.dto.ProductUpdateDTO;
import com.research.webscraper.model.ProductUpdate;

public class ProductUpdateMapper {

    public static ProductUpdate toEntity(ProductUpdateDTO dto) {
        ProductUpdate update = new ProductUpdate();
        update.setCondition(dto.getCondition());
        update.setViews(dto.getViews());
        update.setFavorites(dto.getFavorites());
        update.setBrand(dto.getBrand());
        update.setModel(dto.getModel());
        update.setUpToKg(dto.getUpToKg());
        return update;
    }
}