package kr.or.ddit.study06.sec03;

public class Score {
	int kor;
	int eng;
	int math;
	
	double avg;
	
	// 기본 생성자 만들기
	public Score() {
		
	}
	
	// 파라미터 kor, eng, math로 하는 생성자 만들기
	
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor+eng+math)/3.0;
	}
	
	// toString 단축키
	// alt + shift + s
	
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	
	
	
}
