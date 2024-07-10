package com.research.webscraper.config;

import com.research.webscraper.converter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.convert.R2dbcCustomConversions;
import org.springframework.data.r2dbc.dialect.DialectResolver;
import org.springframework.data.r2dbc.dialect.R2dbcDialect;
import org.springframework.r2dbc.core.DatabaseClient;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class R2dbcConfig {

    @Bean
    public R2dbcCustomConversions customConversions(DatabaseClient databaseClient) {
        R2dbcDialect dialect = DialectResolver.getDialect(databaseClient.getConnectionFactory());
        List<Object> converters = new ArrayList<>();
        converters.add(new LocationReadingConverter());
        converters.add(new LocationWritingConverter());
        converters.add(new ProductFlagsReadingConverter());
        converters.add(new ProductFlagsWritingConverter());
        converters.add(new ShippingReadingConverter());
        converters.add(new ShippingWritingConverter());
        return R2dbcCustomConversions.of(dialect, converters);
    }
}