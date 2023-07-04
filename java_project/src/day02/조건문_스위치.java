package day02;

import java.util.Scanner;

public class 조건문_스위치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	   
//		int a = sc.nextInt();
//		String a = sc.next();
		
//		switch (a) {
//		case "A":
//			System.out.println(a + " 을 선택했습니다.");
//			break;
//		case "B":
//			System.out.println(a + " 을 선택했습니다.");
//			break;
//		case "C":
//			System.out.println(a + " 을 선택했습니다.");
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다.");
//		}
		System.out.println("월입력> ");
		int month = sc.nextInt();
		
//		switch(month) {
//		case 1:
//			System.out.println("January 입니다.");
//			break;
//		case 2:
//			System.out.println("February 입니다.");
//			break;
//		case 3:
//			System.out.println("March 입니다.");
//			break;
//		case 4:
//			System.out.println("Aprill 입니다.");
//			break;
//		case 5:
//			System.out.println("May 입니다.");
//			break;
//		case 6:
//			System.out.println("June 입니다.");
//			break;
//		case 7:
//			System.out.println("July 입니다.");
//			break;
//		case 8:
//			System.out.println("August 입니다.");
//			break;
//		case 9:
//			System.out.println("September 입니다.");
//			break;
//		case 10:
//			System.out.println("Octember 입니다.");
//			break;
//		case 11:
//			System.out.println("November 입니다.");
//			break;
//		case 12:
//			System.out.println("December 입니다.");
//			break;
//		default:
//				System.out.println("잘못입력하셨습니다.");
//			
//		}
		
		
		if(month==1) {
			System.out.println("January 입니다.");
		}else if (month ==2) {
			System.out.println("February 입니다.");
		}else if (month ==3) {
			System.out.println("March 입니다.");
		}else if (month ==4) {
			System.out.println("April 입니다.");
		}else if (month ==5) {
			System.out.println("May 입니다.");
		}else if (month ==6) {
			System.out.println("June 입니다.");
		}else if (month ==7) {
			System.out.println("July 입니다.");
		}else if (month ==8) {
			System.out.println("August 입니다.");
		}else if (month ==9) {
			System.out.println("September 입니다.");
		}else if (month ==10) {
			System.out.println("October 입니다.");
		}else if (month ==11) {
			System.out.println("November 입니다.");
		}else if (month ==12) {
			System.out.println("December입니다.");
		}else {
				System.out.println("잘못입력하셨습니다.");
			
		}
	}

}
