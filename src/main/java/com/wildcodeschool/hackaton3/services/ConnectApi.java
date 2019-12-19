package com.wildcodeschool.hackaton3.services;

import java.io.IOException;

import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class ConnectApi {

	
	public static void connectAPI() {
		
		WebClient webClient = WebClient.create("https://api.navitia.io/v1");
		//coverage/fr-cen/journeys?from=1.91909%3B47.91939&to=1.95634%3B47.92388&"
		Mono<String> call = webClient.get()
				.uri(uriBuilder-> uriBuilder
						.path("/coverage/{coverage}/journeys")
						  .queryParam("from", "1.91523;47.92066")
						  .queryParam("to", "1.94973;47.92393")			       
						  .build("fr-cen"))  
				.headers(headers -> headers.setBasicAuth("a3653e1d-06a1-4edc-b768-c9bd561d3251", ""))
				.retrieve()
		      .bodyToMono(String.class);
		String response = call.block();
		ObjectMapper objectMapper = new ObjectMapper();

		try {

			JsonNode journey = objectMapper.readTree(response);
			System.out.println(journey);
		} 
		
		catch (IOException e) {

		   e.printStackTrace();

		}
	}
}
