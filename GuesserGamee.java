package Ineuron;

import java.util.Random;
import java.util.Scanner;

class Guesser{
	int guessNum;
	public int guessNumber() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Guesser please guess the number !");
//		guessNum=scan.nextInt();
//		return guessNum;
		System.out.println("Please enter the number in range 1 tp 20");
		Random rnd=new Random();
		guessNum=rnd.nextInt(10)+1;
		System.out.println("Number Guessed By The Guesser is"+" "+"xxxx");
		return guessNum;
	}
}

class players{
	int pGuessNum;
	public int pGuessNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Player please guess the number");
		pGuessNum=scan.nextInt();
		return pGuessNum;
	}
//	public void pGuessNumCompair(){
//		if(pGuessNum<=10) {
//			System.out.println(pGuessNum);
//		}
//		else {
//			
//		}
//	}
}
class umpire{
	int guessNumber;
	int p1GuessNumber;
	int p2GuessNumber;
	int p3GuessNumber;
	public void collectGuesserNum() {
		Guesser g=new Guesser();
		guessNumber=g.guessNumber();
	}
	public void collectPlayerNum() {
		players p1=new players();
		p1GuessNumber=p1.pGuessNumber();
		players p2=new players();
		p2GuessNumber=p2.pGuessNumber();
		players p3=new players();
		p3GuessNumber=p3.pGuessNumber();
		
	}
	public void compair() {
		if( p1GuessNumber<=10 && p2GuessNumber<=10 && p3GuessNumber<=10) {
		if(p1GuessNumber==guessNumber) {
			if(guessNumber==p2GuessNumber && guessNumber==p3GuessNumber) {
				System.out.println("Game tied ! Please try again");
			}
			else if(guessNumber==p2GuessNumber) {
				System.out.println("Player2 and Player1 won the match");
			}
			else if(guessNumber==p3GuessNumber){
				System.out.println("Player3 and Player1 won the match");
			}
			else {
			System.out.println("Player1 won the match");
		}
			}
		else if(p2GuessNumber==guessNumber) {
			if(guessNumber==p3GuessNumber) {
				System.out.println("Player two and player three won the match");
			}
			else {
			System.out.println("Player2 won the match");
		}
			}
		else if(p3GuessNumber==guessNumber) {
			System.out.println("Player3 won the match");
		}
		else {
			System.out.println("Match lost please try again!");
		}
		} 
		else {
			System.out.println("Please enter number in range And play again!");
			System.exit(0);
		}
	}
}





public class GuesserGamee {

	public static void main(String[] args) {
		umpire u=new umpire();
		u.collectGuesserNum();
		u.collectPlayerNum();
		u.compair();
		

	}

}
