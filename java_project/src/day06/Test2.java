package day06;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] number = new int[3];
		System.out.print(">");
		
		for(int i=0; i<10; i++) {
			sc.nextLine();
			for(int j = 0; j<number.length; j++) {
				number[j] = (int)(Math.random()*9)+1;
				System.out.print(number[j]);
			}
		}
	}

}
