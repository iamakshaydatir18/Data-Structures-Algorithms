package queue;

public class DoublyLinkList {
	DoubleNode front, rear, mid;
	int size;

	public DoublyLinkList() {
		front = rear = new DoubleNode(-1);
		front.next = rear;
		rear.prev = front;
		mid = front;
		size = 0;
	}

	public void insertFront(int data) {
		DoubleNode NewNode = new DoubleNode(data);

		add(front, NewNode);
		size++;

		if (size == 1) {
			mid = front.next;
		} else if (size % 2 == 0) {
			mid = mid.prev;
		}

	}
	
	public void insertMiddle(int data) {
		DoubleNode NewNode = new DoubleNode(data);
		
		 if(size%2 ==0) {
			 add(mid,NewNode);
			 mid = mid.next;
		 }else if(size%2 == 1) {
			 add(mid.prev,NewNode);
			 mid = mid.prev;
		 }
		 size++;
	}

	private void add(DoubleNode front, DoubleNode newNode) {

		newNode.next = front.next;
		front.next.prev = newNode;
		front.next = newNode;
		newNode.prev = front;
	}

	public void insertRear(int data) {
		DoubleNode NewNode = new DoubleNode(data);
		add(rear.prev, NewNode);
		size++;

		if (size == 1) {
			mid = front.next;
		} else if (size % 2 == 1) {
			mid = mid.next;
		}

	}

	public int deleteFront() {
		if (size == 0) {
			System.out.println("DeQueue is Empty!!!!!!!");
			return 0;
		}

		if (size == 1) {
			mid = front;
		} else if (size % 2 == 0) {
			mid = mid.next;
		}
		
		int val = front.next.data;
		delete(front.next);
		size--;
		return val;

	}
	
	public int deleteMiddle() {
		
		DoubleNode Node = mid;
		
		if (size == 0) {
			System.out.println("DeQueue is Empty!!!!!!!");
			return 0;
		}
		
		mid = size%2 == 1?mid.prev:mid.next;
		
		int val = Node.data;
		delete(Node);
		size--;
		return val;	
		
	}

	private void delete(DoubleNode Node) {
		
		Node.prev.next = Node.next;
		Node.next.prev = Node.prev;
		
	}

	public int deleteRear() {
		if (size == 0) {
			System.out.println("DeQueue is Empty!!!!!!!");
			return 0;
		} 
		
		if(size == 1) {
			mid = front.next;
		}else if(size%2 == 1) {
			mid = mid.prev;
		}
		
		int val = rear.prev.data;
		delete(rear.prev);
		size--;
		return val;
		

	}

	public void Display() {

		if (size == 0) {
			System.out.println("DeQueue is Empty!!!!!!!!");
		} else {
			DoubleNode temp = front.next;
			while (temp.data != -1) {
				System.out.println(" " + temp.data);
				temp = temp.next;
			}
		}

	}

}
