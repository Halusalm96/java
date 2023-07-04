package day09;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체생성 후 모든 메서드 사용하여 출력
		Calculator num = new Calculator();
		
		num.num1 = 4;
		num.num2 = 7;
		
		// 리턴이 있을 때
		// num.sum() = 11
		// 리턴이 없을 때
		// num.sum = 11
		
		num.sum();
		System.out.println(num.sum);//11
		
		num.sub(5, 8);
		System.out.println(num.mul());
		System.out.println(num.div(6, 9));
		
		System.out.println(num.mul() - 9);
		
		
		Calculator num1 = new Calculator();
		num1.num1 = 7;
		num1.num2 = 2;
		
		int a = num.mul() + num1.mul();
		System.out.println(a*2);
	}

}
