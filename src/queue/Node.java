package queue;

public class Node {
	int x;
	Node Next;
	
	Node(int x){
		this.x= x;
	}

	@Override
	public String toString() {
		return "Node [x=" + x + ", Next=" + Next + "]";
	}
	
	

}
