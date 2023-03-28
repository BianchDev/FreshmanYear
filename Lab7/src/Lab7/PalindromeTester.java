package Lab7; 
public class PalindromeTester {

	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		
		System.out.println("String \"aba\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("aba"));
		System.out.println();
		
		System.out.println("String \"otto\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("otto"));
		System.out.println();
		
		System.out.println("String \"1o22t3t2o\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("1o22t3t2o"));
		System.out.println();
		
		System.out.println("String \"1456\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("1456"));
		System.out.println();
		
		System.out.println("String \"\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur(""));
		System.out.println();
		
		System.out.println("String \"abcd\": ");
		System.out.println("Expected Result: false");
		System.out.println("Recursion Result: " + p.palidromeRecur("abcd"));
		System.out.println();
		
		System.out.println("String \"1a1\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("1a1"));
		System.out.println();

		System.out.println("String \"1bb\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("1bb"));
		System.out.println();
		
		System.out.println("String \"never odd or even\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("never odd or even"));
		System.out.println();
      
      System.out.println("String \"122a12\": ");
		System.out.println("Expected Result: true");
		System.out.println("Recursion Result: " + p.palidromeRecur("122a12"));
		System.out.println();

	}

}
