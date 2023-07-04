package day07;

import java.util.Scanner;

public class Ex01_login_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] account = new String[10];
		int [] balance = new int[10];
		int cnt = 0;
		int loginIndex = -1;
//		boolean login = false;
		
		while(true) {
			System.out.println("===== 스 마 트 뱅 킹 =====");
			if (loginIndex == -1) {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			}
			if (loginIndex != -1) {
				System.out.println("1.마이페이지 2.로그아웃 3.입금 4.출금 5.계좌이체 0.종료");
			}
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (loginIndex == -1) {
					System.out.print("이름 : ");
					name[cnt] = sc.next();
					System.out.print("아이디 : ");
					id[cnt] = sc.next();
					System.out.print("비밀번호 : ");
					pw[cnt] = sc.next();
					System.out.print("계좌번호 : ");
					account[cnt] = sc.next();
					System.out.print("초기 잔액 : ");
					balance[cnt] = sc.nextInt();
					cnt++;
				}
				if (loginIndex != -1) {
					System.out.println("이름\t아이디\t비밀번호\t계좌번호\t잔액");
					System.out.println("====================================================");
					System.out.printf("%s\t%s\t%s\t%s\t%,d\n",name[loginIndex],id[loginIndex],pw[loginIndex],account[loginIndex],balance[loginIndex]);
				}
			}else if (menu == 2) {
				if (loginIndex != -1) {
					loginIndex = -1;
					System.out.println("로그아웃 되었습니다.");
				}else if (loginIndex == -1) {
					System.out.print("아이디 : ");
					String loginId = sc.next();
					System.out.print("비밀번호 : ");
					String loginPw = sc.next();
					boolean find = false;
					
					for (int i = 0; i < cnt; i++) {
						if(loginId.equals(id[i])) {
							if(loginPw.equals(pw[i])) {
								System.out.println("로그인 성공");
								loginIndex = i;
								find = true;
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
				if (loginIndex == -1) {
					System.out.println("이름\t아이디\t비밀번호\t계좌번호\t잔액");
					System.out.println("====================================================");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\t%,d\n",name[i],id[i],pw[i],account[i],balance[i]);
					}
				}
				if (loginIndex != -1) {
					System.out.print("비밀번호 : ");
					String Pw = sc.next();
					if (Pw.equals(pw[loginIndex])) {
						System.out.print("입금 금액 : ");
						int point = sc.nextInt();
						balance[loginIndex] += point;
						System.out.printf("잔액 : %,d원",balance[loginIndex]);
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
			}else if (menu == 4 && loginIndex != -1) {
					System.out.print("비밀번호 : ");
					String Pw = sc.next();
					if (Pw.equals(pw[loginIndex])) {
					System.out.print("출금 금액 : ");
					int point = sc.nextInt();
					if (point <= balance[loginIndex]) {
						balance[loginIndex] -= point;
						System.out.printf("잔액 : %,d원",balance[loginIndex]);
					}else {
						System.out.println("잔액 부족");
					}
					}
			}else if (menu == 5 && loginIndex != -1) {
					System.out.print("비밀번호 : ");
					String Pw = sc.next();
					if (Pw.equals(pw[loginIndex])) {
						System.out.print("입금 계좌 : ");
						String account01 = sc.next();
						System.out.print("이체 금액 : ");
						int balance01 = sc.nextInt();
						for (int i = 0; i < cnt; i++) {
							if (account01.equals(account[i])) {
								if (balance01 <= balance[loginIndex]) {
								balance[i] += balance01;
								balance[loginIndex] -= balance01;
								System.out.printf("%,d원 이체하였습니다.",balance01);
								}else {
								System.out.println("입금 계좌가 없습니다.");
							}
						}
					}
					}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~3중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("스마트 뱅킹 종료");
	}

}
