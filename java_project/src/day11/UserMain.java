package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<User>();
		
		while (true) {
			System.out.println("===== 회 원 가 입 =====");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			
			if (menu == 1 ) {
				User user = new User();
				System.out.print("이름 : ");
				user.setName(sc.next());
				System.out.print("아이디 : ");
				user.setId(sc.next());
				System.out.print("비밀번호 : ");
				user.setPw(sc.next());
				list.add(user);
				System.out.println(user.getName()+"님 회원가입 축하드립니다.");
			}else if (menu == 2) {
				System.out.print("아이디 : ");
				String loginId = sc.next();
				System.out.print("비밀번호 : ");
				String loginPw = sc.next();
				boolean find = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getId().equals(loginId)) {
						if (list.get(i).getPw().equals(loginPw)) {
							System.out.println("로그인 성공");
							find = true;
							break;
						}else {
							System.out.println("비밀번호가 일치하지 않습니다.");
							find = false;
							break;
						}
					}
					if (!find) {
						System.out.println("아이디가 일치하지 않습니다.");
						break;
					}
				}
			}else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				System.out.println("==============================");
				for (int i = 0; i<list.size(); i++) {
					list.get(i).print();
				}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~3 중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
