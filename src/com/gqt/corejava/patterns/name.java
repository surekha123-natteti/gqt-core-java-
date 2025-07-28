/**
*       * 	* * * * * 	* * * * * 	* * * * * 	* * * * * 	* * * * * 	* * * * * 
* *     * 	*       * 	    *     	    *     	*         	    *     	    *     
*   *   * 	* * * * * 	    *     	    *     	* * * * * 	    *     	    *     
*     * * 	*       * 	    *     	    *     	*         	    *     	    *     
*       * 	*       * 	    *     	    *     	* * * * * 	    *     	* * * * * 

* * * * * 	*       * 	* *  *      * * * * * 	*   *     	*       * 	* * * * * 	
*         	*       * 	*    *      *         	* *       	*       * 	*       * 	
* * * * * 	*       * 	* *  *      * * * * * 	*         	* * * * * 	* * * * * 	
        * 	*       * 	* *       	*         	* *       	*       * 	*       * 	
* * * * * 	* * * * * 	*   *     	* * * * * 	*   *     	*       * 	*       * 	
             
 */
package com.gqt.corejava.patterns;
import java.util.Scanner;

/**
 * @author NATTETI SUREKHA
 * @category patterns
 * @description This is an example for alphabets pattern 
 */
public class name {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			//N
			for(int j=0;j<n;j++) {
				if(j==n-1 || i==j || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//A
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n/2) || j==(n-1) || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//T
			for(int j=0;j<n;j++) {
				if(j==n/2 || i==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//T
			for(int j=0;j<n;j++) {
				if(j==n/2 || i==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//E
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || i==(n/2) || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//T
			for(int j=0;j<n;j++) {
				if(j==n/2 || i==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//I
			for(int j=0;j<n;j++) {
				if(i==n-1 || j==(n/2) || i==0 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			//S
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || i==n/2 || j==0 && i<=n/2 || j==n-1 && i>=n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//U
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==n-1  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//R
			for(int j=0;j<n;j++) {
				if(i==n/2 && j<=n/2|| j==0 || i==0 && j<=n/2 || j==n/2 && i<=n/2 || i-j==n/2 && i>=n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//E
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || i==(n/2) || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//K
			for(int j=0;j<n;j++) {
				if(i+j==n/2 || i-j==(n/2) || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//H
			for(int j=0;j<n;j++) {
				if(j==n-1 || i==(n/2) || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			//A
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n/2) || j==(n-1) || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}

			System.out.print("	");
			System.out.println();
		}
		
	}

}