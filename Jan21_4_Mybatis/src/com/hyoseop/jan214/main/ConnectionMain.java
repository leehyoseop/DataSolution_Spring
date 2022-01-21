package com.hyoseop.jan214.main;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionMain {
	public static void main(String[] args) {
		//Connection con = null;
		//PreparedStatement pstmt = null;
		SqlSession ss = null;// con + pstmt;
		
		try {
			InputStream is = Resources.getResourceAsStream("xxx.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory ssf = ssfb.build(is);
			ss = ssf.openSession();
			System.out.println("성공");
		} catch (Exception e) {
			// TODO: handle exception
		}
		ss.close();
	}
}
