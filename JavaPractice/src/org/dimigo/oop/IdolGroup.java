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
public class IdolGroup {

	public static void main(String[] args) {
		
		String[] idolgroup = {"빅뱅", "2NE1", "걸스데이" };
		
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "해리"}
		};
		
		for(int i = 0; i < idolgroup.length; i++){
			System.out.println("<<" + idolgroup[i] + ">>");
			for(int j = 0; j< members[i].length; j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
	}
	
}

