import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class DeleteAtIndexTest extends SetupTests {

	@Test
	public void test() {
		
		//Negative index test for empty linked list
		empty.deleteAtIndex(-1);
		ArrayList<Integer> answer1 = new ArrayList<Integer>();
		assertEquals(empty.getLinkedList(), answer1);
		
		//Zero index test for empty linked list
		empty.deleteAtIndex(0);
		ArrayList<Integer> answer2 = new ArrayList<Integer>();
		assertEquals(empty.getLinkedList(), answer2);

		//Negative index test for single element linked list
		single.deleteAtIndex(-1);
		ArrayList<Integer> answer4 = new ArrayList<Integer>( Arrays.asList(8));
		assertEquals(single.getLinkedList(), answer4);
		
		//Index out of bounds test for single element linked list
		single.deleteAtIndex(40);
		ArrayList<Integer> answer5 = new ArrayList<Integer>( Arrays.asList(8));
		assertEquals(single.getLinkedList(), answer5);
		
		//Zero index test for single element linked list
		single.deleteAtIndex(0);
		ArrayList<Integer> answer6 = new ArrayList<Integer>();
		assertEquals(single.getLinkedList(), answer6);
		
		//Negative index test for multiple element linked list
		multi.deleteAtIndex(-1);
		ArrayList<Integer> answer7 = new ArrayList<Integer>( Arrays.asList(4,3,5,7,1,6));
		assertEquals(multi.getLinkedList(), answer7);
	
		//Correct index test for multiple element linked list
		multi.deleteAtIndex(2);
		ArrayList<Integer> answer8 = new ArrayList<Integer>( Arrays.asList(4,3,7,1,6));
		assertEquals(multi.getLinkedList(), answer8);
		
		//Index out of bounds test for multiple element linked list
		multi.deleteAtIndex(40);
		ArrayList<Integer> answer9 = new ArrayList<Integer>( Arrays.asList(4,3,7,1,6));
		assertEquals(multi.getLinkedList(), answer9);
	}

}
