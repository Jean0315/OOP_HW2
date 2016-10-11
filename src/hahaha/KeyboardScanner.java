package hahaha;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		int num1;
		float num2;
		String str; 	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a integer:");
		num1 = scan.nextInt();
		System.out.print("Enter a float point number:");
		num2 = scan.nextFloat();
		System.out.print("Enter a you name:");
		str = scan.next();
		
		System.out.println();
		
		System.out.print("Hi "+str);
		System.out.print(", the multiplication of "+num1);
		System.out.print(" and "+num2);
		System.out.print(" is 3.77e+02. ");

	}
}
