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
public class Car {
	private String company ="현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String newCompany){
		company = newCompany;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setMdoel(String newModel){
		model = newModel;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public int getMaxspeed() {
		return maxSpeed;
	}
	
	public void setMaxspeed(int newMaxspeed){
		maxSpeed = newMaxspeed;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
	

	
	
	
	
	
}
