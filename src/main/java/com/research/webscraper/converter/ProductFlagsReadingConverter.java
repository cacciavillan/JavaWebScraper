package com.research.webscraper.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.research.webscraper.model.ProductFlags;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class ProductFlagsReadingConverter implements Converter<String, ProductFlags> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ProductFlags convert(String source) {
        try {
            return objectMapper.readValue(source, ProductFlags.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON to ProductFlags", e);
        }
    }
}