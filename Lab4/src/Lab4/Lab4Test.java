package Lab4; 

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Lab4Test {
	
	ListOperations listOp;
	
	@BeforeEach
	public void SetUp() {
		listOp = new ListOperations();
	}
	
	@Test
	public void testPairsSwap1() {
		String[] target = {"a", "b", "c", "d"};
		String[] expected = {"d", "c", "b", "a"};
		
		ArrayList<String> t = fromArrayToList(target);
		ArrayList<String> e = fromArrayToList(expected);
		
		assertEquals(e, listOp.pairsSwap(t));
	}
	
	@Test
	public void testPairsSwap2() {
		String[] target = {"four", "score", "and", "seven", "years", "ago"};
		String[] expected = {"ago", "years", "seven", "and", "score", "four"};
		
		ArrayList<String> t = fromArrayToList(target);
		ArrayList<String> e = fromArrayToList(expected);
		
		assertEquals(e, listOp.pairsSwap(t));
	}
	
	@Test
	public void testPairsSwap3() {
		String[] target = {"to", "be", "or", "not", "to", "be", "hamlet"};
		String[] expected = {"hamlet", "be", "to", "not", "or", "be", "to"};
		
		ArrayList<String> t = fromArrayToList(target);
		ArrayList<String> e = fromArrayToList(expected);
		
		assertEquals(e, listOp.pairsSwap(t));
	}
	
	@Test
	public void testPairsSwap4() {
		String[] target = {"java", "is", "an", "object", "oriented", "language"};
		String[] expected = {"language", "oriented", "object", "an", "is", "java"};
		
		ArrayList<String> t = fromArrayToList(target);
		ArrayList<String> e = fromArrayToList(expected);
		
		assertEquals(e, listOp.pairsSwap(t));
	}
	
	@Test
	public void testPairsSwap5() {
		String[] target = {"a"};
		String[] expected = {"a"};
		
		ArrayList<String> t = fromArrayToList(target);
		ArrayList<String> e = fromArrayToList(expected);
		
		assertEquals(e, listOp.pairsSwap(t));
	}
	
	
	@Test
	public void testStartWithMin1() {
		int[] target = {3, 8, 92, 4, 2, 17, 9};
		int[] expected = {2, 3, 8, 92, 4, 17, 9};
		
		ArrayList<Integer> t = fromArrayToListInt(target);
		ArrayList<Integer> e = fromArrayToListInt(expected);
		
		assertEquals(e, listOp.startWithMin(t));
	}
	
	@Test
	public void testStartWithMin2() {
		int[] target = {0, 2, 5, 6, 1};
		int[] expected = {0, 2, 5, 6, 1};
		
		ArrayList<Integer> t = fromArrayToListInt(target);
		ArrayList<Integer> e = fromArrayToListInt(expected);
		
		assertEquals(e, listOp.startWithMin(t));
	}
	
	@Test
	public void testStartWithMin3() {
		int[] target = {3, 8, 9, 7, 2, 10, 2};
		int[] expected = {2, 3, 8, 9, 7, 2, 10};
		
		ArrayList<Integer> t = fromArrayToListInt(target);
		ArrayList<Integer> e = fromArrayToListInt(expected);
		
		assertEquals(e, listOp.startWithMin(t));
	}
	
	@Test
	public void testStartWithMin4() {
		int[] target = {3, 3, 3, 3, 3};
		int[] expected = {3, 3, 3, 3, 3};
		
		ArrayList<Integer> t = fromArrayToListInt(target);
		ArrayList<Integer> e = fromArrayToListInt(expected);
		
		assertEquals(e, listOp.startWithMin(t));
	}
	
	@Test
	public void testStartWithMin5() {
		int[] target = {6};
		int[] expected = {6};
		
		ArrayList<Integer> t = fromArrayToListInt(target);
		ArrayList<Integer> e = fromArrayToListInt(expected);
		
		assertEquals(e, listOp.startWithMin(t));
	}

	
	private ArrayList<String> fromArrayToList(String[] arr) {
		
		ArrayList<String> arrlist = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			arrlist.add(arr[i]);
		}
		
		return arrlist;
	}
	
	private ArrayList<Integer> fromArrayToListInt(int[] arr) {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arrlist.add(arr[i]);
		}
		
		return arrlist;
	}
}
