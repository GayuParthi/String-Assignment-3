package week1.day2.assignment3;

public class Palindrome {
	public static void main(String[] args) {
		String value = "maDam";
		String rev = "";
		for(int i = value.length()-1;i>=0;i--) {
			rev = rev+value.charAt(i);
		}
	if(value.equalsIgnoreCase(rev)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not a Palindrome");
	}
	}

}
