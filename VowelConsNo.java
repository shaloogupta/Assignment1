package Ineuron;

import java.util.Scanner;

public class VowelConsNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int countx=0,county=0;
		String str;
		System.out.println("Enter the string..........");
		str=sc.nextLine();
		char [] chr=str.toCharArray();
		for(int i=0;i<chr.length;i++) {
			if(chr[i]=='a'||chr[i]=='e'|| chr[i]=='i'||chr[i]=='o' ||chr[i]=='u'||chr[i]=='A'||chr[i]=='E'||chr[i]=='O'||chr[i]=='U'||chr[i]=='I') {
				countx++;
			}
			else {
				county++;
			}
		}
		System.out.println("No of vowels is "+countx);
		System.out.println("No of Consonants is "+county);
	}

}
