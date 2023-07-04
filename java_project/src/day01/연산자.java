package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 9;
		
		// 산술연산자
		System.out.println(a + b); // 더하기
		System.out.println(a - b); // 빼기
		System.out.println(a * b); // 곱하기
		System.out.println(a / b); // 나누기
		System.out.println(a % b); // 나눈 후 나머지
		System.out.println("================================");
		
		// 비교연산자
		System.out.println(a > b); // 초과
		System.out.println(a < b); // 미만
		System.out.println(a >= b); // 이상
		System.out.println(a <= b); // 이하
		System.out.println(a == b); // 같다
		System.out.println(a != b); // 같지 않다
		System.out.println("================================");
		
		// 논리연산자 (&&:그리고, ||:또는, !:아니다)
		System.out.println(a > c && b > c);
		System.out.println(a > c && b < c);
		System.out.println(a > b && a > c);
		System.out.println(a < c || a >= b);
		System.out.println(a != b || a == b);
		System.out.println(!(a > c));
		System.out.println(!(a > c && b > c));
		System.out.println(a > c && !(b > c));
		
		
	}

}
