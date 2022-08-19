package Ineuron;

import java.util.Arrays;

import java.util.Scanner;

//A pangram is a sentence that includes every letter of the alphabet

public class StringPangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1;
		System.out.println("Enter the String ");
		str1=sc.nextLine();
		String str=str1.toUpperCase(); //convert enterd string into captial letter
		str=str.replace(" ", ""); // remove space
		char[]chr=str.toCharArray();
		int size=str.length();
		int array[]=new int[26];
		for(int i=0;i<array.length;i++) {
			array[i]=0;
		}
		int j;
		for(j=0;j<size;j++) {
			int i=chr[j]-65; 
			array[i]=1;
		}
		j=0;
		while(j!=26) {
			if(array[j]==1) {
				++j;
			}
			else {
				System.out.println("Entered sentence is "+"Non-Pangram ");
				System.exit(0);
			}
		}
		System.out.println("Entered sentence is "+"Pangram");
	}

}
