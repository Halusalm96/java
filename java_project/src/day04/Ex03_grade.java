package day04;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("================ 성 정 표 ================");
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("수학 : ");
			int mat = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			int sum = kor+mat+eng;
			double avg = sum/(double)3;
			String h = "F";
			
			if(avg >= 95) {
				h = "A+";
			}else if(avg >= 90) {
				h = "A";
			}else if(avg >= 85) {
				h = "B+";
			}else if(avg >= 80) {
				h = "B";
			}else if(avg >= 75) {
				h = "C+";
			}else if(avg >= 70) {
				h = "C";
			}else if(avg >= 65) {
				h = "D+";
			}else if(avg >= 60) {
				h = "D";
			}else {
				h = "F";
			}
			
			System.out.println("국어\t수학\t영어\t총합\t평균\t학점");
			System.out.println("===============================================");
			System.out.println(kor+"\t"+mat+"\t"+eng+"\t"+sum+"\t"+avg+"\t"+h);
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n",kor,mat,eng,sum,avg,h);
			System.out.println();
		}
	}

}
