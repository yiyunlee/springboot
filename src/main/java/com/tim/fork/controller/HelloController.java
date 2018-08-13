package com.tim.fork.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {		
		return "hello fork!";
	}
	
	@RequestMapping("/hellojsp")
	public String hellojsp(Model m) {		
		m.addAttribute("now",DateFormat.getTimeInstance().format(new Date()));
		return "hellojsp";
	}

}
