package day05;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열선언방법(1)
		String[] names = {"홍길동","이순신","심청이"};
		//       index = 	[0]	   [1]    [2]
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
//		System.out.println(names[3]); // 예외발생(에러)
		
		// 배열선업방법(2)
		String[] names1 = new String[5]; //5칸짜리 배열만들기
		//        index => [0], [1], [2], [3], [4]
		names1[0] = "장동건";
		names1[1] = "이병헌";
		names1[2] = "이정재";
		names1[3] = "이경영";
		names1[4] = "정우성";
//		names1[5] = "이민정"; // 예외발생(에러)
		
		// 배열길이확인 (length)
		System.out.println("배열의 길이 : "+names1.length);
		
//		int[] num = new int[3];
//		num [2] = 3;
		
		// name1의 값을 for문을 통해 출력
		
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);
		}
				
		
	}

}
