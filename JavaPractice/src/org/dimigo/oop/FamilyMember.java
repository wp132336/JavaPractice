/**
 * 
 */
package org.dimigo.oop;

import java.lang.reflect.Member;

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
public class FamilyMember {
	
	private static int memberCnt;
	private String membetName;
	
	public FamilyMember(String memberName){
		this.membetName = memberName;
		memberCnt++;
	}

	/**
	 * @return the membetName
	 */
	public String getMembetName() {
		return membetName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명 ");
	}

}
