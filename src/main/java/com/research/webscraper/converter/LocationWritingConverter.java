package com.research.webscraper.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.research.webscraper.model.Location;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class LocationWritingConverter implements Converter<Location, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convert(Location source) {
        try {
            return objectMapper.writeValueAsString(source);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting Location to JSON", e);
        }
    }
}