package day09;

public class Calculator {
	// 필드(인스턴스 변수)
	int num1;// 4
	int num2;// 7
	int sum;// 11
	
	// 메서드
	// 메서드명 : sum, 리턴타입 : X, 매개변서 : X, 실행문구 : 필드 num1+num2 출력
	public void sum() {
		sum = num1+num2;
	}
	// 메서드명 : sub, 리턴타입 : X, 매개변서 : 정수 2개, 실행문구 : 매개변수로 받은 두개값의 차 출력
	public void sub (int num1, int num2) {
		System.out.println(num1 - num2);
	}
	// 메서드명 : mul, 리턴타입 : O, 매개변서 : X, 실행문구 : 필드 num1*num2 리턴
	public int mul() {
		return num1 * num2;
	}
	// 메서드명 : div, 리턴타입 : O, 매개변서 : 정수 2개, 실행문구 : 매개변수로 받은 2개의 나눈값 리턴
	public double div(int num1, int num2) {
		return num1 / (double)num2;
	}
}
