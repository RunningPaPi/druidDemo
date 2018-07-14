package com.artqiyi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@GetMapping("/index")
	public ModelAndView delUser(long id) {
		Map map = new HashMap();
		return new ModelAndView("category/index", map);
	} 
}
