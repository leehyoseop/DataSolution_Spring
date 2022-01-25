package com.hyoseop.jan251;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//Spring :  Java에서 IoC로 DI를 해주는 Framework
	//			객체를  .java에서 만들기 -X
	//			객체를 외부 파일(.xml파일)에 만들기 -> .java에서는 객체를 불러오게
	
	//사이트에 첫 접속 GET
	
	//DI(Dependency Injection - 의존성 주입)
	//			객체를 만들고, 속성 값 넣고...
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
}
