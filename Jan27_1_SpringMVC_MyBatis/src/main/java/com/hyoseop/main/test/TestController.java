package com.hyoseop.main.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@Autowired
	private TestDAO tDAO;
	
	@RequestMapping(value="/test.reg", method=RequestMethod.GET)
	public String reg(Test t, HttpServletRequest req) {
		tDAO.reg(t, req);
		return "index";
	}
	
	@RequestMapping(value="/test.sel", method=RequestMethod.GET)
	public String sel(HttpServletRequest req) {
		tDAO.sel(req);
		return "index";
	}
}
