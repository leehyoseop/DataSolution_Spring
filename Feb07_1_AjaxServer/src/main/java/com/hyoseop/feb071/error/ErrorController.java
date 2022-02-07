package com.hyoseop.feb071.error;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {
	@Autowired
	private ErrorDAO eDAO;
	
	@RequestMapping(value="/error.get",method = RequestMethod.GET, 
			produces = "application/json; charset=UTF-8")
	public @ResponseBody Errors Errorget(HttpServletRequest req, HttpServletResponse res) {
		//이 사이트 외부에서 AJAX가 가능하게(Cross-Domain AJAX) 하려면
		//응답파라미터를 추가하고, 아래처럼 헤더를 추가
		res.addHeader("Access-Control-Allow-Origin", "*");
		return eDAO.getJSON(req);
		
	}
	
	@RequestMapping(value="/someerror.get",method = RequestMethod.GET, 
			produces = "application/json; charset=UTF-8")
	public @ResponseBody Errors someErrorget(Error e, HttpServletRequest req, HttpServletResponse res) {
		//이 사이트 외부에서 AJAX가 가능하게(Cross-Domain AJAX) 하려면
		//응답파라미터를 추가하고, 아래처럼 헤더를 추가
//		Error e = new Error();
//		e.setE_what((String) req.getAttribute("e_what"));
//		e.setE_where(null);
		res.addHeader("Access-Control-Allow-Origin", "*");
		return eDAO.somegetJSON(req, e);
		
	}
}
