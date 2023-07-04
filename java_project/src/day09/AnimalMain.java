package day09;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		dog.setName("뽀삐");
		dog.setSound("멍멍");
		dog.setLeg(4);
//		System.out.println(dog.getName()+"\t"+dog.getSound()+"\t"+dog.getLeg());
		
		// 고양이 객체 만들기
		// 객체 이름 : cat, 이름 : 야옹이, 울음소리 : 야옹, 다리갯수 : 4
		
		Animal cat = new Animal();
		cat.setName("야옹이");
		cat.setSound("야옹");
		cat.setLeg(4);
//		System.out.println(cat.getName()+"\t"+cat.getSound()+"\t"+cat.getLeg());
		
		Animal sne = new Animal();
		sne.setName("콩이");
		sne.setSound("스스");
		sne.setLeg(0);
//		System.out.println(sne.getName()+"\t"+sne.getSound()+"\t"+sne.getLeg());
		
		Animal pig = new Animal();
		pig.setName("꿀꿀이");
		pig.setSound("꿀꿀");
		pig.setLeg(4);
//		System.out.println(pig.getName()+"\t"+pig.getSound()+"\t"+pig.getLeg());
		
		dog.print01();
		cat.print();
		sne.print01();
		pig.print();
		
	}

}