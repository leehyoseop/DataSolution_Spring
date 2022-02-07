package com.hyoseop.feb071;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyoseop.feb071.error.ErrorDAO;
import com.hyoseop.feb071.fruit.FruitDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private ErrorDAO eDAO;
	@Autowired
	private FruitDAO fDAO;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		eDAO.getAllError(req);
		fDAO.getAllFruit(req);
		return "index2";
	}
	
}
