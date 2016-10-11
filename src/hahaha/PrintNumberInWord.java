package hahaha;

import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a integer:");
		num = scan.nextInt();
		
		if(num==1){
			System.out.print("The input integer is ÅgONEÅh.");
		}
		else if(num==2){
			System.out.print("The input integer is ÅgTWOÅh.");
		}
		else if(num==3){
			System.out.print("The input integer is ÅgTHREEÅh.");
		}
		else if(num==4){
			System.out.print("The input integer is ÅgFOURÅh.");
		}
		else if(num==5){
			System.out.print("The input integer is ÅgFIVEÅh.");
		}
		else if(num==6){
			System.out.print("The input integer is ÅgSIXÅh.");
		}
		else if(num==7){
			System.out.print("The input integer is ÅgSEVENÅh.");
		}
		else if(num==8){
			System.out.print("The input integer is ÅgEIGHTÅh.");
		}
		else if(num==9){
			System.out.print("The input integer is 1ÅgNINEÅh.");
		}
		else {
			System.out.print("The input integer is ÅgOTHERÅh.");
		}
}
}
