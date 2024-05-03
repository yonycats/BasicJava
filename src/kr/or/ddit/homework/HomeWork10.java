package kr.or.ddit.homework;

import java.util.Scanner;

import kr.or.ddit.study06.sec03.Student;

public class HomeWork10 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork10 obj = new HomeWork10();
		obj.process();
	}

	public void process() {
		Student[] stuList = new Student[100];
		int cur = 0;
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 전체 출력");
			System.out.println("3. 종료");
			
			// sel로 번호 입력
			int sel = sc.nextInt();
			
			// sel=번호입력이 1일 때, 학생 추가
			if(sel == 1) {
				System.out.println("지역을 입력하세요");
				String region = sc.next();
				Student stu;
				
				if(region.equals("대전")) {
					// 지역을 입력받고, 지역이 대전이라면
					// 파라미터 "이름", "나이" 인 생성자
					System.out.println("이름을 입력하세요");
					String name = sc.next();
					System.out.println("나이를 입력하세요");
					int age = sc.nextInt();
					
					stu = new Student(name, age);
					
				} else {
					// 지역이 대전이 아니라면 "지역", "이름", "나이" 인 생성자 호출
					System.out.println("이름을 입력하세요");
					String name = sc.next();
					System.out.println("나이를 입력하세요");
					int age = sc.nextInt();
					
					stu = new Student(region, name, age);
					
				}
				stuList[cur++] = stu;
				
			}
			
			// sel=번호입력이 2일 때, stuList for문으로 전체 출력
			if(sel == 2) {
				for (int i=0; i<cur; i++) {
					System.out.println(stuList[i]);
				}
			}
			
			// sel=번호입력이 3일 때, 종료
			if(sel == 3) break;
			
		}
		

	}

	public class Student {
		String nation;
		String region;
		String name;
		int age;
		
		public Student (String name, int age) {
			this("대전", name, age);
		}

		public Student (String region, String name, int age) {
			this("한국", region, name, age);
		}

		public Student(String nation, String region, String name, int age) {
			this.nation = nation;
			this.region = region;
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Student [nation=" + nation + ", region=" + region + ", name=" + name + ", age=" + age + "]";
		}
		
		
	}
}
