package stack;

public class LinkListStack {

	Node root;

	boolean isEmpty() {
		return (root == null);
	}

	void push(int x) {
		Node NewNode = new Node(x);
		if (root == null) {
			root = NewNode;

		} else {
			Node temp = root;
			root = NewNode;
			root.next = temp;
		}
		System.out.println("pushed to stack -" + x);
	}

	int pop() {

		if(root == null) {
			System.out.println("stack is empty!!");
			return 0;
		} else {
			int popped = root.data;
			root = root.next;
			System.out.println("elemet removed." + popped);
			return popped;

		}
	}

	int peek() {

		if (root == null) {

			System.out.println("stack is empty!!");
			return 0;
		}
		else
		{
			return root.data;
		}
	}

	void print() {
		Node itr = root;
		System.out.println("Printing stack elements - ");
		while(itr != null) {
			System.out.println(" "+ itr.data);
			itr = itr.next;
		}
	}

}
