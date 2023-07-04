package day11;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Account {
	private String name;
	private String account;
	private int balance;
	private String joinDate;
	private static int num = 100;
	
	public Account() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
	joinDate = df.format(LocalDateTime.now());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = (num++) + "-" + account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void print () {
		System.out.println(name+"\t"+account+"\t"+balance+"\t"+joinDate);
	}
	
	public void deposit(int inMoney) {
		balance += inMoney;
	}
	public boolean withdraw(int outMoney) {
		if (balance >= outMoney) {
			balance -= outMoney;
			return true;
		}else {
			return false;
		}
	}
	
	
}
