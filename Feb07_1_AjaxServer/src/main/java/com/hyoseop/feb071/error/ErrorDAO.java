package com.hyoseop.feb071.error;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorDAO {
	@Autowired
	private SqlSession ss;
	
	public void getAllError(HttpServletRequest req) {
		req.setAttribute("errors", ss.getMapper(ErrorMapper.class).getAllError());
	}
	  
	public Errors getJSON(HttpServletRequest req) {
		List<Error> errors = ss.getMapper(ErrorMapper.class).getAllError();
		Errors errorss = new Errors(errors);
		return errorss;
	}
	public Errors somegetJSON(HttpServletRequest req, Error e) {
//		List<Error> errors = ss.getMapper(ErrorMapper.class).getMyinput(e);
//		Errors errorss = new Errors(errors);
//		return errorss;
//		
		return new Errors(ss.getMapper(ErrorMapper.class).getMyinput(e));
	}
	
}
