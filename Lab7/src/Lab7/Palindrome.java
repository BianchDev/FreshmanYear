package Lab7; 
public class Palindrome {

	/**
	 * 
	 * @param s is a string mixed with letter and non-letter characters
	 * @return true if s is a palindrome
	 */
	public boolean palidromeRecur(String s) 
	{
		String text = "";
		for (int i = 0; i < s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				text += s.charAt(i);
			}
		}
		if (text.length() <= 1)
		{
			return true; 
		} 
		else {
			
			if (text.charAt(0) == text.charAt(text.length()-1)) {
			  return (palidromeRecur(text.substring(1, text.length()-1)));
			}
			else {
				return false;
			}

		}

	}
		

	/**
	 * 
    * This is the bonus question, and it is optional
    *
	 * @param s is a string mixed with letter and non-letter characters
	 * @return true if s is a palindrome
	 */
	public boolean palidromeIter(String s) {		
		return false;
	}

}
