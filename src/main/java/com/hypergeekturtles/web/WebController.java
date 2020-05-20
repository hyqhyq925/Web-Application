package com.hypergeekturtles.web;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
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
	@RequestMapping("/highlights.html")
	public String highlights() {
		return "highlights";
	}
	@RequestMapping("/covid19.html")
	public String covid19(Model model) {
		// pass the list to template
    		model.addAttribute("stateCovidList", stateCovidList);
   	 
    		return "covid19";
	}

	@RequestMapping("/corona.html")
	public String corona() {
		return "corona";
}
	private static List<StateCovid> stateCovidList = new ArrayList<>();
	
	public WebController() {
    	StateCovid alabama = new StateCovid("Alabama", 3953, 114, 0, 3839);
    	StateCovid alaska = new StateCovid("Alaska", 285, 9, 98, 276);
    	StateCovid california = new StateCovid("California", 25356, 768, 0, 24588);
    	StateCovid newYork = new StateCovid("New York", 203020, 10842, 23887, 192178);
    	
    		stateCovidList.add(newYork);
    		stateCovidList.add(alabama);
    		stateCovidList.add(alaska);
    		stateCovidList.add(california);
    		
		// TODO: add Alaska and California data to the list
	}
	
}
