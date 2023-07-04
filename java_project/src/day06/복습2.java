package day06;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		
		while(run) {
			System.out.printf("===== 자 판 기 ===== [%,d원]\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1500) 3.환타(1800) 0.종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (balance < 1000) {
					System.out.println("잔액부족");
				}else {
					balance -= 1000;
					System.out.println("콜라");
					System.out.printf("잔액 : %,d원\n",balance);
				}
			}else if (menu == 2) {
				if (balance < 1500) {
					System.out.println("잔액부족");
				}else {
					balance -= 1500;
					System.out.println("사이다");
					System.out.printf("잔액 : %,d원\n",balance);
				}
			}else if (menu == 3) {
				if (balance < 1800) {
					System.out.println("잔액부족");
				}else {
					balance -= 1500;
					System.out.println("환타");
					System.out.printf("잔액 : %,d원\n",balance);
				}
			}else if (menu == 0) {
				System.out.println("종료");
				run = false;
			}else {
				System.out.println("0~3 중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
