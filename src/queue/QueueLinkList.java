package queue;

public class QueueLinkList {
	
	Node front,rear;

	public QueueLinkList() {
		this.front=this.rear = null;
	}
	
	public void enqueue(int x) {
		
		Node newNode = new Node(x);
		
		if(rear ==null) {
			rear =front=newNode;
			System.out.println(" Node Added- "+rear.toString());
		}else {
			rear.Next = newNode;
			rear =rear.Next;
			System.out.println(" Node Added- "+rear.toString());
		}
		
	}
	
	
	public int dequeue() {
			
		if(isEmpty()) {
			System.out.println("queue is Empty!!!!!");
			return 0;
		}else {
			Node Temp = front;
			front = front.Next;
			
			if(front == null) {
				rear=null;
			}
			System.out.println("Removed element "+Temp.x);
			return Temp.x;
		}
	}
	
	public boolean isEmpty() {
		if(front == null) return true;
		else return false;
	}
	
	public void Print() {
		Node temp = front;
		System.out.println("Queue is - ");
		while(temp!=null) {
			System.out.println(" "+temp);
			temp = temp.Next;
		}
	}
	
	
}
