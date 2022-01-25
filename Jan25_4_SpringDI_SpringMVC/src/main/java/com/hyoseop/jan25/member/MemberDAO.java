package com.hyoseop.jan25.member;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

//servlet-context.xml에 MemberDAO를 등록한 효과!
@Service
public class MemberDAO {
	@Autowired
	private SimpleDateFormat sdf;
	
	public void test() {
		Date now = new Date();
		System.out.println(sdf.format(now));
	}
}
