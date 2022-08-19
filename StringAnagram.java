package Ineuron;

import java.util.Arrays;
import java.util.Scanner;
//If two string contain the same set of character but in the different order then they are classified a Anagram
public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take Two String From User.
		String str;
		String strr;
		System.out.println("Enter the First String");
		str=sc.nextLine();
		String str1=str.toLowerCase();//convert enterd string into lower string
		System.out.println("Enter the Second String");
		strr=sc.nextLine();
		 String str2=strr.toLowerCase();//convert entered string into lower string 
		//Conver string to character array
		char [] char1=str1.toCharArray();
		char [] char2=str2.toCharArray();
		//sort the character by alphabet 
		Arrays.sort(char1);
		Arrays.sort(char2);
		//Compair two character array
		if(Arrays.equals(char1, char2)) {
			System.out.println("String is  Anagram ");
		}
		else {
			System.out.println("String is not Anagram ");
		}
	}

}
