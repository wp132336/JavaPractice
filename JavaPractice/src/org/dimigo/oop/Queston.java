/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

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
public class Queston {
	
	public static void main(String[] args){
		
		System.out.println("가장 좋아하는 가수는?");
		
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		
		if("빅뱅".equalsIgnoreCase(answer)){
			System.out.println("정답입니다.");
		}else{
			System.out.println("틀렸습니다.");
		}
		
		System.out.println("");
		
		System.out.println("가장 좋아하는 배우는?");
		
		String answer2 = scanner.nextLine();
		
		if("현빈".equalsIgnoreCase(answer2)){
			System.out.println("정답입니다.");
		}else{
			System.out.println("틀렸습니다.");
		}
		
		System.out.println("");
		
		System.out.println("가장 좋아하는 과목은?");
		
		String answer3 = scanner.nextLine();
		
		if("자바".equalsIgnoreCase(answer3)){
			System.out.println("정답입니다.");
		}else{
			System.out.println("틀렸습니다.");
		}
		
	}

}
