package com.research.webscraper.config;

import com.research.webscraper.http.HttpClient;
import com.research.webscraper.http.SimpleHttpClient;
import com.research.webscraper.http.ProxyHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {

    @Value("${use.proxy:false}")
    private boolean useProxy;

    @Value("${proxy.host:}")
    private String proxyHost;

    @Value("${proxy.port:0}")
    private int proxyPort;

    @Bean
    public HttpClient httpClient() {
        if (useProxy) {
            return new ProxyHttpClient(proxyHost, proxyPort);
        } else {
            return new SimpleHttpClient(new RestTemplate());
        }
    }
}