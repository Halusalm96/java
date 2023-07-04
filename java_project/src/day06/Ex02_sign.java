package day06;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Ex02_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] name = new String [10];
		String [] id = new String [10];
		String [] pw = new String [10];
		String [] date = new String [10];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		
		int cnt = 0;
		
		while(true) {
			System.out.println("===== 인 천 마 켓 =====");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("이름 : ");
				name[cnt] = sc.next();
				System.out.print("아이디 : ");
				id[cnt] = sc.next();
				System.out.print("비밀번호 : ");
				pw[cnt] = sc.next();
				LocalDateTime now = LocalDateTime.now(); //현재 날짜 시간 나타내는 문법
				date[cnt] = dtf.format(now);
				cnt++;
			}else if (menu == 2) {
				System.out.print("아이디 : ");
				String ids = sc.next();
				System.out.print("비밀번호 : ");
				String pws = sc.next();
				
				for (int i = 0; i < cnt; i++) {
					if (ids.equals(id[i]) && pws.equals(pw[i])) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("정보가 있지 않습니다.");
						break;
					}
				}
			}else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				System.out.println("====================================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s\n",name[i],id[i],pw[i],date[i]);
				}
			}else if (menu == 0) {
				break;
			}else {
				System.out.println("0~3 중에 선택하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
	}

}
