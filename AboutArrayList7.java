package Week46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class AboutArrayList7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// creating an ordered ArrayList of integers of 10 positions with values from 1 to 10
		
		ArrayList< Integer> intArrList = new ArrayList<>();
		Random ran = new Random();
		for(int i=0; i <10; i++) {
			intArrList.add(ran.nextInt(1,10));
		}
		System.out.print("Array List generated is: "+intArrList+" "+"\n");
		
		// shuffle the ArrayList, using method from Collection
		Collections.shuffle(intArrList);
		System.out.print("Shuffled Array list is: "+intArrList + " "+"\n");
		
		
		//System.out.print("Array contains number 5? " +intArrList.contains(5));
		if(intArrList.contains(5) == true) {
		
			// Three guesses using loop
		System.out.println("Guess the index of number 5.\nValues are between 0 and 9. \nYou got 3 chances to get it right. \n");
		System.out.println("Please enter your guesses.");
		for( int i = 1; i <4; i++) {
			System.out.println("This is your guess number "+i);
			//System.out.println("Enter your guess.");  //User input
			int guess = Integer.parseInt(in.nextLine());
			
			if(guess >9 || guess <0) {
				System.out.println("Invalid guess. Please enter number between 0 and 9.");
			}else if(guess == intArrList.indexOf(5)) {
				System.out.println("You got it right.You Win a Prize!!!");
				break;
			}else {
				System.out.println("You got it wrong." );
			}
			
		 }
		System.out.println("GAME OVER!");
		System.out.print("Array is: " +intArrList + " ");
	}else{
		System.out.println("Array does not contain number 5.");
		}
		
		in.close();
	}		 
}
