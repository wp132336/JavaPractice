/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Example
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 1
 * </pre> 
 * @author : 하상혁
 * @version : 1.0
 * 
 */
public class CarTest {
	public static void main(String[] args) {
		//Car car= new Car();
		//Car car2 = new Car();
		Car3 genesis =new Car3("현대자동차", "제네시스" , "검정색", 225 , 50000000);
		Car3 K7 =new Car3("현대자동차", "제네시스" , "흰색", 246);
		Car3 sm7 =new Car3("삼성자동차", "sm7" , "회색");
		
		
		
		
		System.out.println("회사 : " + genesis.getCar3());
		System.out.println("모델 : " + genesis.getModel());
		System.out.println("색상 : " + genesis.getColor());
		System.out.println("최고속도 : " + genesis.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d", genesis.getPrice()));
		System.out.println();
		
		/*car2.setCompany("기아자동차");
		car2.setMdoel("K7");
		car2.setColor("흰색");
		car2.setMaxspeed(246);
		car2.setPrice(40000000);*/
		
		System.out.println("회사 : " + K7.getCompany());
		System.out.println("모델 : " + K7.getModel());
		System.out.println("색상 : " + K7.getColor());
		System.out.println("최고속도 : " + K7.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d", K7.getPrice()));
		System.out.println();
		
		/*car2.setCompany("르노삼성자동차");
		car2.setMdoel("SM7");
		car2.setColor("회색");
		car2.setMaxspeed(200);
		car2.setPrice(38000000);*/
		
		System.out.println("회사 : " + sm7.getCompany());
		System.out.println("모델 : " + sm7.getModel());
		System.out.println("색상 : " + sm7.getColor());
		System.out.println("최고속도 : " + sm7.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d", sm7.getPrice()));
		System.out.println();



}
	
}
