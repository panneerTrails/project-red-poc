package com.project.red.poc.controller;

@Controller
public class GreetController {
	@RequestMapping(path = "/greet/{name}", method = RequestMethod.GET)
	public String greet(@PathVariable String name) {
		String greet = " Hello !!!" + name + " How are You?";
		return "greet";
	}

}
