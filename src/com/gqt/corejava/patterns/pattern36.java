package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count : ");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			ch = (char) ('A' + i - 2);
            for(int k = i - 1; k >= 1; k--) {
                System.out.print(ch + " ");
                ch--;
            }
			ch++;
			System.out.println();
		}
			
	}

}
