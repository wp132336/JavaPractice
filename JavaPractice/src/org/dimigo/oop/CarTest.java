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
		Car car2 = new Car();
		
		System.out.println("회사 : " + car2.getCompany());
		System.out.println("모델 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최고속도 : " + car2.getMaxspeed());
		System.out.println("가격 : " + String.format("%,d", car2.getPrice()));
		System.out.println();
		
		car2.setCompany("기아자동차");
		car2.setMdoel("K7");
		car2.setColor("흰색");
		car2.setMaxspeed(246);
		car2.setPrice(40000000);
		
		System.out.println("회사 : " + car2.getCompany());
		System.out.println("모델 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최고속도 : " + car2.getMaxspeed());
		System.out.println("가격 : " + String.format("%,d", car2.getPrice()));
		System.out.println();
		
		car2.setCompany("르노삼성자동차");
		car2.setMdoel("SM7");
		car2.setColor("회색");
		car2.setMaxspeed(200);
		car2.setPrice(38000000);
		
		System.out.println("회사 : " + car2.getCompany());
		System.out.println("모델 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최고속도 : " + car2.getMaxspeed());
		System.out.println("가격 : " + String.format("%,d", car2.getPrice()));
		System.out.println();



}
	
}
