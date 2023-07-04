package day06;

import java.util.Scanner;

public class Ex01_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 10;
		String [] name = new String [num]; //예금주
		String [] account = new String[num]; // 계좌번호
		int [] balance = new int[num]; // 잔액
		int cnt = 0;
		
		while(true) {
			System.out.println("===== 은 행 =====");
			System.out.println("1.등록 2.입금 3.출금 4.등록리스트 0.종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("이름 : ");
				name[cnt] = sc.next();
				System.out.print("계좌번호 : ");
				account[cnt] = sc.next();
				System.out.print("금액 : ");
				balance[cnt] = sc.nextInt();
				System.out.printf("잔액 : %,d원\n",balance[cnt]);
				cnt++;
			}else if (menu == 2) {
				System.out.print("이름 : ");
				String loginName = sc.next();
				System.out.print("계좌번호 : ");
				String loginAccount = sc.next();
				System.out.print("금액 : ");
				int loginBalance = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (loginName.equals(name[i]) && loginAccount.equals(account[i])) {
						balance[i] += loginBalance;
						System.out.printf("잔액 : %,d원\n",balance[i]);
					}else {
						System.out.println("정보가 일치하지 않습니다.");
						break;
					}
				}
			}else if (menu == 3) {
				System.out.print("이름 : ");
				String loginName = sc.next();
				System.out.print("계좌번호 : ");
				String loginAccount = sc.next();
				System.out.print("금액 : ");
				int loginBalance = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (loginName.equals(name[i]) && loginAccount.equals(account[i])) {
						if (balance[i] < loginBalance) {
							System.out.println("잔액 부족");
						}else {
							balance[i] -= loginBalance;
							System.out.printf("잔액 : %,d원\n",balance[i]);
						}
					}else {
						System.out.println("정보가 일치하지 않습니다.");
						break;
					}
				}
		 	}else if (menu == 4) {
				System.out.println("이름\t계좌번호\t잔액");
				System.out.println("=====================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n",name[i],account[i],balance[i]);
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
