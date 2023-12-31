package ex01;

public class Student {
	// 필드
	private String sno;
	private String sname;
	private String address;
	private String dept = "경영학과";
	
	// 생성자
	public Student() {
	}
	
	public Student(String sno, String sname, String address) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.address = address;
	}

	// 메서드
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return sno + "\t" + sname + "\t" + address + "\t" + dept;
	}
	
}
