package day06;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1;
		boolean run = true;
		int b = 10;
		
		//while문으로 up&down 게임 만들기
		
		while(run) {
			System.out.printf("===== Up & Dowm ===== [횟수 : %d]\n",b);
			System.out.print("숫자 입력 : ");
			int a = sc.nextInt();
			b -= 1;
			
			if (a < answer) {
				System.out.println("Up");
				System.out.printf("남은 횟수 : %d회\n",b);
			}else if (a > answer) {
				System.out.println("Down");
				System.out.printf("남은 횟수 : %d회\n",b);
			}else if (a == answer) {
				System.out.println("정답");
				System.out.printf("남은 횟수 : %d회\n",b);
				run = false;
			}
			System.out.println();
		}
		System.out.println("게임 종료");
		
	}

}
