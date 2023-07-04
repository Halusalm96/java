package day08;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 10000;
		
		while(true) {
			System.out.printf("================ 자 판 기 ================= [%,d원]\n",cnt);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.환타(1500) 4.충전 0.종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (cnt >= 1000) {
					System.out.println("콜라 선택");
					cnt = cnt - 1000;
					System.out.printf("잔액 : %d원\n",cnt);
				}else {
					System.out.println("잔액 부족");
				}
			}else if (menu == 2) {
				if (cnt >= 1200) {
					System.out.println("사이다 선택");
					cnt = cnt - 1200;
					System.out.printf("잔액 : %d원\n",cnt);
				}else {
					System.out.println("잔액 부족");
				}
			}else if (menu == 3) {
				if (cnt >= 1500) {
					System.out.println("환타 선택");
					cnt = cnt - 1500;
					System.out.printf("잔액 : %d원\n",cnt);
				}else {
					System.out.println("잔액 부족");
				}
			}else if (menu ==  4) {
				System.out.print("충전 금액 입력 : ");
				int ple = sc.nextInt();
				cnt = cnt +ple;
				System.out.printf("잔액 : %d원\n",cnt);
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~3 중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("자판기 종료");
	}

}
