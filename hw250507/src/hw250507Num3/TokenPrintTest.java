package hw250507Num3;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {
	
	public static void main(String[]args) {
		
		String s = "of the people, by the peole, for the people";
		
		try {
			showTokens(s," , ");
		}	catch(NoSuchElementException e) {
		System.out.println("끝");
		}
		
	}


	public static void showTokens(String str, String delim) {
		StringTokenizer st = new StringTokenizer(str, delim);
		
		while (true) {
			if (st.hasMoreTokens()) {
				String token = st.nextToken();
				System.out.println(token);
				
			} else {
				throw new NoSuchElementException();
			}
			
		}
	}
}
