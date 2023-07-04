package day07;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";
//		
//		while(true) {
//			System.out.println("===== 로 그 인 =====");
//			System.out.println("아이디 : ");
//			String loginId = sc.next();
//			System.out.println("비밀번호 : ");
//			String loginPw = sc.next();
//			if (loginId.equals(id)) {
//				if (loginPw.equals(pw)) {
//					System.out.println("로그인 성공");
//				}else {
//					 System.out.println("비밀번호가 틀렸습니다.");
//				}
//			}else if (!loginId.equals(id)){
//				if (!loginPw.equals(pw)) {
//					System.out.println("로그인 실패");
//				}else if (loginPw.equals(pw)){
//						System.out.println("아이디가 틀렸습니다.");
//				}
//			}
//		}
		
		// 1 ~ 입력받은 값까지의 합 출력
		
//		int sum = 0;
//		while(true) {
//			System.out.print("숫자 입력 : ");
//			int num = sc.nextInt();
//			for (int i = 0; i <= num; i++) {
//				sum+=i;
//			}
//			System.out.println(sum);
//		}
		
		//입력받은 단의 구구단 출력
//		System.out.print("단 입력 : ");
//		int dan = sc.nextInt();
//		
//		for (int i = 1; i <=19; i++) {
//			System.out.printf("%s * %s = %s\n",dan,i,(dan*i));
//		}
		
		// 1 ~ 100까지 3의배수-피즈,5의배수-버즈 출력
		
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("피즈버즈");
			}else if (i % 3 == 0) {
				System.out.println("피즈");
			}else if (i % 5 == 0) {
				System.out.println("버즈");
			}else {
				System.out.println(i);
			}
		}
		
		
		
		
	}

}
