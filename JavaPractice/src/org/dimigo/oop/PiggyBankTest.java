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
public class PiggyBankTest {
	
	public static void main( String[] args){
		
		FamilyMember[] members = {
				new FamilyMember("아빠"), new FamilyMember("엄마"), 
				new FamilyMember("나"), new FamilyMember("남동생")
		};
		
		FamilyMember.printMemberCnt();
		
		System.out.println();
		
		PiggyBank.putMoney(members[0], 10000);
		PiggyBank.putMoney(members[1], 5000);
		PiggyBank.putMoney(members[2], 2000);
		PiggyBank.putMoney(members[3], 1000);
		
		PiggyBank.printBalance();
		
		
		
	}

}
