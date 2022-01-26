package com.hyoseop.jan26;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//JSP Model 2
	//http://IP:port/프로젝트명/컨트롤러파일명
	//C : Servlet
	//	상황판단 -> 흐름제어
	//	doGet(), doPost()
	//	주소에 컨트롤러파일명, 컨트롤러 하나당 GET하나, POST하나
	
	//Spring MVC
	//C : 일반 클래스
	//	일반 메소드
	//	컨트롤러 하나에 여러개의 요청 처리 가능 -> 컨트롤러가 많이 필요 없어짐
	//	go.home.lalala라는 주소로 GET방식 요청이 들어오면 이 메소드가 실행 
	@RequestMapping(value = "/go.home.lalala", method = RequestMethod.GET)
	public void goHomeLalala() {
		System.out.println("랄랄라~~~수요일이다~~~");
	}
	@RequestMapping(value = "/hyoseop.yes", method = RequestMethod.GET)
	public String hyoseopyes() {
		System.out.println("효솝");
		return "input";
	}
	
}
