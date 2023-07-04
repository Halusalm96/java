package day02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int a = sc.nextInt();
//		if (a > 0) {
//			System.out.println(a + "는 양수입니다.");
//		}else if (a < 0) {
//			System.out.println(a + "는 음수입니다.");
//		}else {
//			System.out.println(a + "는 미지수입니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int score = sc.nextInt();
//		if (score >= 90) {
//			System.out.println("A");
//		}else if (score >= 80) {
//			System.out.println("B");
//		}else if (score >= 70) {
//			System.out.println("C");
//		}else if (score >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int num = sc.nextInt();
//		if (num % 2 == 0 && num != 0) {
//			System.out.println(num + "는 짝수입니다.");
//		}else if (num % 2 == 1) {
//			System.out.println(num + "는 홀수입니다.");
//		}else {
//			System.out.println(num + "는 미지수입니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int a = sc.nextInt();
//		if (a % 3 == 0 && a % 5 == 0) {
//			System.out.println(a + "는 3,5의 배수입니다.");
//		}else if (a % 3 == 0) {
//			System.out.println(a + "는 3의 배수입니다.");
//		}else if (a % 5 == 0) {
//			System.out.println(a + "는 5의 배수입니다.");
//		}else {
//			System.out.println(a + "는 3,5의 배수가 아닙니다.");
//		}
		
		// 계산기 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자입력 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("공식선랙 > ");
//		int menu = sc.nextInt();
//		
//		if (menu == 1) {
//			System.out.println("정답은 : " + (num1 + num2));
//		}else if (menu == 2) {
//			System.out.println("정답은 : " + (num1 - num2));
//		}else if (menu == 3) {
//			System.out.println("정답은 : " + (num1 * num2));
//		}else if (menu == 4) {
//			System.out.println("정답은 : " + (num1 / (double)num2));
//		}else if (menu == 5) {
//			System.out.println("정답은 : " + (num1 % num2));
//		}else {
//			System.out.println("다시 입력해주세요.");
//		}
		
		// 로그인 프로그램
		String id = "aa";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String loginId = sc.next();
		System.out.print("비밀번호 입력 : ");
		String loginPw = sc.next();
		
		// 같다 : 기본형(==) / 참조자료형( .equals() )
		// 다르다 : 기본형(!=) / 참조자료형( !   .equals() )
		if (id .equals(loginId)) {
			if (pw.equals(loginPw)) {
				System.out.println("로그인 되었습니다.");
			}else {
			System.out.println("비밀번호가 틀렸습니다.");
			}
		}else if (!id.equals(loginId)) {
			if (!pw.equals(loginPw)) {
				System.out.println("둘 다 클렸습니다.");
			}else {
			System.out.println("아이디가 틀렸습니다.");
			}
			}
		
		
		
		
		}

}
