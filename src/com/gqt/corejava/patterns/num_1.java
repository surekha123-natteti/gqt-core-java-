/**
*  
*            
*            
* 
*            
*            
*            
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author NATTETI SUREKHA
 * @category patterns
 * @description This is an example for number pattern 
 */
public class num_1 {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n/2 || j==n/2 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}