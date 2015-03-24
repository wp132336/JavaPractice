package org.dimigo.basic;

public class Condition {
	
	public static void main(String[] args) {
		
		String cor = "고속버스";
		int gate = 10;
		int charge = 0;
		int plus = 0;
		
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : " + gate);
		System.out.println("차종 : " + cor);
		
		switch(cor) {
		case "고속버스" :
		     charge = 850;
		     break;
		case "경차" :
			charge = 300;
	     break;
	     default :
	    	 charge = 600;	 
		}
		
		switch(cor) {
		case "고속버스" :
		     plus = 300;
		     break;
	     default :
	    	 plus = 200;	 
		}
		
		if (gate <= 10){	
			System.out.println("통행료 : " + charge);
		} else 	
			System.out.println("통행료 : " + charge + plus * gate/10);		
		}
		
	

}
