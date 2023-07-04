package day07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] name = new String[10];
		String [] id = new String[10];
		String [] pw = new String[10];
		String [] date = new String[10];
		int [] point = new int[10];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		int cnt = 0;
		boolean login = false;
		int loginIndex = -1;
		int newCnt = 0;
		
		while(true) {
			System.out.println("============= 사 이 트 =============");
			if (login) {
				System.out.println("1.물품구매 2.로그아웃 3.회원정보 0.종료");
			}else {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (login) {
					while(true) {
						System.out.printf("============ 물품 구매 ============ [%,d원]\n",point[loginIndex]);
						System.out.println("1.짜장면(3000) 2.짬뽕(3500) 3.탕수육(8000) 4.금액충전 0.종료");
						System.out.print("메뉴 선택 : ");
						int newMenu = sc.nextInt();
						if (newMenu == 1) {
							if (point[loginIndex] < 3000) {
								System.out.println("잔액 부족");
							}else {
								point[loginIndex] -= 3000;
								System.out.println("짜장면 구매");
								System.out.printf("잔액 : %,d원\n",point[loginIndex]);
							}
						}else if (newMenu == 2 ) {
							if (point[loginIndex] < 3500) {
								System.out.println("잔액 부족");
							}else {
								point[loginIndex] -= 3500;
								System.out.println("짬뽕 구매");
								System.out.printf("잔액 : %,d원\n",point[loginIndex]);
							}
						}else if (newMenu == 3 ) {
							if (point[loginIndex] < 8000) {
								System.out.println("잔액 부족");
							}else {
								point[loginIndex] -= 8000;
								System.out.println("탕수육 구매");
								System.out.printf("잔액 : %,d원\n",point[loginIndex]);
							}
						}else if (newMenu == 4 ) {
							System.out.print("충전 금액 : ");
							point [loginIndex] = sc.nextInt();
						}else if (newMenu == 0 ) {
							break;
						}
					}
				}else {
					System.out.print("이름 : ");
					name [cnt] = sc.next();
					System.out.print("아이디 : ");
					id [cnt] = sc.next();
					System.out.print("비밀번호 : ");
					pw [cnt] = sc.next();
					LocalDateTime now = LocalDateTime.now();
					date [cnt] = dtf.format(now);
					System.out.println("회원가입을 축하드립니다.");
					cnt++;
				}
			}else if (menu == 2) {
				if (login) {
					login = false;
					System.out.println(name[loginIndex]+"님 로그아웃 되었습니다.");
					loginIndex = -1;
				}else {
					System.out.print("아이디 : ");
					String loginId = sc.next();
					System.out.print("비밀번호 : ");
					String loginPw = sc.next();
					boolean find = false;
					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(id[i])) {
							if (loginPw.equals(pw[i])) {
								System.out.println(name[i] + "님 방갑습니다.");
								find =true;
								login = true;
								loginIndex = i;
								break;
							}else {
								System.out.println("비밀번호가 틀렸습니다.");
							}
						}
					}
					if (find == false) {
						System.out.println("아이디가 틀렸습니다.");
					}
				}
				
			}else if (menu == 3) {
				if (login) {
					System.out.println("이름\t아이디\t비밀번호\t\t가입날짜\t\t잔액");
					System.out.println("==========================================================");
					System.out.printf("%s\t%s\t%s\t%s\t%,d\n",name[loginIndex],id[loginIndex],pw[loginIndex],date[loginIndex],point[loginIndex]);
				}else {
					System.out.println("이름\t아이디\t비밀번호\t\t가입날짜\t\t잔액");
					System.out.println("==========================================================");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\t%,d원\n",name[i],id[i],pw[i],date[i],point[i]);
					}
				}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~4 중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
