package day01;

import java.util.Scanner;

public class 조건문_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       예시
//		 int age = 30;
//		 if(age >= 19) {
//			 System.out.println("성인입니다.");
//		 }else if(age >= 13) {
//			 System.out.println("청소년입니다.");
//		 }else if(age >=8){
//			 System.out.println("초등학생입니다.");
//		 }else {
//			 System.out.println("어린이입니다.");
//		 }
//		
//		// 문제 : a의 변수의 값에 따라 "양수", "음수", "0"을 출력하시오
//		int a  = -9;
//		if (a > 0) {
//			System.out.println("양수");
//		}else if (a < 0) {
//			System.out.println("음수");
//		}else {
//			System.out.println("0");
//		}
//		
//		// 문제 : 변수 score의 값에 따라
//		// 90이상 A
//		// 80이상 B
//		// 70이상 C
//		// 60이상 D
//		// 60미안 F
//		int score = 40;
//		if (score >= 90) {
//			if (score >= 95) {
//				System.out.println("A+");
//			}else {
//				System.out.println("A");
//			}
//		}else if (score >= 80) {
//			if (score >= 85) {
//				System.out.println("B+");
//			}else {
//			System.out.println("B");
//			}
//		}else if (score >= 70) {
//			if (score >= 75) {
//				System.out.println("C+");
//			}else {
//			System.out.println("C");
//			}
//		}else if (score >= 60) {
//			if (score >= 65) {
//				System.out.println("D+");
//			}else {
//			System.out.println("D");
//			}
//		}else {
//			System.out.println("F");
//		}
		
		// 변수 a의 값에 따라 "양수", "음수", "0" 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int a = sc.nextInt();
//		if (a > 0) {
//			System.out.println("양수");
//		}else if (a < 0) {
//			System.out.println("음수");
//		}else {
//			System.out.println("0");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이입력 : ");
//		int age = sc.nextInt();
//		
//		if (age >= 19) {
//			System.out.println("성인");
//		}else if (age >= 13) {
//			System.out.println("청소년");
//		}else if (age >= 8) {
//			System.out.println("초등학생");
//		}else {
//			System.out.println("어린이");
//		}
		
		// 문제 : 변수 num의 값에 따라 짝수, 홀수, 0 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자입력 : ");
//		int num = sc.nextInt();
//		
//		if (num == 0) {
//			System.out.println("0");
//		}else if (num % 2 == 1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
		
		// 변수 num의 값에 따라 3의 배수, 5의 배수, 3과5의 배수 둘다 아님 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("3,5의 배수");
		}else if (num % 3 == 0) {
			System.out.println("3의 배수");
		}else if (num % 5 == 0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("둘다 아닙니다.");
		}
		
		// 가장 큰 수 출력
		int a = 10;
		int b = 15;
		int c = 12;
		
		if(a > b && a > c) {
			System.out.println("a(" + a + ")가 가장 큰 수 입니다.");
		}else if (b > a && b > c) {
			System.out.println("b(" + b + ")가 가장 큰 수 입니다.");
		}else {
			System.out.println("c(" + c + ")가 가장 큰 수 입니다.");
		}
		
	}
}
