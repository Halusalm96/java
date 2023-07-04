package ex01;

import java.util.Scanner;

public class Dimension {
	public static void run () {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[22];
		String[] address = new String[22];
		int a = 0;
		boolean find = true;
		
		while (find) {
			System.out.println("============================");
			System.out.println("1.주소등록 | 2.주소목록 | 0.종료");
			System.out.println("============================");
			System.out.print("선택 : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1" :
				System.out.print("이름 : ");
				name[a] = sc.next();
				System.out.print("주소 : ");
				address[a] = sc.next();
				a++;
				System.out.printf("%d명 등록되었습니다.",a);
				break;
			case "2" :
				System.out.println("No\t이름\t주소");
				for (int i = 0; i < a; i++) {
					System.out.printf("%d\t%s\t%s\n",i+1,name[i],address[i]);
				}
				break;
			case "0" :
				find = false;
				break;
				default :
					System.out.println("다시 입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
