package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.second.controller.Topic;

@RestController
public class FrontController {
	
	@RequestMapping("/welcome")
	public List<Topic> getTopic() {
		return  Arrays.asList(
				new Topic(1,"collection","blackBook"),
				new Topic(2,"DDl","blackBook"),
				new Topic(3,"Spring","blackBook")
				);
				
				
	}

}
