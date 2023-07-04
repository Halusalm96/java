package day03;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000; // balance : 잔액
		
		while (run) {
			System.out.println("===========자 판 기=========== 잔액 : " + balance + "원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("매뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				if (balance < 1000) {
					System.out.println("잔액부족");
				}else {
					System.out.println("콜라");
					balance = balance - 1000;
				}
				break;
			case 2:
				if (balance < 1200) {
					System.out.println("잔액부족");
				}else {
					System.out.println("사이다");
					balance = balance - 1200;
				}
				break;
			case 3:
				if (balance < 1500) {
					System.out.println("잔액부족");
				}else {
					System.out.println("우유");
					balance = balance - 1500;
				}
				break;
			case 4:
				System.out.println("충전할 금액 : ");
				balance = balance + sc.nextInt();
				break;
			case 0:
				run = false;
				break;
				default:
					System.out.println("1~3 중에서 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("잔액 : " + balance + "원");
	}

}