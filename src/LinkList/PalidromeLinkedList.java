package LinkList;

import java.util.Stack;

public class PalidromeLinkedList {
	
	Node head;

	public void reorderList() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node temp = slow.next;
		slow.next = null;
		
		Node prev = null;
		Node curr;
		while(temp!= null) {
			curr = temp;
			temp = temp.next;
			curr.next = prev;
			prev = curr;
			
		}
		
		System.out.println(" Prev ---");
		Node print = prev;
		while(print!=null) {
			System.out.println(" "+print.data);
			print = print.next;
		}
		
		fast = head;
		while(prev != null) {
			temp = fast.next;
			fast.next = prev;
			prev = prev.next;
			fast.next.next =  temp;
			fast = temp;
			
		}
		
		
		
		

		/*
		 * fast = head; //Node curr = slow; while (fast.next != null) { Node newNode =
		 * new Node(s.pop()); temp = fast.next; fast.next = newNode; newNode.next =
		 * temp; fast = temp;
		 * 
		 * }
		 */

	}

	@Override
	public String toString() {
		return "PalidromeLinkedList [head=" + head + "]";
	}

	void push(int x) {
		Node NewNode = new Node(x);
		if (head == null) {
			head = NewNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = NewNode;
		}
	}
	
	void print() {
		if(head == null) {
			System.out.println("list is null");
		}else {
			System.out.println("List elemtnst are - ");
			Node temp = head;
			while(temp!=null) {
				System.out.println(" "+temp.data);
				temp = temp.next;
			}
		}
	}

	

}
