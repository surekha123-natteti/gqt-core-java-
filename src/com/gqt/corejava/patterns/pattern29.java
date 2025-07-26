package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		for(int i=n;i>1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(i+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();

		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(i+" ");
			}
			System.out.println();

		}
	}

}
