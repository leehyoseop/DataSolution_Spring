package com.hyoseop.main.student;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void reg(Student s, HttpServletRequest req) {
		try {
			//연결 자동(sqlsessionTemplate 객체 때문)
			//값 받기 & 객체로 만들기 - Spring이 자동으로 해결해놨음
			//SQL, 실행 - Mybatis를 활용...
//			StudentMapper sm = ss.getMapper(StudentMapper.class);
//			
//			if (sm.regHaha(s)==1) {
//				req.setAttribute("r", "등록성공");
//				ss.commit();
//			}
			if (ss.getMapper(StudentMapper.class).regHaha(s) == 1) {
				req.setAttribute("r", "등록성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "등록실패");
		}
//		ss.close();
	}
	
	public void sel(HttpServletRequest req) {
		try {
			req.setAttribute("result", ss.getMapper(StudentMapper.class).selSt());
			//req.setAttribute("r", "불러오기성공");
		} catch (Exception e) {
			// TODO: handle exception
			//req.setAttribute("r", "불러오기실패");
		}
	}
}
