package com.hyoseop.jan25;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyoseop.jan25.human.Human;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("object.xml");
		aac.registerShutdownHook();
		Human h1 = aac.getBean("h1", Human.class);
		System.out.println(h1.getName());
		System.out.println(h1.getAge());
		for (String n : h1.getNickname()) {
			System.out.println(n);
		}
		System.out.println(h1.getFamily().get("아버지"));
		System.out.println(h1.getFamily().get("어머니"));
		System.out.println(h1.getPet().getName());
		System.out.println(h1.getPet().getAge());
		System.out.println(h1.getPet2().getName());
		System.out.println(h1.getPet2().getAge());
		
		return "home";
	}
	
}
