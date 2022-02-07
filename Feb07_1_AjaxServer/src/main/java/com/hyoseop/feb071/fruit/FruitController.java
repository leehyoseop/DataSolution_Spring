package com.hyoseop.feb071.fruit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FruitController {
	@Autowired
	private FruitDAO fDAO;
	
	@RequestMapping(value="/fruit.get",method=RequestMethod.GET,
			produces="application/xml; charset=UTF-8")
	public @ResponseBody Fruits fruitGetXML(HttpServletRequest req) {
		return fDAO.getXML(req);		
	}
	@RequestMapping(value="/searchfruit.get",method=RequestMethod.GET,
			produces="application/xml; charset=UTF-8")
	public @ResponseBody Fruits searchfruitGetXML(Fruit f,HttpServletRequest req) {
		return fDAO.searchgetXML(f, req);		
	}
}
