package com.research.webscraper;

import com.research.webscraper.model.Product;
import com.research.webscraper.service.WebScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class WebScraperApplication implements CommandLineRunner {

	@Autowired
	private WebScraperService webScraperService;

	public static void main(String[] args) {
		SpringApplication.run(WebScraperApplication.class, args);
	}

	@Override
	public void run(String... args) {
		String apiUrl = "https://es.wallapop.com/app/search?category_ids=24200&object_type_ids=10310&keywords=Laptop&latitude=38.9690169&longitude=-0.1851574&filters_source=quick_filters";

		System.out.println("Iniciando el scraping de productos...");

		Flux<Product> productFlux = webScraperService.scrapeProducts(apiUrl);

		productFlux.doOnNext(product -> {
			System.out.println("Producto guardado: " + product.getTitle());
		}).blockLast();

		System.out.println("Scraping completado.");
	}
}