package day05;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean login = true;
		int jan = 10000;
		int col = 1000;
		int sa = 1200;
		int hoan = 1500;
		
		while(login) {
			System.out.printf("===== 자 판 기 ===== [잔액 : ,%d원]\n",jan);
			System.out.printf("1.콜라(%d) 2.사이다(%d) 3.환타(%d) 0.종료\n",col,sa,hoan);
			System.out.print("메뉴선택 : ");
			int num = sc.nextInt();
			
			if (num == 1) {
				if (jan > col) {
					System.out.printf("잔액부족 [잔액 : %d]",col);
				}else {
					
				}
				System.out.println("콜라 선택");
				jan -= col;
			}else if (num == 2) {
				if (jan > sa) {
					System.out.printf("잔액부족 [잔액 : %d]",sa);
				}else {
					
				}
				System.out.println("사이다 선택");
				jan -= sa;
			}else if (num == 3) {
				if (jan > hoan) {
					System.out.printf("잔액부족 [잔액 : %d]",hoan);
				}else {
					
				}
				System.out.println("환타 선택");
				jan -= hoan;
			}else if (num == 4) {
				System.out.println("종료");
				login = false;
			}else {
				System.out.println("1~3 중에 선택하세요.");
			}
			System.out.println();
		}
		
	}

}
