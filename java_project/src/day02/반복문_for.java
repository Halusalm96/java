package day02;

import java.util.Scanner;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for( int i = 0; i < 5; i++ ) {
//			System.out.println("안녕하세요.");
//		}
		
//		for (int i =0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i = 1; i <= 10; i=i+1) {
//			System.out.println(i);
//		}
		
//		for(int i = 1; i <= 10; i=i+2) {
//			System.out.println(i);
//		}
		
//		for (int i = 3; i <= 100; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i);
//		}
		
		// 1 ~ 100 짝수 출력
//		for(int i = 0; i <= 100; i = i + 2) {
//			System.out.println(i);
//		}
		
		//1~10, 가로, 출력
//		for(int i= 1; i <= 10; i++) {
//			if (i == 10) {
//				System.out.println(i);
//			}else {
//			System.out.print(i + ",");
//			}
//		}
//		
		// 다른 예시 (switch)
//		for (int i = 1; i <= 10; i++) {
//			switch (i) {
//			case 1 :
//				System.out.print(i + ",");
//				break;
//			case 2 :
//				System.out.print(i + ",");
//				break;
//			case 3 :
//				System.out.print(i + ",");
//				break;
//			case 4 :
//				System.out.print(i + ",");
//				break;
//			case 5 :
//				System.out.print(i + ",");
//				break;
//			case 6 :
//				System.out.print(i + ",");
//				break;
//			case 7 :
//				System.out.print(i + ",");
//				break;
//			case 8 :
//				System.out.print(i + ",");
//				break;
//			case 9 :
//				System.out.print(i + ",");
//				break;
//			case 10 :
//				System.out.print(i);
//				break;
//				default :
//					System.out.println("10초과입니다.");
//			}
		
		// 1~100의 합 출력
//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		// 구구단 출력
//		for(int i = 1; i<10; i++) {
//			for(int j = 1; j<10; j++)
//			System.out.println(i + " * " + j + " = " + (j*i));
//		}
		
		// 1~100 3의 배수 갯수 출력
//		int cnt = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 ==0) {
//				cnt = cnt + 1;
//			}else {
//				cnt = cnt + 0;
//			}
//		}
//		System.out.println(cnt);
		
		// 1~100 3의 배수, 5의 배수 갯수
//		int cnt1 = 0;
//		int cnt2 = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 3 == 0) {
//				if(i % 5 == 0) {
//					cnt2 = cnt2 + 1;
//				}
//				cnt1 = cnt1 + 1;
//			}else if(i % 5 == 0) {
//				cnt2 = cnt2 + 1;
//			}
//		}
//		System.out.println("3의 배수는 " + cnt1 + "개 입니다.");
//		System.out.println("5의 배수는 " + cnt2 + "개 입니다.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇부터 : ");
//		int a = sc.nextInt();
//		System.out.print("몇까지 : ");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = a; i <= b; i = i + 1 ) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		//피즈버즈
		//입력받은 수부터 입력받은 수 까지 출력하는데, 3의 배수는 피즈, 5의 배수는 버즈, 3,5의 배수는 피즈버즈
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작하는 숫자 : ");
		int a = sc.nextInt();
		System.out.print("끝나는 숫자 : ");
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("피즈버즈");
				}else {
					System.out.println("피즈");
				}
			}else if (i % 5 == 0) {
				System.out.println("버즈");
			}else {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
