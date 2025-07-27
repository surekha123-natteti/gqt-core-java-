package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count : ");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
                ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
			for (int j = i - 1; j >= 1; j--) {
                ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
			ch++;
			System.out.println();
		}
	}
}
