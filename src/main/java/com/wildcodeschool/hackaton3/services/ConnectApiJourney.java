package com.wildcodeschool.hackaton3.services;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class ConnectApiJourney {
		
	public static Object connectAPI() {
		
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
		JourneyPOJO journeyPOJO = new JourneyPOJO(); 
		ArrayList<Coordinates> coordinatesList = new ArrayList<Coordinates>();
		try {

			JsonNode jsonData = objectMapper.readTree(response);
			JsonNode journeys = jsonData.get("journeys");
			JsonNode parentSection = journeys.get(0);
			JsonNode distances = parentSection.get("distances");
			JsonNode walking = distances.get("walking");
			JsonNode fare = parentSection.get("fare");
			JsonNode total = fare.get("total");
			JsonNode tarifCentimes = total.get("value");
			JsonNode co2 = parentSection.get("co2_emission");
			JsonNode co2Em = co2.get("value");
			JsonNode sections = parentSection.get("sections");
			JsonNode parentGeoJson = sections.get(0);
			JsonNode geoJson = parentGeoJson.get("geojson");
			JsonNode coordinates = geoJson.get("coordinates");
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
			Double lat = 0d;
			Double lon = 0d;			
			Coordinates coords = new Coordinates();
			for (int i = 0 ; i < coordinates.size() ; i++) {
				lon = mapper.treeToValue(coordinates.get(i).get(0), Double.class);
				lat = mapper.treeToValue(coordinates.get(i).get(1), Double.class);
				coords.setLat(lat);
				coords.setLon(lon);
				coordinatesList.add(coords);
			} 
			journeyPOJO.setWalkDistance(mapper.treeToValue(walking, Integer.class));
			journeyPOJO.setTarifCentimes(mapper.treeToValue(tarifCentimes, String.class));
			journeyPOJO.setCo2Emissions(mapper.treeToValue(co2Em, Double.class));
			journeyPOJO.setCoordinates(coordinatesList);
			
			return journeyPOJO;
		} 
		
		catch (IOException e) {

		   e.printStackTrace();

		}
		Object journey = null;
		return journey;
	}
}
	