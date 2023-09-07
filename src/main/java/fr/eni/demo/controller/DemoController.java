package fr.eni.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping({"/", "/accueil"})
	public String accueil() {
		return "accueil";
	}

	@GetMapping("/page1")
	public String page1() {
		return "page1";
	}
	
	@GetMapping("/page2")
	public String page2() {
		return "page2";
	}
	
	@GetMapping("/uneRoute")
	public String uneRoute() {
		return "page1";
	}
	
}
