/*Console based game To find a random number between a pre specified range, By using Basic
  while loops,count function and some conditional statements.
  ->Print the winning message & also shows the number of attemp by using the count function.
  ->Also added a default number, By inserting you can find that Random Number. */

package com.game;

import java.util.Scanner;

public class MyGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count=1;
		System.out.println("Press any number between 0 to 99");
		System.out.print(count+".");
		int no = sc.nextInt();
		int def=12345;
		int random = (int) (Math.random()*100);
		
		while(no!=random && no!=def) {
			System.out.println();
			if(no>random)
				System.out.println(":( Type lower than "+no+" try again");
			else
				System.out.println(":( Type higher than "+no+" try again");
			
			count++;
			System.out.print(count+".");
			no = sc.nextInt();
		}
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("Congratulation, You won.... Number is "+random);
		System.out.println("Your total attempt is "+count);
		if(count<10) {
			System.out.println("*****Good Job*****");
		}
		else {
			System.out.println("Too much Attampts,try again!!");
		}
		sc.close();

	}

}