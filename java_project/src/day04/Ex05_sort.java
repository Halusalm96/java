package day04;

import java.util.Scanner;

public class Ex05_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("===== sort =====");
			
			System.out.print("첫번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두전째 숫자 : ");
			int num2 = sc.nextInt();
			
			System.out.println("1.오름차순 2.내림차순. 0.종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1 ) {
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.println(i);
					}
				}else if (num1 < num2) {
					for (int i = num1; i <= num2; i++) {
						System.out.println(i);
					}
				}else {
					System.out.println(num1);
				}
			}else if (menu == 2) {
				if (num1 > num2) {
					for (int i = num1; i <= num2; i--) {
						System.out.println(i);
						}
				}else if (num1 < num2) {
						for (int i = num2; i >= num1; i--) {
							System.out.println(i);
						}
				}else {
					System.out.println(num1);
				}
			}else if (menu == 0) {
				run = false;
			}
			System.out.println();
		}
	}

}
