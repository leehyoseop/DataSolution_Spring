package com.hyoseop.main.test;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyoseop.main.student.StudentMapper;

@Service
public class TestDAO {

	@Autowired
	private SqlSession ss;
	
	public void reg(Test t, HttpServletRequest req) {
		try {
			if (ss.getMapper(TestMapper.class).regTest(t)==1) {
				req.setAttribute("t", "등록성공");
			}
		} catch (Exception e) {
			// TODO: handle exception
			req.setAttribute("t", "등록실패");
			e.printStackTrace();
		}
	}
	
	public void sel(HttpServletRequest req) {
		try {
			req.setAttribute("Testresult", ss.getMapper(TestMapper.class).selTest());
			//req.setAttribute("r", "불러오기성공");
		} catch (Exception e) {
			// TODO: handle exception
			//req.setAttribute("r", "불러오기실패");
		}
	}
}
