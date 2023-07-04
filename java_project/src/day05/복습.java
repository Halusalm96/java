package day05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3/5의 배수 나누기
		Scanner sc = new Scanner(System.in);
		boolean login = true;
		
		while(login) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println("3과5의 배수입니다.");
			}else if (num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			}else if (num % 5 == 0) {
				System.out.println("5의 배수입니다.");
			}else {
				System.out.println("둘다아닙니다.");
			}
		}
		
		//1~입력받은 수까지의 합 출력
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				sum += i; 
			}
			System.out.println(sum);
			System.out.println();
		}
		
	}

}
