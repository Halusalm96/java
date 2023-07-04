package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();
		
		while(true) {
			System.out.println("===== 인 천 일 보 은 행 =====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.계좌이체 0.종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				Account a = new Account();
				System.out.print("이름 : ");
				a.setName(sc.next());
				System.out.print("계좌 : ");
				a.setAccount(sc.next());
				System.out.print("잔액 : ");
				a.setBalance(sc.nextInt());
				list.add(a);
			}else if (menu == 2) {
				System.out.print("계좌 : ");
				String inAccount = sc.next();
				System.out.print("잔액 : ");
				int inMoney = sc.nextInt();
				boolean find = false;
				
				for (Account a : list) {
					if (inAccount.equals(a.getAccount())) {
						a.deposit(inMoney);
						find = true;
						break;
					}
					if (!find) {
						System.out.println("없는 계좌입니다.");
					}
				}
			}else if (menu == 3) {
				System.out.print("계좌 : ");
				String outAccount = sc.next();
				System.out.print("잔액 : ");
				int outMoney = sc.nextInt();
				
				for (Account a : list) {
					if (outAccount.equals(a.getAccount())) {
						if (true) {
							a.withdraw(outMoney);
							System.out.println("출금 성공");
						}else {
							System.out.println("잔액 부족");
						}
						break;
					}
				}
			}else if (menu == 4) {
				System.out.println("===== 계 좌 목 록 =====");
				System.out.println("이름\t계좌\t잔액\t가입날짜\n");
				for (Account a : list) {
					a.print();
				}
			}else if (menu == 5) {
				System.out.print("계좌 : ");
				String outAccount = sc.next();
				System.out.print("계좌 : ");
				String inAccount = sc.next();
				System.out.print("잔액 : ");
				int Money = sc.nextInt();
				boolean find = false;
				
				for (Account a : list) {
					if (outAccount.equals(a.getAccount())) {
						for (Account b : list) {
							if (inAccount.equals(b.getAccount())) {
								b.deposit(Money);
								find = true;
								break;
								}else {
									System.out.println("받을 계좌가 없습니다.");
								}
							}
							a.withdraw(Money);
							find = true;	
							break;
						}
					if (!find) {
						System.out.println("보낼 계좌가 없습니다.");
					}
				}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~5 중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
