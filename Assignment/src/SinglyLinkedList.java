import java.util.*;

public class SinglyLinkedList {
	
	Node head;
	
	/** Method to insert a node at the beginning of a Linked List
	 */
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	/** Method to insert a node at the end of a Linked List
	 */
	public void insertAtEnd(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next =  node;
		}	
	}
	
	/** Method to insert a node at the given index of a Linked List
	 */
	public void insertAtIndex(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}
		
		else if (index<=0 || index>lengthOfLinkedList()) {
			System.out.println("Index out of bounds");
		}
		
		else {
		Node n = head;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
		node.next = n.next;
		n.next = node;
		}
	}
	
	/** Method to delete a node at the given index of a Linked List
	 */
	public void deleteAtIndex(int index) {
				
		if (index<0 || index>=lengthOfLinkedList()) {
			System.out.println("Index out of bounds");
		}
		
		else if(index==0) {
				head = head.next;
			}
		
		else {
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	
	/** Method to check if a Linked List is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}
	
	/** Method to return the length of a Linked List
	 */
	public int lengthOfLinkedList() {
		
		int count = 0;
		Node node = head;
		
		if(isEmpty()) {
			return 0;
		}
		
		else{
			while(node.next!=null) {
				count++;
				node = node.next;
			}
			return count+1;
		}
	}
	
	/** Method to return the data contained in linked list as an array. To be used for testing.
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