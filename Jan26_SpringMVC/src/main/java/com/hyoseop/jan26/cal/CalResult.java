package com.hyoseop.jan26.cal;

//멤버 변수명과 요청 파라미터 명을 같게!
public class CalResult {
	private String n;
	private int x;
	private int y;
	
	public CalResult() {
		// TODO Auto-generated constructor stub
	}

	public CalResult(String n, int x, int y) {
		super();
		this.n = n;
		this.x = x;
		this.y = y;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
