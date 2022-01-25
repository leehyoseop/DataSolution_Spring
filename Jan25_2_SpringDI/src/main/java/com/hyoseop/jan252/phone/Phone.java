package com.hyoseop.jan252.phone;

import java.util.Date;

public class Phone {
	private String name;
	private int price;
	private String date;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, int price, String date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
