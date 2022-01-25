package com.hyoseop.jan252;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyoseop.jan252.phone.Phone;
import com.hyoseop.jan252.stock.Stock;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		// jan252Beans.xml 불러오기 -> 거기에 등록해 놓은 객체가 다 만들어짐.
		//AbstractApplication : Bean 객체를 생성하고 관리하는 기능
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("jan252Beans.xml");
		
		//aac가 없어질 때 jan252Beans.xml에 등록해놓은 객체들 다 없애라.
		aac.registerShutdownHook();
		
		//id가 s1인 Stock객체 불러오기
		Stock s = aac.getBean("s1", Stock.class);//xml객체
		System.out.println(s);
		
		Stock ss = aac.getBean("s2", Stock.class);
		System.out.println(ss.getName());
		System.out.println(ss.getPrice());
		
		Stock s3 = aac.getBean("s3", Stock.class);
		System.out.println(s3.getName());
		System.out.println(s3.getPrice());
		
		
		Phone p = aac.getBean("p1", Phone.class);
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getDate());
		
		Phone p2 = aac.getBean("p2", Phone.class);
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
		System.out.println(p2.getDate());
		
		//GC발동 (Garbage Collection) : 더이상 jan252Beans.xml에 접근할 일이 없어지면...
		
		//aac 없애기
		aac.close();
		
		return "home";
		
	}
	
}
