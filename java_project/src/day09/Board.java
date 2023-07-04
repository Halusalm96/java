package day09;

public class Board {
	// 필드
	private String title;
	private int cnt;
	private boolean open;
	
	// 생성자
	public Board(String title, int cnt, boolean open) {
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}
	public Board() {
		
	}
	// 메서드
	public String getTitle () {
		return title;
	}
	public int getCnt () {
		return cnt;
	}
	public boolean getOpen () {
		return open;
	}
	
	public String setTitle (String title) {
		 return this.title = title;
	}
	public int setCnt (int cnt) {
		return this.cnt = cnt;
	}
	public void setOpen (boolean open) {
		this.open = open;
	}
	
	public void cntUp () {
		cnt += 1;
	}
	public int cntUp1 (int cnt) {
		this.cnt += cnt;
		return cnt;
	}
	public void print () {
		System.out.printf("이름 : %s\t나이 : %s\t신발 : %b\n",title,cnt,open);
	}
}
