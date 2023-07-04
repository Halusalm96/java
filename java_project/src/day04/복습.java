package day04;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력받은 수가 짝수,홀수,미지수 출력
		// 입력받은 수가 3의 배수, 7의 배수, 3과7의 배수, 둘다아님 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int number = sc.nextInt();
		
		if (number == 0) {
			System.out.println("미지수");
			System.out.println("둘다 아님");
		}else if (number % 2 ==0) {
			System.out.println("짝수");
			if (number % 3 == 0 && number % 7 == 0) {
				System.out.println("3과 7의 배수");
			}else if (number % 3 == 0) {
				System.out.println("3의 배수");
			}else if (number % 7 == 0) {
				System.out.println("7의 배수");
			}else {
				System.out.println("둘다 아님");
			}
		}else {
			System.out.println("짝수");
			if (number % 3 == 0 && number % 7 == 0) {
				System.out.println("3과 7의 배수");
			}else if (number % 3 == 0) {
				System.out.println("3의 배수");
			}else if (number % 7 == 0) {
				System.out.println("7의 배수");
			}else {
				System.out.println("둘다 아님");
			}
	}
	}
}
