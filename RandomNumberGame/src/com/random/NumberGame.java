package com.random;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
//		scan numner from users
		Scanner sc = new Scanner(System.in);
		
//		To generate random number 
		Random random = new Random();
		
		int minNum = 1,maxNum = 100,limiteToAttemp = 5;
		int rounds =0,totalAttemps = 0,totalRoundsWon = 0;
		
		System.out.println("Welcome to Number Guessing Game");
		
		boolean tryAgain = true;
		while(tryAgain)
		{
		
		int generateNum = random.nextInt(maxNum - minNum + 1) + minNum ;
		
		System.out.println("Guess the Number between " + minNum + " and " + maxNum);
		
		System.out.println("you have " + limiteToAttemp + " attemp to guess");
		
		int attempts = 0;
		
		boolean correctGuess = false;
		
		while(attempts < limiteToAttemp && !correctGuess)
		{
		  System.out.println("Enter your number : "); 
		  int userNum = sc.nextInt();
		  attempts++;
		  
		  if(userNum == generateNum)
		  {
			  System.out.println("you Won! You Guess the correct Number");
			  correctGuess = true;
			  totalRoundsWon++;
		  }else if(userNum < generateNum)
		  {
			  System.out.println("Number Small then generated Number");
		  }else
		  {
			  System.out.println("Number Big then generated Number");
		  }
		}
		totalAttemps += attempts;
		rounds++;
		
		System.out.println("The number was " + generateNum);
		System.out.println("Attemps are " + attempts);
		System.out.println("Do you want To Play again(yes/no)");
		 
		String playAgain = sc.next();
		tryAgain = playAgain.equalsIgnoreCase("yes");
	}
		System.out.println("Game Over");
		System.out.println("Total rounds played :" + rounds);
		System.out.println("Total attemps :" + totalAttemps);
		System.out.println("Total rounds Won :"+ totalRoundsWon );

		sc.close();
	}
}






