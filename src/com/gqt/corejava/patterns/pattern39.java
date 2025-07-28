/**
 * - - - - - $
 * - - - - $ $ $
 * - - - $ $ $ $ $
 * - - $ $ $ $ $ $ $
 * - $ $ $ $ $ $ $ $ $
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author NATTETI SUREKHA
 * @category patterns
 * @description This is an example for pyramid pattern
 */
public class pattern39 {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				 System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}

}
