package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address1 {
	public static void run() {
		List<Student> array = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Student stu = new Student("2023-1","이씨","인천");
		array.add(stu);
		stu = new Student("2023-2","김씨","서울");
		array.add(stu);
		stu = new Student("2023-3","박씨","제주");
		array.add(stu);
		boolean find = true;
		
		while (find) {
			System.out.println("=============================");
			System.out.println("1.등록 2.목록 3.검색 4.수정 5.삭제 0.종료");
			System.out.println("=============================");
			System.out.print("선택 : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1" :
				stu = new Student();
				stu.setSno("2023-"+(array.size()+1));
				System.out.println("학번 : "+stu.getSno());
				System.out.print("이름 : ");
				stu.setSname(sc.nextLine());
				System.out.print("주소 : ");
				stu.setAddress(sc.nextLine());
				System.out.print("학과 : ");
				stu.setDept(sc.nextLine());
				array.add(stu);
				System.out.printf("%d명 등록되었습니다.\n",array.size());
				break;
			case "2" :
				System.out.println("학번\t이름\t주소\t학과");
				for (Student st:array) {
					System.out.println(st.toString());
				}
				break;
			case "3" :
				System.out.print("이름 검색 : ");
				String search = sc.nextLine();
				boolean find2 = false;
				for (Student st : array) {
					if (st.getSname().equals(search)) {
						System.out.println(st.toString());
						find2 = true;
					}
				}
				if(!find2) {
					System.out.println("없음");
				}
				break;
			case "4" :
				System.out.print("이름 검색 : ");
				search = sc.nextLine();
				find2 = false;
				for (Student st : array) {
					if (st.getSname().equals(search)) {
						find2 = true;
						System.out.println("이름 : "+st.getSname());
						System.out.println("주소 : "+st.getAddress());
						System.out.print("주소 수정 : ");
						String newAddress = sc.nextLine();
						if(newAddress !="") {
							st.setAddress(newAddress);
							System.out.println("수정 완료");
						}
					}
				}
				if (!find2) {
					System.out.println("없음");
				}
				break;
			case "5" :
				System.out.print("이름 검색 : ");
				search = sc.nextLine();
				find2 = false;
				for (Student st : array) {
					if (st.getSname().equals(search)) {
						find2 = true;
						System.out.println("삭제 완료");
						array.remove(st);
						break;
					}
				}
				if (!find2) {
					System.out.println("없음");
				}
				break;
			case "0" :
				System.out.println("종료");
				find = false;
				break;
			default:
				System.out.println("다시 선택");
				break;
			}
		}
	}
}
