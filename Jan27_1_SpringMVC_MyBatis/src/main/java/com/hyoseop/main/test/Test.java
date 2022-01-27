package com.hyoseop.main.test;

import org.springframework.stereotype.Service;

@Service
public class Test {
	private String subject;
	private String year;
	private String month;
	private String day;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(String subject, String year, String month, String day) {
		super();
		this.subject = subject;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
}
