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
		Car car= new Car();
		
		System.out.println("회사 : " + car.getCompany());
		System.out.println("모델 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최고속도 : " + car.getMaxspeed());
		System.out.println("가격 : " + String.format("%,d", car.getPrice()));
		System.out.println();
		
		car.setCompany("기아자동차");
		car.setMdoel("K7");
		car.setColor("흰색");
		car.setMaxspeed(246);
		car.setPrice(40000000);
		
		System.out.println("회사 : " + car.getCompany());
		System.out.println("모델 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최고속도 : " + car.getMaxspeed());
		System.out.println("가격 : " + String.format("%,d", car.getPrice()));
		System.out.println();
		
		car.setCompany("르노삼성자동차");
		car.setMdoel("SM7");
		car.setColor("회색");
		car.setMaxspeed(200);
		car.setPrice(38000000);
		
		System.out.println("회사 : " + car.getCompany());
		System.out.println("모델 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최고속도 : " + car.getMaxspeed());
		System.out.println("가격 : " + String.format("%,d", car.getPrice()));
		System.out.println();



}
	
}
