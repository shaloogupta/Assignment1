package Ineuron;

import java.util.Scanner;

public class SpecialChrNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String src;
		System.out.println("Enter the string.... ");
		src=sc.nextLine();
		char [] chr=src.toCharArray();
		for(int i=0;i<chr.length;i++) {
			if(chr[i]>=33 && chr[i]<48 || chr[i]>=58 && chr[i]<65) {
				count++;
			}
		}
		System.out.println("No of special character "+count);
	}

}
