package com.hyoseop.jan214.main;


import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SelectMain {
	public static void main(String[] args) {
		SqlSession ss =  null;
		try {
			// 연결
			InputStream is = Resources.getResourceAsStream("xxx.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory ssf = ssfb.build(is);
			ss=ssf.openSession();
			
			//값
			List<Fruit> fruits = ss.selectList("yyy.getAllfruit");
			
			for (Fruit f : fruits) {
				System.out.println(f.getF_name());
				System.out.println(f.getF_price());
				System.out.println("--------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
