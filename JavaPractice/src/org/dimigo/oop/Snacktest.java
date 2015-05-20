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
public class Snacktest {
	
	public static void main(String[] args) {
		Snack[] snack = {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칩", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)	
		};
		
		/*Snack[] snack1 = new Snack[] {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칩", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)	
		};*/
		int sum = 0;
		for (Snack value : snack){
			value.printSnack();
			sum += value.total();
			System.out.println();
		}
		System.out.println(sum);
	}
	
	

}
