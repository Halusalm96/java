package day03;

import java.util.Scanner;

public class Ex01_drink_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 3000; // balance : 잔액
		
		while (run) {
			System.out.println("===========자 판 기=========== 잔액 : " + balance + "원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.print("매뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (balance < 1000) {
					System.out.println("잔액 부족");
				}else if (balance >= 1000) {
					System.out.println("콜라");
					balance = balance - 1000;
				}
			}else if (menu == 2) {
				if (balance < 1200) {
					System.out.println("잔액 부족");
				}else if (balance >= 1500) {
					System.out.println("사이다");
					balance = balance - 1200;
				}
			}else if (menu == 3) {
				if (balance < 1500) {
					System.out.println("잔액 부족");
				}else if (balance >= 1500) {
					System.out.println("우유");
					balance = balance - 1500;
				}
			}else if (menu == 4) {
				System.out.print("충전할 금액 : ");
				balance = balance + sc.nextInt();
			}else if (menu == 0) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("1~3 중에서 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("잔액 : " + balance + "원");
	}

}
