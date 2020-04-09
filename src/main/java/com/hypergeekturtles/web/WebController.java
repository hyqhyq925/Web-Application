package com.hypergeekturtles.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("/home.html")
	public String home() {
    		return "home";
	}
	@RequestMapping("/MJ.html")
	public String MJ() {
    		return "MJ";
	}
	@RequestMapping("/Magic.html")
	public String Magic() {
    		return "Magic";
	}
	@RequestMapping("/Bron.html")
	public String Bron() {
    		return "Bron";
	}
	@RequestMapping("/Kobe.html")
	public String Kobe() {
		return "Kobe";
}
}
