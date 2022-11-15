package Week46;

import java.util.Arrays;
import java.util.Random;

public class SortUsingArrays1 {

	public static void main(String[] args) {
		//Create two array of integers, i.e. int[], of 10 positions each
		int[] intArr1 = new int[10];		// declaring arrays
		int[] intArr2 = new int[10];
		
		// generate random array of integers
		Random random = new Random();
		
		for( int i= 0; i <intArr1.length; i++) {
			intArr1[i]= random.nextInt(20); // storing random integers in an array(0-20)
			intArr2[i] = random.nextInt(20);
		}
		
		System.out.print("Array 1 is: "+ Arrays.toString(intArr1)+"\n");
		System.out.print("Array 2 is: "+ Arrays.toString(intArr2)+"\n");
		System.out.println();
		
		// sorting the elements of each array
		Arrays.sort(intArr1);
		Arrays.sort(intArr2);
		
		// print the elements of the arrays by using the method Arrays.toString()
		System.out.print("Sorted Array 1 is: "+ Arrays.toString(intArr1)+"\n");
		/*
		 * System.out.println("\nThe sorted array is: ");
        	for (int num : intArr1) {
            System.out.print(num + " ");
        }
		 */
		System.out.print("Sorted Array 2 is: "+ Arrays.toString(intArr2)+"\n");
		
		

	}

}
