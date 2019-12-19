package com.wildcodeschool.hackaton3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wildcodeschool.hackaton3.repos.UserRepository;
import com.wildcodeschool.hackaton3.services.ConnectApi;

@Controller
public class Controllers {

	@Autowired
    private UserRepository userRepo;
	
	@GetMapping("/")
    public String goLogin() {
		ConnectApi.connectAPI();
        return "login";
    }

	@GetMapping("/index")
    public String goIndex(@RequestParam(required=true)String name) {
		ConnectApi.connectAPI();
        return "home";
    }
	
	@GetMapping("/home")
    public String goHome(Model model, @RequestParam(required=true)String name) {

		model.addAttribute("user",userRepo.findByName(name));
        return "home";
    }	
}
