package Lab6;

import java.util.Stack;

public class DecodeStringStack {

	public static void main(String[] args) 
	{
		System.out.println(decode("3[a]2[bc]")); 
		System.out.println(decode("3[a2[c]]")); 
		System.out.println(decode("2[abc]3[cd]ef"));
		System.out.println(decode("abc3[cd]xyz" ));
		System.out.println(decode("3[cd]"));
		System.out.println(decode("a5[x]ts"));
		System.out.println(decode("abc"));
		System.out.println(decode("2[3[cd]]"));
		System.out.println(decode("10[word]"));


		
		
	}
	
	
	public static String decode(String input) 
	{
	    // Initialize stacks to keep track of counts and previous strings
	    Stack<Integer> countStack = new Stack<>();
	    Stack<StringBuilder> stringStack = new Stack<>();
	    
	    // Initialize current string and count
	    StringBuilder currentString = new StringBuilder();
	    int count = 0;

	    // Iterate over each character in the input string
	    for (char c : input.toCharArray()) 
	    {
	        if (Character.isDigit(c)) 
	        {
	            // If the current character is a digit, add it to the current count
	            count = count * 10 + (c - '0');
	        } 
	        else if (c == '[') 
	        {
	            // If the current character is a left squaatore bracket, push the current count and string onto their respective stacks
	            countStack.push(count);
	            stringStack.push(currentString);
	            // Reset the current count and string
	            count = 0;
	            currentString = new StringBuilder();
	        } 
	        else if (c == ']') 
	        {
	            // If the current character is a right square bracket, pop the previous count and string from their respective stacks
	            int repeatCount = countStack.pop();
	            StringBuilder repeatedString = new StringBuilder();
	            // Repeat the current string the appropriate number of times
	            for (int i = 0; i < repeatCount; i++) 
	            {
	                repeatedString.append(currentString);
	            }
	            // Append the repeated string to the previous string and assign the result to the current string
	            currentString = stringStack.pop().append(repeatedString);
	        } 
	        else 
	        {
	            // If the current character is a letter, append it to the current string
	            currentString.append(c);
	        }
	    }

	    // Return the final value of the current string
	    return currentString.toString();
	}
}