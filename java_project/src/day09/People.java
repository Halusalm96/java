package day09;

public class People {
	private String name; // 이름
	private int age; // 나이
	
	// 기본생성자
	public People() {
		
	}
	// 전체필드를 받는 생성자
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 모든 필드 get/set 메서드
	public String getName (String name) {
		return this.name = name;
	}
	public int getAge (int age) {
		return this.age = age;
	}
	public void setName () {
		this.name = name;
	}
	public void setAge () {
		this.age = age;
	}
	// 모든 필드 출력하는 print메서드
	public void print () {
		System.out.printf("이름 : %s\t나이 : %d\n",name,age);
	}
	
	// 메서드명 : ageUp, 매개변수 : X, 리턴타입 : X, 실행문구 : age를 1증가
	public void ageUp() {
		this.age += 1;
	}
	// 메서드명 : ageUp1, 매개변수: 정수 한개, 리턴타입 : X, 실행문구 : age를 매개변수만큼 증가
	public void ageUp1(int age) {
		this.age += age;
	}
	public int koreanAge() {
		return age-2;
	}
	
}
	
