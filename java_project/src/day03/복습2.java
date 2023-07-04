package day03;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~10 출력
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// 10~1 출력
//		for (int i = 10; i > 0; i = i-1) {
//			System.out.println(i);
//		}
		
		//1~100 7의 배수 갯수 출력
//		int a = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				a++;
//			}
//		}
//		System.out.println(a);
		
		// 구구단 출력
//		int a = 8;
//		System.out.println(a + "단");
//		for (int i = 1; i < 10; i++) {
//			if (i == 5) {
//				System.out.println( );
//			}
//			System.out.println(a + " * " + i + " = " + (i*a));
//		}
//		System.out.println(a + "단 끝");
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int a = sc.nextInt();
		
//		while(a > 0) {
//			System.out.println("양수");
//			
//		}
		
//		while (true) {
//			System.out.print("숫자입력 : ");
//			int a = sc.nextInt();
//			if (a > 0) {
//				System.out.println("양수");
//			}else if (a <0) {
//				System.out.println("음수");
//			}else if (a == 0) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
		
		while (true) {
			System.out.print("숫자입력 : ");
			int a = sc.nextInt();
			if (a == 0) {
				break;
			}else if (a % 2 == 1) {
				System.out.println("홀수");
			}else if (a % 2 == 0) {
				System.out.println("짝수");
			}
		}
		System.out.println("반복문 종료");
		
		
	}

}
