package com.example.moviecatalogapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieCatalogAPIService {

	@Bean
	public RestTemplate getRestTemplete()
	{
		return new RestTemplate();
	}

	@Bean
	public WebClient.Builder getWebClientBuilder()
	{
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogAPIService.class, args);
	}

}
