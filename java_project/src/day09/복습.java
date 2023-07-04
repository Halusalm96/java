package day09;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1;
		int cnt = 5;
		
		// 반복하면서 입력받는데 정답보다 크면 down, 작으면 up
		
		while (true) {
			System.out.printf("===== Up & Down ===== [남은 횟수 : %d개]\n",cnt);
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if (num < answer) {
				System.out.println("Up");
			}else if (num > answer) {
				System.out.println("Down");
			}else if (num == answer) {
				System.out.println("정답입니다.");
				break;
			}
			cnt--;
			if (cnt == 0) {
				System.out.println("횟수 초과로 실패하였습니다.");
				break;
			}
			System.out.println();
		}
	}

}
