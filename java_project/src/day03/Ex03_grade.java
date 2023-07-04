package day03;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====성 적 표=====");
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("수학 : ");
			int met = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			int total = kor+met+eng;
			int avg = (kor+met+eng)/3;
			String grade;
			
			System.out.println(" 국어\t수학\t영어\t총점\t평균\t학점");
			System.out.println("=============================================");
			
			if (avg >= 90) {
				grade = "A";
			}else if (avg >= 80) {
				grade = "B";
			}else if (avg >= 70) {
				grade = "C";
			}else if (avg >= 60) {
				grade = "D";
			}else {
				grade = "F";
			}
			
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n",kor, eng, met, total, avg, grade);
			System.out.println();
		}
	}

}
