package day08;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스는 틀
		// 객체란 클래스의 틀대로 찍어낸 것
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.name = "그랜져";
		c1.tire = "한국";
		c1.color = "검정";
		c1.speed = 5;
		c1.run();
		System.out.println(c1.name + "\t" + c1.tire + "\t" + c1.color + "\t" + c1.speed);
		
		c2.name = "제네시스";
		c2.tire = "넥센";
		c2.color = "빨강";
		c2.speed = 10;
		c2.run ();
		System.out.println(c2.name + "\t" + c2.tire + "\t" + c2.color + "\t" + c2.speed);
		
		c3.name = "쏘나타";
		c3.tire = "금호";
		c3.color = "노랑";
		c3.speed = 8;
		c3.run();
		System.out.println(c3.name + "\t" + c3.tire + "\t" + c3.color + "\t" + c3.speed);
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
//		System.out.println(c1.run()); 에러나는 이유는 run매서드의 리턴타입이 void이기 때문에
		
		c1.speedRun(9);
		System.out.println(c1.name + "\t" + c1.tire + "\t" + c1.color + "\t" + c1.speed);
		
		// c1,c2,c3의 getSpeed메서드 호출 후 리턴 값 출력
		System.out.println(c1.getSpeed());
		System.out.println(c2.getSpeed());
		System.out.println(c3.getSpeed());
	}

}
