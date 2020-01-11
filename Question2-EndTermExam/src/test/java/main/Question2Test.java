package main;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
public class Question2Test {
	Question2 qns2=new Question2();
	List<Integer> number=Arrays.asList(7, 9, 6, 9, 125, 291, 564);
//	@SuppressWarnings("unchecked")
	//Set<Integer> finalNumbers = (Set<Integer>) Arrays.asList(6, 7, 9, 125, 291, 564);
	@SuppressWarnings("static-access")
	@Test
	public void listWithDuplicates() {
		assertEquals(number,qns2.listWithDuplicates(number));
	}
/*	@SuppressWarnings("static-access")
	@Test
	public void removeDuplicateList() {
		assertEquals(finalNumbers,qns2.removeDuplicateList(number));
	}
*/
	
}
