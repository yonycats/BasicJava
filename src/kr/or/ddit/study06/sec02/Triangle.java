package kr.or.ddit.study06.sec02;

public class Triangle {
	Point p1;
	Point p2;
	Point p3;
	
	@Override
	public String toString() {
//		return "("+p1.x+", "+p1.y+"), "+"("+p2.x+", "+p2.y+"), "+"("+p3.x+", "+p3.y+"), ";
		return p1 + ", " + p2 + ", " + p3;
	}
}
