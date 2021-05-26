package com.example.demo.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Notação que indica que é uma classe controladora
public class helloworldController {
	


   	@GetMapping("/hello")
	public String sayHello() {
   		
   		return "teste";
   	}

	

}
   
		

