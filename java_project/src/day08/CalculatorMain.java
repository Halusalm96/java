package day08;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator 객체 만들기
		// 모든 메서드 호출하여 더하기 빼기 곱하기 나누기 값 출력
		Scanner sc = new Scanner(System.in);
		
		Calculator C1 = new Calculator();
		
		C1.num1 = sc.nextInt();
		C1.num2 = sc.nextInt();
		
		
		
		C1.sum();
		C1.sub(6,3);
		System.out.println(C1.mul());
		System.out.println(C1.div(6,3));
		
		
		
	}

}
