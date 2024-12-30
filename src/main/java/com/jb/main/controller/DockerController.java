package com.jb.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/demo")
	public String demo() 
	{
		return "welcome to docker demo";
		//Added extra comment
	}
	
	@GetMapping("/gitdemo")
	public String gitdemo() 
	{
		return "welcome to git demo";
	}
//added new comment	
}
