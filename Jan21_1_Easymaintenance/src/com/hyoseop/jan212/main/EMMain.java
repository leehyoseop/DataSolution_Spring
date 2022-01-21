package com.hyoseop.jan212.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


//유지보수
//IoC(Inversion Of Control) : 제어의 역전

//.java를 수정 안해도 프로그램이 수정되게
//프로그램 -> 파일(프로그램의 결과->파일에 저장) : 일반적인 흐름
//파일 -> 프로그램(파일로 프로그램을 제어)
public class EMMain {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			double point = 0;
			
			System.out.println("구매 금액 입력 : ");
			int price = input.nextInt();
			FileReader fr = new FileReader("C:\\Users\\wtime\\Desktop\\test\\pointRate.txt");
			BufferedReader br = new BufferedReader(fr);
			String pr = br.readLine();
			
			System.out.printf("가격  : %d원\n", price);
			
			point += Double.parseDouble(pr)*price;
			
			System.out.printf("%.0f포인트\n", point);
			
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
