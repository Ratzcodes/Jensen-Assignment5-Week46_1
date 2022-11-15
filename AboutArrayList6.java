package Week46;

import java.util.ArrayList;
import java.util.List;

public class AboutArrayList6 {

	public static List <Character> stringConversion(String string) {
				// convert string to character array and store in array List
				List <Character> chars = new ArrayList <>();
				
				for( Character ch : string.toCharArray()) {
					chars.add(ch);
				}
				
				return chars;
	}
	
	
	//Driver method
	public static void main(String[] args) {
		
		// Store text in a string variable
		String str = "“Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Tenent mordicus. Plane idem, inquit, et maxima quidem, qua fieri nulla maior potest. "
				+ "Hoc est non dividere, sed frangere. Duo Reges: constructio interrete. Propter nos enim illam, "
				+ "non propter eam nosmet ipsos diligimus. Conferam tecum, quam cuique verso rem subicias; "
				+ "Naturales divitias dixit parabiles esse, quod parvo esset natura contenta. Nulla erit controversia.”";
		
		List <Character> chars =  stringConversion(str);
		System.out.println(chars);
		
		// int occurrences = Collections.frequency(animals, "bat");
		
		int vCount = 0;
		for( int i=0; i <chars.size(); i++) {
			if(chars.get(i) == 'a'|| chars.get(i) == 'e'||chars.get(i) == 'i'||chars.get(i) == 'o'||chars.get(i) == 'u' ||chars.get(i) == 'A'||chars.get(i) == 'E'||chars.get(i) == 'I'||chars.get(i) == 'O'||chars.get(i) == 'U') {
				vCount++;
			}
		}
		System.out.println("Count of vowels is: " +vCount++);
		
	}
	
	

}
