package _17_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		
		// Soru: Verilen bir arraydeki tekrarli elemanlari silip, sadece unique degerlerden 
		// olusan bir liste haline getiren bir program yaziniz. 
		
		int arr[]= {1,2,3,4,4,5,7,3,4};
		
		int tekrarsizArray[]=tekrarlariSil(arr);
		
		System.out.println(Arrays.toString(tekrarsizArray));

	}

	       private static int[] tekrarlariSil(int[] arr) {
	    	   
	    	   Set<Integer> set1= new HashSet<>();
	    	   
	    	   for (Integer each : arr) {
	    		   
	    		   set1.add(each);
	    		   
	    		   
	    	   }
	    	   System.out.println(set1);
	    		   
	    		   int tekrarsizArray []= new int[set1.size()];
	    		   
	    		   int index=0;
	    		   
	    		   for (Integer each : set1) {
	    			   
	    			   tekrarsizArray[index]=each;
	    			   index++;
			}
	    		   
	    		  return tekrarsizArray;
		
		
		
	}

}
