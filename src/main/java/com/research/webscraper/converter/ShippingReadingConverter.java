package com.research.webscraper.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.research.webscraper.model.Shipping;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class ShippingReadingConverter implements Converter<String, Shipping> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Shipping convert(String source) {
        try {
            return objectMapper.readValue(source, Shipping.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON to Shipping", e);
        }
    }
}