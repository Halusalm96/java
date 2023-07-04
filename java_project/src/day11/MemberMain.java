package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			List<Member> list = new ArrayList<Member>();
			Long id = 100l;
			
			while (true) {
				System.out.println("========== 동 호 회 가 입 ==========");
				System.out.println("1.멤버등록 2.멤버리스트 3.멤버검색 0.종료");
				System.out.print("메뉴 선택 : ");
				int menu = sc.nextInt();
				if(menu == 1) {
					System.out.print("이름 : ");
					String name = sc.next();
					System.out.print("이메일 : ");
					String email = sc.next();
					System.out.print("비밀번호 : ");
					String pw = sc.next();
					Member m = new Member(id++,email,pw,name);
					System.out.println(name + "님 가입을 축하드립니다.");
					list.add(m);
				}else if(menu == 2) {
					System.out.println("===== 멤 버 리 스 트 =====");
					System.out.println("no\t이름\t이메일\t비밀번호\t가입날짜");
					System.out.println("=====================================================");
//					for (int i = 0; i < list.size(); i++) {
//						list.get(i).print();
//					}
					for (Member m : list) { // 향상된 for문 or foreach
						m.print();
					}
				}else if(menu == 3) {
					System.out.print("이메일 : ");
					String email = sc.next();
					boolean find = false;
					for (Member m : list) {
						if (email.equals(m.getEmail())) {
							System.out.println("No\t이름\t이메일\t비밀번호\t가입날짜");
							System.out.println("=====================================================");
							m.print();
							find = true;
							break;
						}
						if (!find){
							System.out.println("가입된 정보가 없습니다.");
						}
					}
				}else if(menu == 0) {
					break;
				}else {
					System.out.println("0~3 중에 선택하세요.");
				}
				System.out.println();
			}
			System.out.println("프로그램 종료");
	}

}
