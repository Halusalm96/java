package day08;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 네 임 드 =====");
		System.out.println("네,임,드 중 선수 선택을 해주세요.");
		String[] jo = new String[6];
		int inNe = 0;
		int inIm = 0;
		int inEu = 0;
		int cnt = 0;
		
		for (int i = 1; i <=jo.length; i++) {
			System.out.printf("%d조 : ",i);
			jo[i-1] = sc.next();
		}
		System.out.println();
		System.out.println("===== 점 수 판 =====");
		System.out.println("네\t임\t드");
		boolean find = true;
		while(find) {
			int ne = (int)(Math.random()*2)+1;
			int im = (int)(Math.random()*2)+1;
			int eu = (int)(Math.random()*2)+1;
			if (ne == 1) {
				inNe++;
			}
			if (im == 1) {
				inIm++;
			}
			if (eu == 1) {
				inEu++;
			}
			System.out.printf("%d\t%d\t%d\n",inNe,inIm,inEu);
			if (inNe == 20 || inIm == 20 || inEu == 20) {
				find = false;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (inNe == 20) {
			System.out.println("'네'가 1등하였습니다.");
			for (int i = 0; i < 6; i++) {
				if ("네".equals(jo[i])) {
					System.out.printf("%d조 마췄습니다.\n",(i+1));
				}
			}
		}
		if (inIm == 20) {
			System.out.println("'임'가 1등하였습니다.");
			for (int i = 0; i < 6; i++) {
				if ("임".equals(jo[i])) {
					System.out.printf("%d조 마췄습니다.\n",(i+1));
				}
			}
		}
		if (inEu == 20) {
			System.out.println("'드'가 1등하였습니다.");
			for (int i = 0; i < 6; i++) {
				if ("드".equals(jo[i])) {
					System.out.printf("%d조 마췄습니다.\n",(i+1));
				}
			}
		}
		
	}

}
