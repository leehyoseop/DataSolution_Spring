package com.hyoseop.jan26.cal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class CalDAO {
	public void calculate(CalResult cr, HttpServletRequest req) {
		int add = cr.getX() + cr.getY();
		req.setAttribute("r", add);
	}
}
