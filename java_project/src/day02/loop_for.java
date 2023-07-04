package day02;

import java.util.Scanner;

public class loop_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=10; i<20; i++) { // i=i+1;
//			System.out.println("hello");
//		}
//		
//		for(int i=1; i<=10; i++) { //1-10 //i=i+1
//			System.out.println(i);
//		}		
//		for(int i=1; i<=10; i=i+2) { //odds
//			System.out.println(i);
//		}
//		for(int i=0; i<10; i=i+2) { //evens
//			System.out.println(i);
//		}
	
//		for(int i=3; i<=100; i++) {
//			System.out.println(i);
//		}
//	
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		for(int i=0; i<=100; i=i+2) { // evens to 100
//			System.out.println(i);
//		}
//		for(int i=1; i<=100; i=i+2) { // odds to 100
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10; i++) {
//			System.out.print(i);
//			if(i != 10) {
//				System.out.print(",");
//			}
//		}
//		for(int i=1; i<=10; i++) {
//			if(i==10) {
//				System.out.print(i);
//			}else {
//				System.out.print(i+",");
//			}
//		}
	
//		int sum = 0;
//		
//		for(int i=1; i<10; i++) {
//			System.out.println(sum = sum+i);
//		}
//		
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
////	
//		for(int i=1; i<=10; i++) { //1-10
//			System.out.println(i);
//		}
		//
//		int dan = 6;
//		
//		for(int i=1; i<20; i++) {
//			System.out.println(dan+" * "+i+" = "+(i*dan));
//		}
		// cnt is count
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
			cnt++; // cnt+1
			}
		}
		System.out.println(cnt);
	
//		int cnt1 = 0;
//		int cnt2 = 0;
//		
//		
//		
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
//			cnt1++;
//			}
//			if(i % 5 == 0) {
//			cnt2++;
//		}
//	}
//		System.out.println("3의 배수: " + cnt1);
//		System.out.println("5의 배수: " + cnt2);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몆부터>");
//		int a = sc.nextInt();
//		System.out.print("몆까지>");
//		int b = sc.nextInt();
//		
//		for(int i=a; i<=b; i++) {
//			System.out.println(i);
//		}
//		int sum = 0;
//		for(int i=a; i<=b; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몆부터>");
//		int a = sc.nextInt();
//		System.out.print("몆까지>");
//		int b = sc.nextInt();
//		
//		for(int i=a; i<=b; i++) { 
//			if( i % 15 == 0) {
//				System.out.println("피즈버즈");
//			}else if(i % 3 == 0) {
//				System.out.println("피즈");
//			}else if(i % 5 == 0) {
//				System.out.println("버즈");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		
	
	}

}
