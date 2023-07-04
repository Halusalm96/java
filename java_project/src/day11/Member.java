package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {
	private Long id;
	private String email;
	private String pw;
	private String name;
	private String JoinDate;
	
	public Member () {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		JoinDate = dtf.format(LocalDateTime.now());
	}
	public Member (Long id, String email, String pw) {
		this();
		this.id = id;
		this.email = email;
		this.pw = pw;
	}
	public Member (Long id, String email, String pw, String name) {
		this(id,email,pw); // 가져올 생선자는 맨위에 배치해야 한다.
		this.name = name;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Long getId () {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getPw() {
		return pw;
	}
	
	 public void print () {
		 System.out.printf("%d\t%s\t%s\t%s\t%s\n",id,name,email,pw,JoinDate);
	 }
	
}
