package com.hyoseop.jan214.main;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class insertMain {
	public static void main(String[] args) {
		SqlSession ss =  null;
		try {
			// 연결
			InputStream is = Resources.getResourceAsStream("xxx.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory ssf = ssfb.build(is);
			ss=ssf.openSession();
			
			//값
			Scanner k = new Scanner(System.in);
			System.out.println("과일 이름 : ");
			String name = k.next();
			System.out.println("가격 : ");
			BigDecimal price = k.nextBigDecimal();
			
			//입력받은 값들을 javabean에 보낼것!
			Fruit f = new Fruit(name, price);
			
			if (ss.insert("yyy.registerfruit", f)==1) {
				System.out.println("성공!");
				ss.commit(); 
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
