package day02;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i<10; i++) {
//			System.out.println(i);
//			if(i ==4) {
//				break;
//			}
		
//		for(int i = 1; i <= 10; i++) {
//		if(i == 4) {
//			continue;
//		}
//		System.out.println(i);
//		}
		
		// 예시
		int dan = 7;
		for(int i = 1; i < 10; i++) {
			if(i == 5) {
				continue;
			}else if (i == 9) {
				continue;
			}
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
			
	}

}
