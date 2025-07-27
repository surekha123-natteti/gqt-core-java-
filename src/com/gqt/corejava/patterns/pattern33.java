package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count : ");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			char temp = ch;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(temp + " ");
                temp--;
            }
			ch+=2;
			System.out.println();
		}
	}

}
