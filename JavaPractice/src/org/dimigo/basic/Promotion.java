package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		
		int pay = 1700000;
		int workers = 3;
		int marcket = 1500;
		
		long yearspay =  (long)pay * 12 * workers * marcket;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 편균 급여 : " + String.format("%,d", pay));
		System.out.println("점포 내 직원 수 : " + String.format("%,d", workers));
		System.out.println("점포 수 :  " + String.format("%,d", marcket));
		System.out.println("연간 인건비 : " + String.format("%,d", yearspay));
	}

}
