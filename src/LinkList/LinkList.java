package LinkList;

public class LinkList {
	
	Node head;
	
	
	void push(int x) {
		Node NewNode =  new Node(x);
		if(head == null) {
			head = NewNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = NewNode;
		}
	}
	
	void delete(int x) {
		if(head == null) {
			System.out.println("No element to delete");
		}else if(head.data == x){
			head = head.next;
		}else {
			Node temp = head;
			Node prev= temp;
			
			while(temp.data == x) {
				prev = temp;
				temp = temp.next;
			}
			
			prev.next = temp.next;
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
