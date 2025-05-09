package sort.javaapi.builtin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSort {
	
	public static void main(String[] args) {
		
		System.out.println("================ Sort Integer ================");
		int[] numArr = {40, 15, 34, 21, 66, 53};
		System.out.println("원본 :" + Arrays.toString(numArr));
		
		
		Arrays.sort(numArr);
		System.out.println("오름차순 : " + Arrays.toString(numArr));
		
		
		
		Integer[] numArr2 = {40, 15, 34, 21, 66, 53};
		Arrays.sort(numArr2, Comparator.reverseOrder());
		System.out.println("오름차순 : " + Arrays.toString(numArr));
		
		
		Arrays.sort(numArr2, Comparator.reverseOrder());
	    System.out.println("내림차순 : " + Arrays.toString(numArr2));
		
		System.out.println("===== Sort String =====");
		String[] strArr = {"d", "A", "C", "F", "a"};
		System.out.println("원본 :" + Arrays.toString(strArr));
		
		
	    Arrays.sort(strArr);
	    System.out.println("오름차순 :" + Arrays.toString(strArr));
	    
	    
	    Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
	    System.out.println("오름차순 (대소문자 무시) :" + Arrays.toString(strArr));
	    
	    
	    Arrays.sort(strArr, Comparator.reverseOrder());
	    System.out.println("내림차순 : " + Arrays.toString(strArr));
	    
	    
	    Arrays.sort(strArr, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
	    System.out.println("내림차순 (대소문자 무시) :" + Arrays.toString(strArr));
	
	    
	}

}
