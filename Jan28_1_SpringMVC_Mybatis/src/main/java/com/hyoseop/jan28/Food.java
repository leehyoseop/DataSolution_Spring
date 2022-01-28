package com.hyoseop.jan28;

import java.math.BigDecimal;

public class Food {
	private String menu;
	private BigDecimal price;
	private String file_name;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String menu, BigDecimal price, String file_name) {
		super();
		this.menu = menu;
		this.price = price;
		this.file_name = file_name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	
}
