package day07;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문을 사용하여 콜라,사이다,환타,종료 만들기
		
		Scanner sc = new Scanner(System.in);
		int a = 10000;
		String[] product = new String[100];
		int cnt = 0;
		int col = 0;
		int sa = 0;
		int haon = 0;
		
		
		while(true) {
			System.out.printf("===== 자 판 기 ===== [%,d원]\n",a);
			System.out.println("1.콜라(1000) 2.사이다(1500) 3.환타(1800) 4.구매 목록 0.종료");
			System.out.print("메뉴입력 : ");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (a < 1000) {
					System.out.println("잔액 부족");
				}else {
					a -= 1000; 
					System.out.println("콜라");
					System.out.printf("남은 잔액 : %,d원\n", a);
					product[cnt++] = "콜라";
				}
			}else if (menu == 2 ) {
				if (a < 1500) {
					System.out.println("잔액 부족");
				}else {
					a -= 1500; 
					System.out.println("사이다");
					System.out.printf("남은 잔액 : %,d원\n", a);
					product[cnt++] = "사이다";
				}
			}else if (menu == 3) {
				if (a < 1800) {
					System.out.println("잔액 부족");
				}else {
					a -= 1800; 
					System.out.println("환타");
					System.out.printf("남은 잔액 : %,d원\n", a);
					product[cnt++] = "환타";
				}
			}else if (menu == 4) {
				System.out.println("====== 구매 목록 ======");
				System.out.println("======================");
				System.out.println("메뉴\t수량\t금액");
				for (int i = 0; i < cnt; i++) {
					if (product[i].equals("콜라")) {
						col++;
					}else if (product[i].equals("사이다")) {
						sa++;
					}else if (product[i].equals("환타")) {
						haon++;
					}
				}
				System.out.printf("콜라\t%d개\t%,d원\n",col,1000*col);
				System.out.printf("사이다\t%d개\t%,d원\n",sa,1500*sa);
				System.out.printf("환타\t%d개\t%,d원\n",haon,1800*haon);
				System.out.printf("총금액\t\t%,d원\n",1000*col+1500*sa+1800*haon);
				System.out.printf("남은 금액\t\t%,d원\n",a);
			}else if (menu == 0) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("0~3 중에서 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("자판기 종료");
	}

}
