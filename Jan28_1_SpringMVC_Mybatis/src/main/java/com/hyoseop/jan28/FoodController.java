package com.hyoseop.jan28;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FoodController {
	
	@Autowired
	private FoodDAO fDAO;
	
	@RequestMapping(value="/food.reg", method=RequestMethod.POST)
	public String reg(HttpServletRequest req) {
		fDAO.reg(req);
		return "register";
	}
	
	@RequestMapping(value="/food.sel", method=RequestMethod.POST)
	public String sel(HttpServletRequest req) {
		fDAO.sel(req);
		return "register";
	}
}
