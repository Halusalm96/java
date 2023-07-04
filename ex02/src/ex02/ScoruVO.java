package ex02;

public class ScoruVO {
	// 필드
	private String no;
	private String name;
	private int kor;
	private int mat;
	private int eng;
	private int tot;
	private double avg;
	private String grade;
	
	// 생성자
	public ScoruVO () {
		
	}
	public ScoruVO(String no, String name, int kor, int mat, int eng) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	// 메서드
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return kor+mat+eng;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return (kor+mat+eng)/3;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + mat + "\t" + eng + "\t" + tot + "\t" + avg + "\t" + grade;
	}
	public void print_land() {
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",no,name,kor,mat,eng,tot,avg,grade);
	}
	public void print_port() {
		System.out.println("학번 : "+no);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("수학 : "+mat);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+grade);
	}
}
