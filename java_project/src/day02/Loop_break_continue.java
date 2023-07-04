package day02;

public class Loop_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<10; i++) {
//			System.out.println(i);
//			if(i == 4) {
//				break;
//			}
//		}
//		for(int i=1; i<=10; i++) {
//			if(i == 4) {
//				continue;
//			}
//			System.out.println(i);
//		}
		int dan = 7;
		
		for(int i=1; i<10; i++) {
			if(i == 5) {
				System.out.println();
				continue;
			}
			if(i == 9) {
				break;
			}
			System.out.println(dan+" * "+i+" = "+(i*dan));
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
