package iterator;

import java.util.Arrays;
import java.util.Collections;

public class Iteradora {

	public static void main(String[] args) {
		
		System.out.println("I N I C I O");
		Integer[] numbers ={1, 2, 3,7,43, 4, 5};
		Integer  toSort[] = { 5, 1, 89, 255, 7, 88, 200, 123, 66 }; 
		Arrays.sort(toSort);
		SequenceIterator<Integer> it = new SequenceIterator(toSort);
		
		 
		for(Integer num: it) {
			System.out.println(num);
		}
		
		String[] languages = new String[]{"C", "C++", "Java", "Python", "Scala"};
		SequenceIterator<String> languagesList = new SequenceIterator(languages);
		System.out.println("");
	    // Since our class SOList is an instance of Iterable, then we can use it on a foreach loop
	    for(String lang : languagesList) {
	        System.out.println(lang);
	    }
	    
	    
	    Integer[] allNumber = new Integer[]{1, 2,9,8, 3, 4, 5};
	    SequenceIterator<Integer> allNumbers = new SequenceIterator(numbers);
//	    while (allNumbers.iterator().hasNext()) {
//	    	System.out.println("entro\n");
//	        Integer value = allNumbers.iterator().next();
//	      //  if (allNumbers.iterator().hasNext()) {
//	            System.out.print(value + ", ");
////	        } else {
////	            System.out.print(value);
////	        }
//	    } 
	    
	    
	    
		
	}

}
