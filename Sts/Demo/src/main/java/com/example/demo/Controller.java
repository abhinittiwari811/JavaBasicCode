package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
	@RequestMapping(value="/boot")
	public ModelAndView hello(@RequestParam("name") String myName) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("name" ,myName);
		mv.setViewName("index");
		return mv;
		
	}

}
