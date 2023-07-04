package day04;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		while(run) {
			System.out.printf("===== 자 판 기 =====[%,d원]\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.환타(1500) 4.충전 0.종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (balance >= 1000) {
					balance = balance - 1000;
					System.out.println("콜라 선택");
					System.out.printf("잔액 : [%,d원]\n",balance);
				}else {
					System.out.println("잔액부족");
				}
			}else if (menu == 2) {
				if (balance >= 1200) {
					balance = balance - 1200;
					System.out.println("사이다 선택");
					System.out.printf("잔액 : [%,d원]\n",balance);
				}else {
					System.out.println("잔액부족");
				}
			}else if (menu == 3) {
				System.out.println("황타 선택");
				if (balance >= 1500) {
					balance = balance - 1500;
					System.out.printf("잔액 : [%,d원]\n",balance);
				}else {
					System.out.println("잔액부족");
				}
			}else if (menu == 4) {
				System.out.print("충전할 금액 : ");
				int inMoney = sc.nextInt();
				balance += inMoney;
			}else if (menu == 0) {
				run = false;
			}else {
				System.out.println("1~3중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
