package day02;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while (조건문) {실행문; 증감값}
//		int a = 1;
//		while(a<=10) {
//			System.out.println(a);
//			a++;
//		}

//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("숫자 입력 : ");
//			int num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//		}
//		System.out.println("프로그램 반복종료");
		
		// 반복해서 숫자를 입력받아 출력하는데, 3의 배수는 피즈, 5의 배수는 버즈, 3과5의 배수는 피즈버즈
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자입력 : ");
			int a = sc.nextInt();
			if (a == 0) {
				break;
			}else if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("피즈버즈");
			}else if (a % 3 == 0) {
				System.out.println("피즈");
			}else if (a % 5 == 0) {
				System.out.println("버즈");
			}else {
				System.out.println(a);
			}
		}
		System.out.println("프로그램 종료");
		
		
	}

}
