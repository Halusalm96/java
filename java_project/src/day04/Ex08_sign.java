package day04;

import java.util.Scanner;

public class Ex08_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "";
		String pw = "";
		boolean login = false;
		
		while(true) {
			System.out.println("===== 사 이 트 =====");
			if(login) {
			System.out.println("1.회원가입 2.로그인 0.종료");
			} else {
			System.out.println("1.회원정보 2.로그아웃 0.종료");
			}
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(login) {
					System.out.println("이름 : "+name);
					System.out.println("아이디 : "+id);
					System.out.println("비밀번호 : "+pw);
				}else {
				System.out.print("회원가입할 이름 : ");
				name = sc.next();
				System.out.print("회원가입할 아이디 : ");
				id = sc.next();
				System.out.print("회원가입할 비밀번호 : ");
				pw = sc.next();
				System.out.println(name + "님 회원가입을 축하드립니다.");
				}
			}else if(menu == 2) {
				if(login) {
					login = false;
					System.out.println(name+"님 로그아웃 되었습니다.");
				}else {
				System.out.print("이름 : ");
				String loginName = sc.next();
				System.out.print("아이디 : ");
				String loginId = sc.next();
				System.out.print("비밀번호 : ");
				String loginPw = sc.next();
				if (name.equals(loginName) && id.equals(loginId) && pw.equals(loginPw)) {
					System.out.println("로그인 되었습니다.");
					login = true;
				}else {
					System.out.println("이름,아이디,비밀번호을 재확인 해주세요.");
				}
				}
			}
//			else if(menu == 3) {
//				System.out.println("이름\t아이디\t비밀번호");
//				System.out.println("================================");
//				System.out.println(name+"\t"+id+"\t"+pw);
//			}
			else if(menu == 0) {
				break;
			}else {
				System.out.println("0~3 중에 입력가능");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
