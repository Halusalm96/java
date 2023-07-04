package day09;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board a = new Board ("이름",10,false);
		a.cntUp();
		a.print();
		
		Board b = new Board ();
		b.setTitle("성명");
		b.setCnt(10);
		b.setOpen(false);
		b.cntUp1(10);
		b.print();
	}

}
