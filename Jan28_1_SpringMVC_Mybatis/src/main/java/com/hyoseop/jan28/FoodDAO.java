package com.hyoseop.jan28;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.multi.MultiButtonUI;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class FoodDAO {
	//@Autowired
	//private MultipartRequest m;
	@Autowired
	private SqlSession ss;

	public void reg(HttpServletRequest req) {
		String savePath = req.getSession().getServletContext().getRealPath("resources/img");
		System.out.println(savePath);
		//String savepath = "C:\Users\wtime\Desktop\SpringWorkspace\Jan28_1_SpringMVC_Mybatis\src\main\webapp\resources\img";
		int sizeLimit = 1024*1024*15;
		try {
			MultipartRequest m = new MultipartRequest(req, savePath, sizeLimit, "utf-8", new DefaultFileRenamePolicy());
			Food f = new Food();
			f.setMenu(m.getParameter("menu"));
			f.setPrice(new BigDecimal(m.getParameter("price").toString()));
			f.setFile_name(m.getFilesystemName("file_name"));
			
			if (ss.getMapper(FoodMapper.class).regFood(f) == 1) {
				req.setAttribute("r", "등록성공");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("r", "등록실패");
		}
	}
	
	public void sel(HttpServletRequest req) {
		try {
			req.setAttribute("result", ss.getMapper(FoodMapper.class).selFood());
			//req.setAttribute("r", "불러오기성공");
		} catch (Exception e) {
			// TODO: handle exception
			//req.setAttribute("r", "불러오기실패");
		}
	}
}
