package com.hyoseop.main.student;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO sDAO;
	
	@RequestMapping(value="/student.reg", method=RequestMethod.GET)
	public String reg(Student s, HttpServletRequest req) {
		sDAO.reg(s, req);
		return "index";
	}
	
	@RequestMapping(value="/student.sel", method=RequestMethod.GET)
	public String sel(Student s, HttpServletRequest req) {
		sDAO.sel(req);
		return "index";
	}
	
	
}
