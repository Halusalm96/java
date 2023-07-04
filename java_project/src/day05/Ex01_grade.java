package day05;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		int[] kor = new int[10];
		int[] mat = new int[10];
		int[] eng = new int[10];
		int[] total = new int[10];
		double[] ang = new double[10];
		char[] grade = new char[10];
		int cnt = 0;
		
		while(true) {
		System.out.println("===== 성 적 표 =====");
		System.out.println("1.성적등록 2.성적리스트 0.종료");
		System.out.print("메뉴선택 : ");
		int menu = sc.nextInt();
		
		if (menu == 1) {
			System.out.print("이름 : ");
			name[cnt] = sc.next();
			System.out.print("국어 점수 : ");
			kor[cnt] = sc.nextInt();
			System.out.print("수학 점수 : ");
			mat[cnt] = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng[cnt] = sc.nextInt();
			total[cnt] = kor[cnt] + mat[cnt] + eng[cnt];
			ang[cnt] = total[cnt] / 3;
			if (ang[cnt] >= 90) {
				grade[cnt] = 'A';
			}else if (ang[cnt] >= 80) {
				grade[cnt] = 'B';
			}else if (ang[cnt] >= 70) {
				grade[cnt] = 'C';
			}else if (ang[cnt] >= 60) {
				grade[cnt] = 'D';
			}else {
				grade[cnt] = 'F';
			}
			cnt++;
		}else if (menu == 2) {
			System.out.println("이름\t국어\t수학\t영어\t총합\t평균\t학점");
			System.out.println("=====================================================");
			for(int i =0; i < cnt; i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name[i],kor[i],mat[i],eng[i],total[i],ang[i],grade[i]);
			}
		}else if (menu == 0) {
			break;
		}else {
			System.out.println("0~2 중에서 선택하세요.");
		}
		System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
	}

}
