package com.research.webscraper.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.research.webscraper.model.ProductFlags;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class ProductFlagsWritingConverter implements Converter<ProductFlags, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convert(ProductFlags source) {
        try {
            return objectMapper.writeValueAsString(source);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting ProductFlags to JSON", e);
        }
    }
}