package com.hyoseop.jan26.cal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//새 패키지를 만들때는 top-level 뒤에 name추가


@Controller
public class CalController {
	@Autowired
	private CalDAO cd;
	//1.JSP스타일 - 파일 업로드, 날짜, ... -> Spring이 있다고 거르지 말자!
//	@RequestMapping(value = "/calculate.do", method = RequestMethod.GET)
//	public String CalXY(HttpServletRequest req) {
//		int x = Integer.parseInt(req.getParameter("x"));
//		int y = Integer.parseInt(req.getParameter("y"));
//		System.out.println(x);
//		System.out.println(y);
//		return "input";
//	}
	
	//POST방식 요청파라미터(내부...) 한글처리 : 프로젝트설정(web.xml)
	
	//2. Spring 스타일
//	@RequestMapping(value = "/calculate.do", method = RequestMethod.POST)
//	public String CalXY(@RequestParam(value="n")String n,
//			@RequestParam(value="x")int x, @RequestParam(value="y")int y) {
//		System.out.println(n);
//		System.out.println(x);
//		System.out.println(y);
//		return "input";
//	}
	
	//3. Spring 스타일2-요청파라미터를 JavaBean객체로
	@RequestMapping(value="/calculate.do", method=RequestMethod.POST)
	public String CalXY(CalResult cr, HttpServletRequest req) {
		cd.calculate(cr, req);
		return "input";  
	}
	
}
