package com.gqt.corejava.patterns;
import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		int value=1;
		for(int i=1;i<=n;i++) {
			value=i;
			for(int j=1;j<=n;j++) {
				System.out.print(value+"	");
				value=value+n;
			}
			System.out.println();
		}
	}

}