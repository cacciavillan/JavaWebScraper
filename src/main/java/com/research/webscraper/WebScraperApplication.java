package com.research.webscraper;

import com.research.webscraper.service.WallapopScraperService;
import com.research.webscraper.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class WebScraperApplication implements CommandLineRunner {

	private final WallapopScraperService wallapopScraperService;

	@Autowired
	public WebScraperApplication(WallapopScraperService wallapopScraperService) {
		this.wallapopScraperService = wallapopScraperService;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebScraperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Puedes cambiar "iphone" por cualquier otra palabra clave que quieras buscar
		String keyword = "iphone";
		List<Product> scrapedProducts = wallapopScraperService.scrapeProducts(keyword);

		System.out.println("Scraped " + scrapedProducts.size() + " products for keyword: " + keyword);

		// Aquí puedes agregar más lógica para procesar o mostrar los productos scrapeados
		for (Product product : scrapedProducts) {
			System.out.println(product.toString());
		}
	}
}