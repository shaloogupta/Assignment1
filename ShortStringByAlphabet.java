package Ineuron;

import java.util.Arrays;
import java.util.Scanner;

public class ShortStringByAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=sc.nextLine();
		char []chr=str.toCharArray();
		Arrays.sort(chr);
		System.out.println(chr);
	}

}
