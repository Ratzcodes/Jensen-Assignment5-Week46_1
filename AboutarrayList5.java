package Week46;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AboutarrayList5 {

	public static void main(String[] args) {
		// 10 iterations, random values between 1-20, store in arrayList
		
		
		List <Integer> arrList1 = new ArrayList <>();
		Random rand = new Random();
		
		for(int i=0; i <10; i++) {
			arrList1.add(rand.nextInt(1,20));
		}
		System.out.print("First array list is: "+ arrList1+" "+"\n");

		// 10 iterations, values between 21 and 40, store in array list
		List <Integer> arrList2 = new ArrayList <>();
		
		for(int i=0; i <10;i++) {
			arrList2.add(rand.nextInt(21,40));
		}
		System.out.println("Second array lsit is: "+ arrList2+ " "+"\n");
	
	//third array list
	List<Integer> finalArr = new ArrayList<>();
	
	for(int i=0; i <10; i++) {
		finalArr.add(arrList1.get(i));
		finalArr.add(arrList2.get(i));
	  }
	
	System.out.print("Alternatively merged array is: "+ finalArr+" ");
	}
}
