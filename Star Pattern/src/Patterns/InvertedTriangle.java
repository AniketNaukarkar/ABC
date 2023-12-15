package Patterns;

import java.util.Scanner;

public class InvertedTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int i=sc.nextInt();
		System.out.println();
		
		for (int j = i; j >= 1; j--) {
			for (int k = 1; k <= j; k++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
	}

}
