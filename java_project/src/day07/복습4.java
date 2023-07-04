package day07;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String [10];
		String[] account = new String [10];
		int[] balance = new int [10];
		int cnt = 0;
		int index = -1;
		
		while(true) {
			System.out.println("===== 은 행 =====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("이름 : ");
				name [cnt] = sc.next();
				System.out.print("계좌번호 : ");
				account [cnt] = sc.next();
				System.out.print("초기 금액 : ");
				balance [cnt] = sc.nextInt();
				cnt++;
				
			}else if (menu == 2) {
				System.out.print("계좌번호 : ");
				String loginAccount = sc.next();
				System.out.print("입금 금액 : ");
				int loginBalance = sc.nextInt();
				boolean find = false;
				for (int i =0; i < cnt; i++) {
						if (loginAccount.equals(account[i])) {
							System.out.printf("%,d원이 입급되었습니다.\n",loginBalance);
							balance[i] += loginBalance;
							System.out.printf("잔액 : %,d원\n",balance[i]);
							find = true;
							break;
						}
				}
				if (find == false) {
					System.out.println("계좌번호가 틀렸습니다.");
				}
			}else if (menu == 3) {
				System.out.print("계좌번호 : ");
				String loginAccount = sc.next();
				System.out.print("출금 금액 : ");
				int loginBalance = sc.nextInt();
				boolean find = false;
				for (int i =0; i < cnt; i++) {
						if (loginAccount.equals(account[i])) {
							if (loginBalance > balance[i]) {
								System.out.println("잔액 부족");
								find = true;
							}else {
								System.out.printf("%,d원이 출금되었습니다.\n",loginBalance);
								balance[i] -= loginBalance;
								System.out.printf("잔액 : %,d원\n",balance[i]);
								find = true;
								break;
							}
						}
				}
				if (find == false) {
					System.out.println("계좌번호가 틀렸습니다.");
				}
			}else if (menu == 4) {
				System.out.println("===== 계좌 목록 =====");
				System.out.println("이름\t계좌번호\t잔액");
				System.out.println("============================");
				for (int j = 0; j < cnt; j++) {
					System.out.printf("%s\t%s\t%,d\n",name[j],account[j],balance[j]);
				}
			}else if (menu == 5) {
				System.out.print("출금 계좌 : ");
				String account01 = sc.next();
				System.out.print("입금 계좌 : ");
				String account02 = sc.next();
				System.out.print("이체 금액 : ");
				int balance01 = sc.nextInt();
				boolean find = false;
				
				for (int i = 0; i < cnt; i++) {
					if (account01.equals(account[i])) {
						for (int j = 0; j < cnt; j++) {
							if (account02.equals(account[j])) {
								if (balance[i] >= balance01) {
									balance[j] += balance01;
									balance[i] -= balance01;
									System.out.println("입금 성공하였습니다.");
									find = true;
									break;
								} else {
									System.out.println("잔액 부족");
								}
							}
						}
						if (find == false) {
							System.out.println("입금 계좌가 없습니다.");
						}
				}
				if (find == false) {
					System.out.println("출금 계좌가 없습니다.");
				}
			}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~4 중에 선택해주세요.");
			}
				System.out.println();
		}
			System.out.println("프로그램 정료");
	}

	}
