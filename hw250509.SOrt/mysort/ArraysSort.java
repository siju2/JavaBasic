package sort.mysort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSort {
	
	public static void  main(String[]args) {
		
		System.out.println("=========Sort Integer========");
		int[] numArr = {40, 30, 14, 15, 64 ,32};
		System.out.println("원본 :ㅣ" +Arrays.toString(numArr));
		
		Arrays.sort(numArr);
		System.out.println("오름차순 :ㅣ" +Arrays.toString(numArr));

		
		Integer[] numArr2 = {40, 30, 14, 15, 64 ,32};

		Arrays.sort(numArr2, Comparator.reverseOrder());
		System.out.println("원본 :ㅣ" +Arrays.toString(numArr2));

		System.out.println("========= Sort String ======\\");
		String[] strArr = {"d","A","C","F","E"};
		System.out.println("원본 :ㅣ" +Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("오름차순(대문자 무시): " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println("내림차순:" + Arrays.toString(strArr));

		
		Arrays.sort(strArr, Collections.reverseOrder());
		System.out.println("내림차순:(대문자 무시)"+ Arrays.toString(strArr));




		

	}

}
