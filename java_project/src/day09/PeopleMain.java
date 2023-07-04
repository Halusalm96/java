package day09;

public class PeopleMain {

	public static void main(String[] args) {
		// 홍길동 90세
		People a = new People();
		a.getName("홍길동");
		a.getAge(90);
		a.ageUp();
		a.print();
		
		// 이순신 80세
		People b = new People("이순신",80);
		b.ageUp1(5);
		b.print();
		
		System.out.println(a.getAge(90) + "만 나이 : " + a.koreanAge());
		System.out.println(b.getAge(80) + "만 나이 : " + b.koreanAge());
	}
}
