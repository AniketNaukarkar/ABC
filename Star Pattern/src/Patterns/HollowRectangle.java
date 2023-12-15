package Patterns;

import java.util.Scanner;

public class HollowRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int i=sc.nextInt();
		System.out.println("Enter otherrrr no:");
		int j=sc.nextInt();
		System.out.println();
		
		for (int k = 1; k <= i; k++) {
			for (int l = 1; l <= j; l++) {
				if ((k==1 || k==i) || (l==1 || l==j)) {
					System.out.print("*");
				} 
				else {
					System.out.print(" ");

				}	
			}
			System.out.println();
			
		}
	}

}
