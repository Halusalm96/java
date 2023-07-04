package ex01;

public class Operation {
	public static void run() {
		// 산술연산자 (+,-,*,/,%)
		int kor = 90;
		int mat = 90;
		int eng = 90;
		int sum = kor + mat + eng;
		double avg = sum / (double)3;
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 관계연산자 (<,>,<=,>=,==,!=)
		// 논리연산자 (&&,||,!)
		// 증감연산자 (++,--)
		// 삼항연산자 [타입 변수 = 조건 ? true일 경우 조건문 : false일 경우 조건문;]
		String pass = (kor >= 60 && mat >= 60 && eng >= 60 && avg >= 70) ? "합격" : "불합격";
		System.out.println("결과 : " + pass);
		
		int count = 0;
		if (kor < 60) count++;
		if (mat < 60) count++;
		if (eng < 60) count++;
		System.out.printf("누락과목수 : %d\n", count);
	}
}
