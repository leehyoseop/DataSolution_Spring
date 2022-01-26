package com.hyoseop.unitconvert;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ConvertController {
	@Autowired
	private ConvertDAO cdo;
	@Autowired
	private ConvertObj inunitbean;
	@Autowired
	private 
	
	@RequestMapping(value="/convert.do", method=RequestMethod.GET)
	public String Convert(HttpServletRequest req, ConvertObj cobj) {
		int choice = Integer.parseInt((String)req.getAttribute("unitselect"));
		int output=0;
//		//ConvertObj c = new ConvertObj();
//		
//		if (choice == 1) {
//			cobj.setInput((String)req.getAttribute("input"));
//			cobj.setInunit(inunit);
//		
//			
//		} else if (choice == 2) {
//			
//		} else if (choice == 3) {
//			
//		} else if (choice == 4) {
//			
//		}
		
		
		return "output";
	}
}
