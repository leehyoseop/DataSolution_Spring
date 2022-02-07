package com.hyoseop.feb071.fruit;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitDAO {
	@Autowired
	private SqlSession ss;
	
	public void getAllFruit(HttpServletRequest req) {
		req.setAttribute("fruits", ss.getMapper(FruitMapper.class).getAllFruit());
	}
	
	//Spring에서 XML 끌어오는 시스템 : XML AJAX Server
	
	//Spring에서 XML 끌어오는 시스템 : XML AJAX Server
	//현재] DB에 있는 과일 데이터 하나를 표현할 Javabean을 가지고있음
	//우리가 필요한 것]
	//	1.DB에 있는 '과일테이블'을 표현할 또 하나의 JavaBean이 필요
	//	2.Spring이 XML로 바꿀 수 있도록 각각의 JavaBean에 @XMLRootElement라는 어노테이션을 달기
	//	3.Setter위에 @XMLElement 라는 어노테이션을 달기
	//	특정한 데이터 -> XMl형태로 만드는 것 : 마샬링
	
	public Fruits getXML(HttpServletRequest req) {
		return new Fruits(ss.getMapper(FruitMapper.class).getAllFruit());
	}
	
	public Fruits searchgetXML(Fruit f, HttpServletRequest req) {
		return new Fruits(ss.getMapper(FruitMapper.class).SearchFruit(f));
	} 
	
}
