package com.hyoseop.jan25;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyoseop.jan25.fruit.Fruit;
import com.hyoseop.jan25.member.MemberDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private Fruit f;
	
	@Autowired
	private MemberDAO mDAO;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println(f.getName());
		System.out.println(f.getPrice());
		mDAO.test();
		return "home";
	}
	
}
//@Annotation : 사전적 의미로는 주석
//		코드 사이에 주석처럼 쓰이면서 기능을 수행하도록 하는 기술
//		-코드 작성시에 문법에러를 체크하도록 정보를 제공
//		-개발 툴이 코드를 자동으로 생성할 수 있도록
//		-실행시 특정한 기능을 수행하도록
//	종류
//	1.@Bean : 직접 제어가 불가능한 외부 라이브러리 등을 Bean으로 만들때 사용
//				ex) sqlsession / sqlsessionTemplate
//	2.@Autowired : 속석, setter, 생성자에서 사용, 타입에 따라서 Bean을 주입해준다
//	3.@Controller : Servlet에서 사용한 컨트롤러 
//	4.@RestController : 컨트롤러 중에서 view로 응답하지 않는 컨트롤러
//						data(json,xml) return이 주 목적
//	5.@ResponseBody : 자바 객체를 Http요청의 body의 내용으로 매핑해주는 역할
//	6.@Service : 어떤 기능을 수행하는 Class를 나타내는 용도
//	7.@XmlRootElement / @XmlElement : xml 파싱을 할때 사용하는 용도, 
//										특정한 데이터를 XML형식으로 만드는데 사용(마샬링) <-> (언마샬링)
//	XmlRootElement : Javabean 객체의 setter에 명시 / 
//	8.@RequestMapping : 요청에 따라 어떤 Controller, 어떤 Method가 구현될지 매핑하기 위해서 사용
//		value: 요청받을 주소를 설정
//		method: 어떤 방식으로 요청을 받을지 설정
//	9.@Requestparam : 요청 파라미터를 설정