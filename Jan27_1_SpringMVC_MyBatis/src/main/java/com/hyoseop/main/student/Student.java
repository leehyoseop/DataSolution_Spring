package com.hyoseop.main.student;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

//Mybatis :ORM(Object Relationship Mapping) Framework - 결과를 자바객체로
//		DB컬럼명 = 멤버변수명
//		Oracle number -> Java Bigdecimal

//Spring MVC : 요청 파라미터를 자동으로 객체로 바꿔준다.
//	요청파라미터명 = 멤버변수명

//Spring MVC + MyBatis
//	요청파라미터명 = 멤버변수명 = DB컬럼명

@Service
public class Student {
	private BigDecimal s_no;
	private String s_name;
	private String s_nickname;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(BigDecimal s_no, String s_name, String s_nickname) {
		super();
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_nickname = s_nickname;
	}
	
	public BigDecimal getS_no() {
		return s_no;
	}

	public void setS_no(BigDecimal s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_nickname() {
		return s_nickname;
	}

	public void setS_nickname(String s_nickname) {
		this.s_nickname = s_nickname;
	}

}
