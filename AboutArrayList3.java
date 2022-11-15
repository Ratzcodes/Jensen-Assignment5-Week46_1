package Week46;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AboutArrayList3 {

	public static void main(String[] args) {
		
		//ArrayList initialized
		List <Integer> myIntArray = new ArrayList<>();
		
		// random number generation between 1 and 10
		Random random = new Random();
		
		// for loop to generate 15 numbers
		// store random numbers in array list
		for( int i= 0; i <15; i++) {
			myIntArray.add(random.nextInt(1,10));
		}

		System.out.println("Array list stored is: ");
		System.out.print(myIntArray + " ");
		System.out.println();
		
		// check if there is a 1 and 2 in the array. Check only the first 1's and 2's
		System.out.println("Contains 1? "+ myIntArray.contains(1));
		System.out.println("Contains 2? "+myIntArray.contains(2));
		
		//System.out.println("Index of last 2 is: " +myIntArray.lastIndexOf(2));
		
		int firstOne = myIntArray.indexOf(1) ;
		int firstTwo = myIntArray.indexOf(2);
		if( firstOne < firstTwo) {
			System.out.println("There is a 1 before a two");
			System.out.println("Index of first 1 is: "+ myIntArray.indexOf(1));
			System.out.println("Index of first 2 is: " +myIntArray.indexOf(2));
		}else {
			System.out.println("Did not find it.");
		}
	}

}
