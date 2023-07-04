package day02;

import java.util.Scanner;

public class Loop_while {

	public static void main(String[] args) {
		// for(변수선언, 조건식, 중간값) {

//	}

//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("enter number> ");
//			int num = sc.nexInt();
//			System.out.println(num); 
//			if (num == 0) {
//				break;
//			}
//		}
//		System.out.println("end loop");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("enter number> ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (num % 15 == 0) {
				System.out.println("Fizzbuzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}
		}
		System.out.println("end loop");

	}
}
