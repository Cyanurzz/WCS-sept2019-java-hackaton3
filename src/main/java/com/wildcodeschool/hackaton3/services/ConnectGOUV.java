package com.wildcodeschool.hackaton3.services;

import java.io.IOException;

import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javassist.bytecode.annotation.DoubleMemberValue;
import reactor.core.publisher.Mono;

public class ConnectGOUV {

	
	public static Double[] connectgouv(String adresse) {
		
		WebClient webClient = WebClient.create("https://api-adresse.data.gouv.fr/search/?q=" + adresse);
		Mono<String> call = webClient.get()
				.retrieve()
		      .bodyToMono(String.class);
		String response = call.block();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
		Double coords[] = new Double[2];
		
		try {

			JsonNode gouv = objectMapper.readTree(response);
			JsonNode features = gouv.get("features");
			JsonNode reponse = features.get(0);
			JsonNode geometry= reponse.get("geometry");
			JsonNode coordinates= geometry.get("coordinates");
			coords = objectMapper.treeToValue(coordinates,Double[].class);
			System.out.println(coordinates);
			System.out.println(coords[0]);
			System.out.println(coords[1]);

		} 
		
		catch (IOException e) {

		   e.printStackTrace();

		}
		
		return coords;
	}
}
