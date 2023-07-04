package day06;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아아디와 비밀번호를 입력받기
//		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";
//		
//		while(true) {
//			System.out.println("===== 로 그 인 =====");
//			System.out.print("아이디 입력 : ");
//			String loginId = sc.next();
//			System.out.print("비밀번호 입력 : ");
//			String loginPw = sc.next();
//			
//			if (loginId.equals(id) && loginPw.equals(pw)) {
//				System.out.println("로그인 성공");
//			}else if (!loginId.equals(id) && !loginPw.equals(pw)) {
//				System.out.println("로그인 실패");
//			}else if (!loginId.equals(id)) {
//				System.out.println("아이디가 틀렸습니다.");
//			}else if (!loginPw.equals(pw)) {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		System.out.println();
//		}
		
		// 1~100까지의 합 출력 for문 사용
		int sum = 0;
		for (int i = 0; i <=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 구구단 출력 (dan변수를 사용하여 19단까지 출력)
		int dan = 5;
		for (int i = 1; i <= 19; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		
	}

}
