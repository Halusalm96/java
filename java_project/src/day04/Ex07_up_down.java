package day04;

import java.util.Scanner;

public class Ex07_up_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1; // 1~31까지 랜덤숫자
//		System.out.println(answer);
		int sum = 0;
		int	tes = 10;
		String up = "Up";
		String down = "Down";
		String z = "";
		
		while(true) {
			System.out.println("===== Up & Down =====");
			System.out.println("남은 시도 횟수 : " + (tes-sum));
			System.out.print("숫자입력 : ");
			int num = 0;
			if(sc.hasNextInt()) {
				num = sc.nextInt();sc.nextLine();
				sum += 1;
			}else {
				sc.nextLine();
				System.out.println("숫자만 입력하세요.");
				System.out.println();
				continue;
			}
				
			if (num == answer) {
				sum += 1;
				System.out.println("정답");
				System.out.println("시도 횟수 : " + sum + "회");
				if (sum == 1) {
					System.out.println("매우 좋아요");
				}else if (sum <= 3) {
					System.out.println("좋아요");
				}else if (sum <= 5) {
					System.out.println("조금 좋아요");
				}
				break;
			}else if (num < 1 || num > 31){
				System.out.println("1~31 중에 입력해주세요.");
			}else if (num < answer && num < 1 && num > 31) {
				sum += 1;
				z = up;
				System.out.println(up);
			}else if (num > answer && num < 1 && num > 31) {
				sum += 1;
				z = down;
				System.out.println(down);
			}
			if (sum == tes) {
				System.out.println(sum + "회 소진하였습니다.");
				System.out.println("재시작하시겠습니까?? (Y/y)");
				String re = sc.next();
				if (!(re.equals("Y") || re.equals("y"))) {
					break;
				}
				sum = 0;
			}
			System.out.println("시도 횟수 : " + sum + "회");
			if (sum == 1) {
				if (z.equals(up)) {
					System.out.println(num + " ~ 30");
				}else if (z.equals(down)) {
					System.out.println("1 ~ " + num);
				}else {
					
				}
			}
			System.out.println();
		}
		System.out.println("게임 종료");
	}

}
