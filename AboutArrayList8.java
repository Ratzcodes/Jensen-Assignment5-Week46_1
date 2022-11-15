package Week46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class AboutArrayList8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		 * A program will generate 50 random values (with the class Random) between 0 and 2 
		 * and store it in an ArrayList<Integer>.
		 */
	Random rand = new Random();
	
	ArrayList<Integer> ali = new ArrayList<>();
	
	for(  int i=0; i <50; i++) {
		ali.add(rand.nextInt(0,2));
	}
	
	// The user will bet on one number between 0 and 2
	System.out.println("Enter your bet on one number between 0 and 2.");
	int input = Integer.parseInt(in.nextLine());
	
	/*
	 * If the number chosen by the user is the number that was most frequent in the array, the user wins a prize. 
	 * Otherwise, he will get nothing. 
	 * He should not get a prize neither if the most frequent number has the same frequency as another number. 
	 * Print a message accordingly.
	 */
	int freq_0 = Collections.frequency(ali,0);
	int freq_1 = Collections.frequency(ali,1);
	
	if ( freq_0 > freq_1) {
		if(input ==0) {
			System.out.println("You win the prize!\n");
		}else {
			System.out.println("You lost!\n");
		}
	}else if( freq_1 > freq_0) {
		if(input ==1) {
			System.out.println("You win the prize!\n");
		}else {
			System.out.println("You lost!\n");
		}
	}else if ( freq_1 == freq_0){
		System.out.println("Both numbers have the same frequency. You got lucky!!! \n");
	}
	
	// print the frequencies of the numbers within the array
	System.out.print("Array generated is: " + ali + " "+ "\n");
	System.out.print("Frequency of 0 is: " +freq_0+ "\n");
	System.out.print("Frequency of 1 is: " + freq_1+ "\n");
	
	in.close();
	}

}
