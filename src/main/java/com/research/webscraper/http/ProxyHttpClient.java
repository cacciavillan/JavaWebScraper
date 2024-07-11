package com.research.webscraper.http;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Component
public class ProxyHttpClient implements HttpClient {

    private final RestTemplate restTemplate;

    public ProxyHttpClient(String proxyHost, int proxyPort) {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
        requestFactory.setProxy(proxy);
        this.restTemplate = new RestTemplate(requestFactory);
    }

    @Override
    public String get(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}