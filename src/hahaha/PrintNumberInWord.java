package hahaha;

import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a integer:");
		num = scan.nextInt();
		
		if(num==1){
			System.out.print("The input integer is �gONE�h.");
		}
		else if(num==2){
			System.out.print("The input integer is �gTWO�h.");
		}
		else if(num==3){
			System.out.print("The input integer is �gTHREE�h.");
		}
		else if(num==4){
			System.out.print("The input integer is �gFOUR�h.");
		}
		else if(num==5){
			System.out.print("The input integer is �gFIVE�h.");
		}
		else if(num==6){
			System.out.print("The input integer is �gSIX�h.");
		}
		else if(num==7){
			System.out.print("The input integer is �gSEVEN�h.");
		}
		else if(num==8){
			System.out.print("The input integer is �gEIGHT�h.");
		}
		else if(num==9){
			System.out.print("The input integer is 1�gNINE�h.");
		}
		else {
			System.out.print("The input integer is �gOTHER�h.");
		}
}
}
