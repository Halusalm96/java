package day09;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 첫번째 생성자 사용하여 apple객체 생성
		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;
		apple.print();
		
		// 두번째 생성자 사용하여 melon객체 생성
		Fruit melon = new Fruit("멜론");
		melon.color = "초록";
		melon.isSeed = true;
		melon.print();
		
		// 세번째 생성자 사용하여 orange객체 생성
		Fruit orange = new Fruit("오렌지","주황");
		orange.isSeed = true;
		orange.print();
		
		// 내번째 생성자 사용하여 banana객체 생성
		Fruit banana = new Fruit("바나나","노랑",true);
		banana.print();
		
	}

}
