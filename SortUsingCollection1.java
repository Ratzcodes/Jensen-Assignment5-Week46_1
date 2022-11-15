package Week46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortUsingCollection1 {

	public static void main(String[] args) {
		
		// create array list to store values, empty list
		List <Integer> intArray1 = new ArrayList <>();
		List <Integer> intArray2 = new ArrayList <>();
		
		// add random values to array list 1 and 2 and print
		for ( int i=0; i <10; i++) {
			Random rand = new Random();
			intArray1.add(rand.nextInt(20));
			intArray2.add(rand.nextInt(20));
		}
		
		System.out.println("Array 1 has: ");
		System.out.println(intArray1.toString());
		System.out.println("Array 2 has: ");
		System.out.println(intArray2.toString());
		
		// sort and print the arrays 1 and 2
		Collections.sort(intArray1);
		System.out.println("Arrary 1 sorted is: "+intArray1);
		
		Collections.sort(intArray2);
		System.out.println("Arrary 2 sorted is: "+intArray2);
		
		
	}
}
