package ex01;

import java.util.Scanner;

public class Repeat {
	public static void run () {
		// 반복문 (for,while)
		Scanner sc = new Scanner(System.in);
		boolean find = true;
		
		while (find) {
			System.out.println("===================================================");
			System.out.println("1.100까지합 | 2.100까지 짝수합 | 3.100까지 홀수합 | 0.종료");
			System.out.println("===================================================");
			System.out.print("선택 : ");
			String menu = sc.nextLine();
			int sum = 0;
			switch (menu) {
			case "1" : 
				for (int i = 1; i <= 100; i++) {
					sum += i;
				}
				System.out.println("합 : "+sum);
				break;
			case "2" : 
				for (int i = 1; i <= 100; i++) {
					if (i % 2 == 0) {
						sum += i;
					}
				}
				System.out.println("합 : "+sum);
				break;
			case "3" : 
				for (int i = 1; i <= 100; i++) {
					if (i % 2 != 0) {
						sum += i;
					}
				}
				System.out.println("합 : "+sum);
				break;
			case "0" : 
				find = false;
				break;
			default:
				System.out.println("다시 입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
