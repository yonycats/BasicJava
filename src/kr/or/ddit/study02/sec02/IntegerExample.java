package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
		// 논리타입
		// true, false 두가지로 표현됨
		// 실행 흐름 등을 변형하는데 사용됨
		// 1byte
		
		boolean flag = false;
		int age = 20;
		
		flag =age>17;
		if (flag) {
			System.out.println("성년입니다.");
		}else {
			System.out.println("미성년입니다.");
		}
	}
}
