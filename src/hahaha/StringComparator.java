package hahaha;

import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		String str1,str2;
		int flag=1;
		Scanner scan = new Scanner(System.in);
		while(flag==1){
			System.out.print("Enter a string 1:");
			str1 = scan.next();
			System.out.print("Enter a string 2:");
			str2 = scan.next();
		
			if(str1.equalsIgnoreCase(str2)){
				System.out.print("The two strings are the same.");
				break;
			}
			else{
				System.out.print("The two strings are not the same.");
				System.out.println();
				continue;
			}
		}
		
	}
}
