package com.wildcodeschool.hackaton3.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.hackaton3.entities.User;
import com.wildcodeschool.hackaton3.entities.Stats;
import com.wildcodeschool.hackaton3.repos.StatRepository;
import com.wildcodeschool.hackaton3.repos.UserRepository;
	

@Controller
public class StatsController {
	
	@Autowired
	private StatRepository statRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/statstest")
	public String toStat1(Model model) {
		
		return "statstest";
	}
	
	@GetMapping("/newResultStat")
	public String toStat2(Model model) {
		
		return "newResultStat";
	}

	
	@GetMapping("/stats")
	public String toStats(Model model)  { //@RequestParam long id,
		
		long id = 1;
		long idC = 1;
		long idT = 2;
		long idB =3;
		long idBi =4;
		long idBi1 = 5;
		long idR =6;
		
		Stats car = statRepository.getOne(idC);
		Stats tram = statRepository.getOne(idT);
		Stats bus = statRepository.getOne(idB);
		Stats bike = statRepository.getOne(idBi);
		Stats bikeSS = statRepository.getOne(idBi1);
		Stats rocket = statRepository.getOne(idR);
		Stats[] vehicles = {car, tram, bus, bike,bikeSS,rocket};
		
		User myUser = userRepository.getOne(id);
		
		
		ArrayList<String> res = new ArrayList<String>();
		
		
		for(Stats vehicle: vehicles) {
			
			
		}
		
		
		//Rejet Kilométrique de co2 pour une voiture
		Double rejetCar = myUser.gettCar() *  car.getCO2();
		System.out.println(rejetCar);
		
		
		
		res.add("Le savais tu ?  En moyenne on passe 7820h par ans pour aller et rentrer du travail ... On lit en moyenne 300 mots par minutes, ce qui fait un livre toutes les 3 heures environ... Ça ferais beaucoup de livre en 1 ans ...");
		res.add("En partant du principe que la nourriture est un carburant, une portions de pates sans accompagnement emmet 3,1 grammes de CO2 a la production, la marche ou le vélo sont donc les moyens les plus éconnomes.");
		model.addAttribute("stats", res);
		return "stats";
	}
	
}
