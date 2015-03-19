package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		
		int s1a1 = 10;
		int s1a2 = 9;
		double s1h1 = 5.8;
		int s2a1 = 9;
		double s2h1 = 5.4; 
		
		double sadary = (double) ((s1a1+s1a2) * s1h1/2);
		double s = (double) (s2a1 * s2h1);
		
		System.out.println("<< 도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : " + sadary);
		System.out.println("평행 사변형 넓이 : " + s);
		
		System.out.println("사다리꼴이 평행사변형보다 " + (sadary - s) + " 더 큽니다");
	}

}
