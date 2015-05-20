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
public class Snack {
	public String name;
	public String company;
	public int price;
	public int amount;
	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param amount
	 */
	
	public Snack(){
		
	}
	public Snack(String name, String company, int price, int amount) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.amount = amount;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void printSnack(){
		
	System.out.print("이름 : ");
	System.out.println(name);
	System.out.print("제조사: ");
	System.out.println(company);
	System.out.print("가격 : ");
	System.out.println(price);
	System.out.print("개수 : ");
	System.out.println(amount);
	
	}
	
	public int total(){
		return price*amount;
	}
	
}
