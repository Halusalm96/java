package ex02;

import java.security.PublicKey;
import java.util.*;

public class Sungjuk {
	public static void run () {
		Scanner sc = new Scanner(System.in);
		List<ScoruVO> array = new ArrayList<ScoruVO>();
		ScoruVO score = new ScoruVO("2023-1","김씨",100,100,100);
		array.add(score);
		score = new ScoruVO("2023-2","박씨",99,99,99);
		array.add(score);
		score = new ScoruVO("2023-3","이씨",88,88,88);
		array.add(score);
		int count = 3;
		boolean find = true;
		
		while (find) {
		System.out.println("========== 성 적 관 리 ==========");
		System.out.println("1.입력 2.조회 3.목록 4.수정 5.삭제 0.종료");
		System.out.print("선택 : ");
		String menu = sc.nextLine();
		switch (menu) {
		case "1" :
			score = new ScoruVO();
			score.setNo("2023-"+(count+1));
			System.out.println("학번 : "+score.getNo());
			count++;
			System.out.print("이름 : ");
			score.setName(sc.nextLine());
			System.out.print("국어 : ");
			score.setKor(Integer.parseInt(sc.nextLine()));
			System.out.print("수학 : ");
			score.setMat(Integer.parseInt(sc.nextLine()));
			System.out.print("영어 : ");
			score.setEng(Integer.parseInt(sc.nextLine()));
			array.add(score);
			System.out.println("등록 완료");
			break;
		case "2" :
			boolean find2 = false;
			System.out.print("학번 : ");
			String set = sc.nextLine();
			for (ScoruVO vo : array) {
				if (set.equals(vo.getNo())) {
					vo.setTot(vo.getKor()+vo.getMat()+vo.getEng());
					vo.setAvg(vo.getTot()/3);
					vo.setGrade(getGrade(vo.getAvg()));
					vo.print_port();
					find2 = true;
				}
			}
			if (!find) {
				System.out.println("없음");
			}

			break;
		case "3" :
			System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균\t학점");
			for (ScoruVO vo : array) {
				vo.setTot(vo.getKor()+vo.getMat()+vo.getEng());
				vo.setAvg(vo.getTot()/3);
				vo.setGrade(getGrade(vo.getAvg()));
				vo.print_land();
			}
			break;
		case "4" :
			find2 = false;
			System.out.print("학번 : ");
			set = sc.nextLine();
			for (ScoruVO vo : array) {
				if (set.equals(vo.getNo())) {
					System.out.print("국어 : ");
					vo.setKor(Integer.parseInt(sc.nextLine()));
					System.out.print("수학 : ");
					vo.setMat(Integer.parseInt(sc.nextLine()));
					System.out.print("영어 : ");
					vo.setEng(Integer.parseInt(sc.nextLine()));
					find2 = true;
					System.out.println("수정 완료");
				}
			}
			if (!find) {
				System.out.println("없음");
			}
			break;
		case "5" :
			find2 = false;
			System.out.print("학번 : ");
			set = sc.nextLine();
			for (ScoruVO vo : array) {
				if (set.equals(vo.getNo())) {
					array.remove(vo);
					find2 = true;
					System.out.println("삭제 완료");
					break;
				}
			}
			if (!find) {
				System.out.println("없음");
			}
			break;
		case "0" :
			System.out.println("프로그램 종료");
			find = true;
			break;
		default :
			System.out.println("0~5 중에 선택하세요.");
		}
		System.out.println();
		}
	}
	public static String getGrade(double avg) {
		String grade;
		if (avg >= 90) {
			if (avg >= 90) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else if (avg >= 80) {
			if (avg >= 90) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}else if (avg >= 70) {
			if (avg >= 90) {
				grade = "C+";
			}else {
				grade = "C";
			}
		}else if (avg >= 60) {
			if (avg >= 90) {
				grade = "D+";
			}else {
				grade = "D";
			}
		}else {
			grade = "F";
		}
		return grade;
	}
	// 검색하기
	public static ScoruVo search(String name) {
		ScoruVo vo = new ScovuVO();
	}
}
