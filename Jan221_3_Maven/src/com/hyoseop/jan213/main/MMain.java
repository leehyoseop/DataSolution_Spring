package com.hyoseop.jan213.main;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.json.simple.JSONObject;
import org.xmlpull.v1.XmlPullParser;

import com.hyoseop.db.manager.HyoseopDBManager;
import com.hyoseop.dec224.httpclient.HSHTTPclient;

//Java 전 세계적으로 많이 사용
//개발자들이 본인이 만들어 놓은 것들을 공유
//소스 자체를 공유 X, .jar 파일 만들어서 공유하는 문화 O
//.jar 파일을 자동으로 관리해주는 시스템 : Maven
//Maven의 중앙 저장소 : https://mvnrepository.com/

//Maven을 활용하면
//	Maven 중앙 저장소에 있는 .jar파일
//	컴퓨터의 Maven 로컬 저장소 

//Maven 중앙저장소에 없는 것들 : 로컬 저장소를 활용하면 됨!
//우리가 만든 보물들... dbm, hc, ...

public class MMain {
	public static void main(String[] args) {
		XmlPullParser xpp;
		JSONObject jo;
		HSHTTPclient hhc;
		HyoseopDBManager hsdbm;	
	}
}
