package day08;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[]  balance = new int[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("========== 은 행 ==========");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("이름 : ");
				name[cnt] = sc.next();
				System.out.print("계좌번호 : ");
				account[cnt] = sc.next();
				System.out.print("초기 금액 : ");
				balance[cnt] = sc.nextInt();
				System.out.printf("%s님 계좌생성되었습니다.",name[cnt]);
				cnt++;
			}else if (menu == 2) {
				System.out.print("입금 계좌 : ");
				String loginAccount = sc.next();
				boolean find = false;
				for (int i = 0; i < cnt; i++) {
					if (loginAccount.equals(account[i])) {
						System.out.print("입금 금액 : ");
						int loginBalance = sc.nextInt();
						balance[i] = balance[i] + loginBalance;
						System.out.printf("잔액 : %,d원\n",balance[i]);
						find = true;
						break;
					}
				}
				if (find == false) {
					System.out.println("계좌가 없습니다.");
				}
			}else if (menu == 3) {
				System.out.print("출금 계좌 : ");
				String loginAccount = sc.next();
				boolean find = false;
				for (int i = 0; i < cnt; i++) {
					if (loginAccount.equals(account[i])) {
						find = true;
						System.out.print("출금 금액 : ");
						int loginBalance = sc.nextInt();
						if (loginBalance <= balance[i]) {
							balance[i] = balance[i] - loginBalance;
							System.out.printf("잔액 : %,d원\n",balance[i]);
							break;
						}else {
							System.out.println("잔액 부족");
							break;
						}
					}
				}
				if (find == false) {
					System.out.println("계좌가 없습니다.");
				}
			}else if (menu == 4) {
				System.out.println("이름\t계좌\t잔액\n");
				System.out.println("===========================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%d\n",name[i],account[i],balance[i]);
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
