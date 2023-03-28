package Lab5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Lab5Tester {
	
	MyLinkedList<String> list = new MyLinkedList<String>();
	
	@BeforeEach
	public void SetUp() {
		list = new MyLinkedList<String>();
	}
	
	
	@Test
	public void testAddToFront1() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		String strList = list.printList();
		
		assertEquals(strList, "A B C ");
	}
	
	
	@Test
	public void testRemoveFromFront1() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		list.removeFromFront();
		
		String strList = list.printList();
		assertEquals(strList, "B C ");
	}
	
	
	@Test
	public void testRemoveFromFront2() {
		list.addToFront("A");
		
		list.removeFromFront();
		
		String strList = list.printList();
		assertEquals(strList, "");
	}
	
	
	@Test
	public void testRemoveFromFront3() {
		
		list.removeFromFront();
		
		String strList = list.printList();
		assertEquals(strList, "");
	}
	
	
	@Test
	public void testRemoveFromFront4() {
		list.addToFront("C");
		list.addToFront("A");
		
		list.removeFromFront();
		
		String strList = list.printList();
		assertEquals(strList, "C ");
	}
	
	
	@Test
	public void testContains1() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		assertTrue(list.contains("A"));
	}
	
	
	@Test
	public void testContains2() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		assertFalse(list.contains("E"));
	}
	
	
	@Test
	public void testAddToEnd1() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		list.addToEnd("D");
		
		String strList = list.printList();
		assertEquals(strList, "A B C D ");
	}
	
	
	@Test
	public void testAddToEnd2() {		
		list.addToEnd("D");
		
		String strList = list.printList();
		assertEquals(strList, "D ");
	}
	
	
	@Test
	public void testSize1() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		assertEquals(list.size(), 3);
	}
	
	
	@Test
	public void testSize2() {
		assertEquals(list.size(), 0);
	}
	
	
	@Test
	public void testRemoveElement1() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		list.removeElement("A");
		
		String strList = list.printList();
		assertEquals(strList, "B C ");
	}
	
	@Test
	public void testRemoveElement2() {
		list.addToFront("C");
		list.addToFront("B");
		list.addToFront("A");
		
		list.removeElement("D");
		
		String strList = list.printList();
		assertEquals(strList, "A B C ");
	}
	
	
}
