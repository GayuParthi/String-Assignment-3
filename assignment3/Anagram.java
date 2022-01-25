package week1.day2.assignment3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	
	String text1= "stops";
	String text2 = "potss";
	if(text1.length() == text2.length()) {
		char [] b = text1.toCharArray();
		char [] c = text2.toCharArray();
		Arrays.sort(b);
		Arrays.sort(c);
		boolean result = Arrays.equals(b,c);
		if(result == true) {
			System.out.println(text1+ "  and  " +text2+ "  are anagram");
		}
		else {
			System.out.println(text1+"  and  "+text2+"  are not an anagram");
		}
	}

}
}

