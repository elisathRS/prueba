package com.mycode.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class ControllerBasic {
	
	@GetMapping(path = {"/saludar", "/holamundo"})
	public String saludar() {	
		return "index";
	}

}
