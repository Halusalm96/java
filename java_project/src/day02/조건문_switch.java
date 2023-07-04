package day02;

import java.util.Scanner;

public class 조건문_switch {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
////		int a = sc.nextInt();
//		String a = sc.next();
//		
//		// switch (변수) {case 조건 : 실행문; break; default : 실행문;}
//		switch(a) {
//		case "1" :
//			System.out.println("1을 선택하였습니다.");
//			break;
//		case "2" :
//			System.out.println("2를 선택하였습니다.");
//			break;
//		case "3" :
//			System.out.println("3을 선택하였습니다.");
//			break;
//			default :
//				System.out.println("1~3까지 선택하세요.");
//		}
//		
//		System.out.print("월 입력 : ");
//		int month = sc.nextInt();
		
//		switch(month) {
//		case 1 :
//			System.out.println("January");
//			break;
//		case 2 :
//			System.out.println("February");
//			break;
//		case 3 :
//			System.out.println("March");
//			break;
//		case 4 :
//			System.out.println("April");
//			break;
//		case 5 :
//			System.out.println("May");
//			break;
//		case 6 :
//			System.out.println("June");
//			break;
//		case 7 :,
//			System.out.println("July");
//			break;
//		case 8 :
//			System.out.println("August");
//			break;
//		case 9 :
//			System.out.println("September");
//			break;
//		case 10 :
//			System.out.println("October");
//			break;
//		case 11 :
//			System.out.println("November");
//			break;
//		case 12 :
//			System.out.println("December");
//			break;
//			default :
//				System.out.println("1~12월 중에 입력해주세요.");
//		}
		
//		if (month == 1) {
//			System.out.println("January");
//		}else if (month == 2) {
//			System.out.println("February");
//		}else if (month == 3) {
//			System.out.println("March");
//		}else if (month == 4) {
//			System.out.println("April");
//		}else if (month == 5) {
//			System.out.println("May");
//		}else if (month == 6) {
//			System.out.println("June");
//		}else if (month == 7) {
//			System.out.println("July");
//		}else if (month == 8) {
//			System.out.println("August");
//		}else if (month == 9) {
//			System.out.println("September");
//		}else if (month == 10) {
//			System.out.println("October");
//		}else if (month == 11) {
//			System.out.println("November");
//		}else if (month == 12) {
//			System.out.println("December");
//		}else {
//			System.out.println("1~12월 중에 입력하세요.");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int a = sc.nextInt();
		
		// switch (변수) {case 조건 : 실행문; break; default : 실행문;}
		switch(a) {
		case 1 :
			System.out.println("1을 선택하였습니다.");
			break;
		case 2 :
			System.out.println("2를 선택하였습니다.");
			break;
		case 3 :
			System.out.println("3을 선택하였습니다.");
			break;
			default :
				System.out.println("1~3까지 선택하세요.");
		}
		
	}

}
