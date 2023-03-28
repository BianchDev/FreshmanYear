package Lab4; 
import java.util.ArrayList;

public class ListOperations {
	
	
	
	/**
	 * Method pairsSwap switches elements in an ArrayList of Strings in a pairwise fashion. 
	 * It switches the order of the first value and the last value, then switch the second and the second 
	 * from the last, and so on.
	 * 
	 * @param list
	 * @return the list with element swapped
	 */
	public ArrayList<String> pairsSwap(ArrayList<String> list) 
	{
		
		int size = list.size();
	    for (int i = 0; i < size / 2; i++) 
	    	{
	        String temp = list.get(i);
	        list.set(i, list.get(size - i - 1));
	        list.set(size - i - 1, temp);
	    	}
		return list;
		
	}
	
	
	/**
	 * Method startWithMin takes an ArrayList of integers as a parameter and moves the minimum value 
	 * in the list to the front, otherwise preserving the order of the elements. 
	 * @param list
	 * @return the list with minimum value move to first
	 */
	public ArrayList<Integer> startWithMin (ArrayList<Integer> list) 
	{
		int minVal = 0;
		int min = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i) <= list.get(minVal))
			{
				min = list.get(i); 
				minVal = i; 
			}
		}
		int minValue = list.get(minVal);
	    for (int i = minVal; i > 0; i--) {
	        list.set(i, list.get(i - 1));
	    }
	    list.set(0, minValue);
		return list; 
	}
	
	
	/**
	 * Optional Challenge Question
	 * unionList takes two ArrayList of integers as parameters and reports the result a union ArrayList, 
	 * the element orders should be reserved. The second ArrayList should attach to the first one but 
	 * with duplicates removed.
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ArrayList<Integer> unionList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		return null;
	}

}
