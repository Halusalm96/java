package day06;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		
		for(int i =0; i<a.length; i++) {
			if (i ==a.length-1) {
				System.out.println(a[i]);
				break;
			}else {
				System.out.print(a[i]+",");
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		int[] b = new int[10];
//		
//		// b배열에 1~10까지 값을 넣으세요.
//		
//		for (int i =0; i < b.length; i++) {
//			b[i] = i + 1;
//		}
		
//		int[] c = {1,2,3,4,5};
//		int sum = 0;
//		
//		for (int i = 0; i < c.length; i++) {
//			sum += c[i];
//		}
//		System.out.println(sum);
		
		// d[0]째에 모든 값 누적
		int[] d = {1,2,3,4,5};
		for (int i = 0; i<d.length; i++) {
			if (i == 0 ) {
				continue;
			}else {
				d[0] += d[i];
			}
		}
		System.out.println(d[0]);
		
		int[] e = {1,2,3,4,5};
		int E = e[0];
		for (int i = 0; i < e.length; i++) {
			if(i == e.length-1) {
				e[i] = E;
			}else {
			e[i] = e[i+1];
			}
			System.out.println(e[i]);
		}
		
	}

}
