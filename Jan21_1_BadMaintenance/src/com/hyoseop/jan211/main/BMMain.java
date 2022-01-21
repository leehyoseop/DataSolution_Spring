package com.hyoseop.jan211.main;

import java.util.Scanner;

//홈플러스 사장(부천)
//		구매금액을 입력하면 적립포인트(구매금액의 1프로)를 계산
//		개발자 의뢰
//		-> 0.7프로로 바꿔줘!

//개발자(선릉)
//		개발->테스트 -compile -> 기계어(.class) -실행 -> 테스트
//		기계어(.class) -압축-> 배포파일(.jar)[.bat] -사장님에게 전달->
//		배포

public class BMMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double point = 0;
		
		System.out.println("구매 금액 입력 : ");
		int price = input.nextInt();
		point += 0.01*price;
		System.out.printf("%.0f포인트\n", point);
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
