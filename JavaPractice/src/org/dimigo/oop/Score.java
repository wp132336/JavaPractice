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
public class Score {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		
		String score = new StringBuilder()
		.append("<<점수 출력>> ")
		.append("국어점수 : ")
		.append(kor)
		.append("수학점수 : ")
		.append(mat + "\n")
		.append("영어점수 : ")
		.append(eng + "\n")
		.append("총점 : ")
		.append(kor + mat + eng + "\n")
		.append("평균 : ")
		.append((kor + mat + eng )/ 3 + "\n").toString();
		
		System.out.println(score);
	}

}
