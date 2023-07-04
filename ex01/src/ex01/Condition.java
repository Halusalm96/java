package ex01;

import java.util.Scanner;

public class Condition {
	public static void run() {
		// if문, switch~case
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int grade = sc.nextInt();
		String result = "";
		if (grade >= 90) {
			if (grade >= 95 ) {
				result = "A+";
			}else {
				result = "A";	
			}
		}else if (grade >= 80) {
			if (grade >= 85 ) {
				result = "B+";
			}else {
				result = "B";	
			}
		}else if (grade >= 70) {
			if (grade >= 75 ) {
				result = "C+";
			}else {
				result = "C";	
			}
		}else if (grade >= 60) {
			if (grade >= 65 ) {
				result = "D+";
			}else {
				result = "D";	
			}
		}else {
			result = "F";
		}
		System.out.println("학점 : " + result);
		
		System.out.print("시간 : ");
		int time = sc.nextInt();
		switch (time) {
		case 6 :
			System.out.println("기상");
			break;
		case 9 :
			System.out.println("출근");
			break;
		case 12 :
			System.out.println("점심");
			break;
		case 18 :
			System.out.println("퇴근");
			break;
		default :
			System.out.println("다시 입력");
			
		}
		
	}
}
