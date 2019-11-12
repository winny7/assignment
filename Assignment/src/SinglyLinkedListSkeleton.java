import java.util.*;

public class SinglyLinkedListSkeleton {
	
	Node head;
	
	/** Complete the below method to insert a node at the beginning of a Linked List
	 */
	public void insertAtStart(int data) {

	}
	
	/** Complete the below method to insert a node at the end of a Linked List
	 */
	public void insertAtEnd(int data) {
	
	}
	
	/** Complete the below method to insert a node at the given index of a Linked List
	 */
	public void insertAtIndex(int index, int data) {

	}
	
	/** Complete the below method to delete a node at the given index of a Linked List
	 */
	public void deleteAtIndex(int index) {

	}
	
	/** Complete the below method to check if a Linked List is empty
	 */
	public boolean isEmpty() {

	}
	
	/** Complete the below method to return the length of a Linked List
	 */
	public int lengthOfLinkedList() {

	}
	
	/** Do not modify the below code to be used for testing
	 */
	public ArrayList<Integer> getLinkedList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Node node = head;
		
		if(head==null) {
			return al;
		}
		
		else {
			while(node.next!=null) {
				al.add(node.data);
				node = node.next;
			}
			al.add(node.data);
			return al;
		}
	}
}
