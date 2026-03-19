package queue;

public class DoubleNode {
		int data;
		DoubleNode next;
		DoubleNode prev;
		
		DoubleNode(){
			
		}
		
		DoubleNode(int x){
			this.data =x;
			prev =next= null;
		}

		@Override
		public String toString() {
			return "DoubleNode [data=" + data + ", next=" + next + ", prev=" + prev + "]";
		}
		
		
		
}
