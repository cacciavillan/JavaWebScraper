package com.research.webscraper.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.research.webscraper.model.Shipping;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class ShippingWritingConverter implements Converter<Shipping, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convert(Shipping source) {
        try {
            return objectMapper.writeValueAsString(source);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting Shipping to JSON", e);
        }
    }
}