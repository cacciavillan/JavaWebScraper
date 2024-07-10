package com.research.webscraper.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.research.webscraper.model.Location;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class LocationReadingConverter implements Converter<String, Location> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Location convert(String source) {
        try {
            return objectMapper.readValue(source, Location.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON to Location", e);
        }
    }
}