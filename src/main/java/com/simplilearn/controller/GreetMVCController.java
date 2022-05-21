package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.publisher.NewsEventPublisher;
	//import org.springframework.web.bind.annotation.RequestMapping;



	
	@Controller
	public class GreetMVCController {
		
		@Autowired
		NewsEventPublisher publisher;
		
	
		@GetMapping("/greet")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
			// Do Your Business Logic Here...
			model.addAttribute("name", "Snigdha");
			
			
			
			publisher.publish();
			
			return "hello";
		
	}
	}