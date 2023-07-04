package day03;

import java.util.Scanner;

public class vm_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000; 
		
		while (run) {
			System.out.println("====자판기==== balance : " +balance+ "won");
			System.out.println("1. cola(1000) 2. cider(1200) 3. milk(1500) 4. top up 0. end");
			System.out.print("menu: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1: 
				if(balance >= 1000) {
					System.out.println("cola");
					balance = balance - 1000; 
				}else {
					System.out.println("insufficient balance");
				}
				break;
			case 2: if(balance >= 1200) {
				System.out.println("cider");
				balance = balance - 1200;
				
			}
				
				
				
			}
		
		
		
		
		
		
		}
				
		
		
		
	}

}
