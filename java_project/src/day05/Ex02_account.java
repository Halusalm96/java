package day05;

import java.util.Scanner;

public class Ex02_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("===== 인 천 일 보 은 행 =====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목력 0.종료");
			System.out.print("메뉴입력 : ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("예금주 :");
				name[cnt] = sc.next();
				System.out.print("계좌번호 :");
				account[cnt] = sc.next();
				System.out.print("잔액 : ");
				balance[cnt] = sc.nextInt();
				cnt++;
			}else if (menu ==2) {
				System.out.print("계좌번호 : ");
				String account1 = sc.next();
				System.out.print("금액 : ");
				int balance1 = sc.nextInt();
				for(int i =0; i<cnt; i++ ) {
					if (account1.equals(account[i])) {
						balance[i] += balance1;
						System.out.printf("%,d원 입급되었습니다.\n",balance1);
					}else {
						System.out.println("계좌번호가 없습니다.");
					}
				}
			}else if (menu == 3) {
				System.out.print("계좌 : ");
				String account1 = sc.next();
				System.out.print("금액 : ");
				int balance1 = sc.nextInt();
				for(int i =0; i<cnt; i++ ) {
					if (account1.equals(account[i])) {
						if (balance[i] < balance1) {
							System.out.println("잔액부족");
						}else {
							balance[i] -= balance1;
							System.out.printf("잔액 %,d원 남았습니다.\n",balance[i]);
						}
					}else {
						System.out.println("계좌번호가 없습니다.");
					}
				}
			}else if (menu == 4) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("=============================");
				for( int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n",name[i],account[i],balance[i]);
				}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~4 중에서 입력하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		System.out.println();
	}

}
