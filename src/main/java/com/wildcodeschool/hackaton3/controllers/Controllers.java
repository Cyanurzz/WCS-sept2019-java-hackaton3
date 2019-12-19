package com.wildcodeschool.hackaton3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.wildcodeschool.hackaton3.repos.UserRepository;
import com.wildcodeschool.hackaton3.services.ConnectApi;
import com.wildcodeschool.hackaton3.services.ConnectApiJourney;
import com.wildcodeschool.hackaton3.services.ConnectGOUV;
import com.wildcodeschool.hackaton3.services.JourneyPOJO;

@Controller
public class Controllers {

	@Autowired
    private UserRepository userRepo;
	
	@GetMapping("/")
    public String goLogin() {
		

        return "login";
    }

	@GetMapping("/index")
    public String goIndex(@RequestParam(required=true)String name) {

		
        return "home";
    }
	
	@GetMapping("/home")
    public String goHome(Model model, @RequestParam(required=true)String name) {

		model.addAttribute("user",userRepo.findByName(name));
        return "home";
    }	
	
	@GetMapping("/trajet")
    public String gotrajet(Model model) {
		return "trajet";
	}
	
	
	@GetMapping("/cadeau")
    public String goCadeau(Model model) {
		return "cadeau";
	}
    
	@PostMapping("/trajetResults")
    public String gotrajet(Model model, @RequestParam String adresse) {
		System.out.println(adresse);
		Double coords[] = ConnectGOUV.connectgouv(adresse.replace(' ','+'));
		String lon = coords[0].toString();
		String lat = coords[1].toString();
		String coord = lon + ";"+lat;
		System.out.println(coord);
		JourneyPOJO journeyPOJO = new JourneyPOJO();
		journeyPOJO = ConnectApiJourney.connectAPI(coord);
        return "testOPM";
    }	
}
