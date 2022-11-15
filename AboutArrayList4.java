package Week46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AboutArrayList4 {

	public static void main(String[] args) {
		List<Integer> myArr = new ArrayList <>();
		Random random = new Random();
		
		//10 iterations
		for( int i=0; i <=9; i++) {
			// values between 1 and 20
			myArr.add(random.nextInt(1,20));
		}
		System.out.print("Values in my array are: " + myArr + " \n");

		if(myArr.contains(5)) {
			System.out.println("My array contains 5.\n");
			System.out.println("The frequency of 5 is: " + Collections.frequency(myArr, 5));
		}else {
			System.out.println("No occurence of 5 in array.");
		}
	}

}
