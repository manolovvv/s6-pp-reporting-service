package com.reportingservice.reporting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ReportingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportingApplication.class, args);
	}

	@Autowired
	private WebClient.Builder webClientBuilder;

	@Bean
	public void loadData() {
		String url = String.format("https://api.ipify.org?format=json");
		Object obj = webClientBuilder
				.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(Object.class)
				.block();

		// fetch all customers
		System.out.println("-------------------------------------");

		System.out.println(obj.toString());
	}

}
