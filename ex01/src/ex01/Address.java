package ex01;

import java.util.Scanner;

public class Address {
	public static void run() {
	Student[] students = new Student[5];
	Scanner sc = new Scanner(System.in);
	boolean find = true;
	int count = 0;
	
	while (find) {
		System.out.println("=======================");
		System.out.println("1.등록 2.목록 3.검색 4.수정 0.종료");
		System.out.println("=======================");
		System.out.print("선택 : ");
		String menu = sc.nextLine();
		
		switch (menu) {
		case "1" :
			Student student = new Student();
			student.setSno("2023 - " + (count + 1));
			System.out.print("이름 : ");
			student.setSname(sc.nextLine());
			System.out.print("주소 : ");
			student.setAddress(sc.nextLine());
			System.out.print("학과 : ");
			student.setDept(sc.nextLine());
			students[count] = student;
			count++;
			System.out.printf("%d명 등록",count);
			break;
		case "2" :
			System.out.println("학번\t이름\t주소\t학과");
			for (int i = 0; i < count; i++) {
				Student stu = students[i];
				System.out.println(stu.toString());
			}
			break;
		case "3" :
			System.out.print("검색 : ");
			String search = sc.nextLine();
			boolean find2 = false;
			for (int i = 0; i < count; i++) {
				Student stu = students[i];
				if (stu.getSname().equals(search)) {
					System.out.println(stu.toString());
					find2 = true;
				}
			}
			if(find2 == false) {
				System.out.println(search + "학생이 존재하지 않습니다.");
			}
			break;
		case "4" :
			System.out.print("검색 : ");
			String upDate = sc.nextLine();
			find2 = false;
			for (int i = 0; i < count; i++) {
				Student stu = students[i];
				if (upDate.equals(stu.getSname())) {
					find2 = true;
					System.out.println("이름 : "+stu.getSname());
					System.out.println("주소 : "+stu.getAddress());
					System.out.print("수정 주소 : ");
					String newAddress = sc.nextLine();
					if (newAddress != "") {
						stu.setAddress(newAddress);
						System.out.println("수정 완료");
					}
				}
			}
			if (find2 == false) {
				System.out.println("없음");
			}
			break;
		case "0" :
			System.out.println("프로그램 종료");
			find = false;
			break;
			default :
				System.out.println("다시 선택");
		}
	}
	}
}
