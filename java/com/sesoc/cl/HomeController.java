package com.sesoc.cl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home1() {
		return "home";
	}
	
	@RequestMapping(value = "intercepted", method = RequestMethod.GET)
	public String intercepted() {
		return "error/unexpected_access";
	}
	
}
