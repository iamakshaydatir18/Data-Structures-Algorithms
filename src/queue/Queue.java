package queue;

public class Queue {
		int front, rear,capacity;
		int[] queue;
		
		Queue(int capacity){
			front = 0;
			rear = 0;
			this.capacity = capacity;
			queue = new int[this.capacity];
			System.out.println("Queue length is - "+queue.length);
			
		}
		
		public void enqueue(int data) {
			if(isFull()) {
				System.out.println("Queue is full !!!!!!!!! cant insert element "+ data);
			}else {
				queue[rear] = data;
				rear++;
			}
		}
		
		public int dequeue() {
			if(isEmpty()) {
				System.out.println("Queue is empty !! cant delete element");
				return 0;
			}else {
				int x = queue[front];
				for(int i=0;i<rear;i++) {
					queue[i] = queue[i+1];
				}
				queue[rear] = 0;
				rear--;
				System.out.println("Deleted element is "+x);
				return x;
			}
			
		}
		
		public int front() {
			System.out.println("Front is - "+queue[front]);
			return queue[front];
		}
		
		public int rear() {
			System.out.println("rear is - "+ queue[rear-1]);
			return queue[rear];
		}
		
		public boolean isFull() {
			if(rear == capacity-1) {
				return true;
			}else {
				return false;
			}
		}
		
		public boolean isEmpty() {
			if(front == rear) {
				return true;
			}else {
				return false;
			}
		}
		
		
		public void Dislay() {
			System.out.println("Queue is - ");
			for(int a:queue) {
				System.out.println(" "+a);
			}
		}
		
		
		
}
