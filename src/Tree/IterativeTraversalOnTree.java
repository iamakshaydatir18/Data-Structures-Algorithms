package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeTraversalOnTree {
	

	private void Insert(int i, Node root) {
		/*
		 * if(root == null) { System.out.println("Root "+i+" inserted"); root = new
		 * Node(i); return; }
		 */
		if( i < root.data) {
			
			if(root.left == null) {
				root.left = new Node(i);
				System.out.println("  Inserted " + i + " to left of Node " + root.data); 
				return;
			}else {
				 Insert(i,root.left);
			}
		}
		
		if(i > root.data) {
			
			if(root.right == null) {
				root.right = new Node(i);
				System.out.println("  Inserted " + i + " to right of Node " + root.data); 
				return;
			}else {
				 Insert(i,root.right);
			}
		}
			
	}
	
	public List<Integer> PreOrerTraversal(Node root) {
		
		List<Integer> list = new ArrayList<>();
		
		if(root == null) return list;
		
		Stack<Node> s = new Stack<>();
		s.push(root);
		
		while(!s.isEmpty()) {
			
			Node temp = s.pop();
			list.add(temp.data);
			
			if(temp.right != null) {
				s.push(temp.right);
			}
			
			if(temp.left != null) {
				s.push(temp.left);
			}
		}
		
		return list;
	}
	
	private List<Integer> InOrerTraversal(Node root) {
		
		List<Integer> list = new ArrayList<>();
		Stack<Node> s = new Stack<>();
		Node node = root;
		while(true) {
			
			if(node != null) {
				s.push(node);
				node = node.left; 
			}else {
				
				if(s.isEmpty()) break;
				
				node = s.pop();
				list.add(node.data);
				node = node.right;
			}
		}
		
		return list;
	}
	
	private List<Integer> PostOrerTraversal(Node root) {

		List<Integer> list = new ArrayList<>();
		
		if(root == null) return list;
		// TODO Auto-generated method stub
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		
		while(!s1.isEmpty()) {
			Node temp = s1.pop();
			s2.push(temp);
			
			if(temp.left!= null) s1.push(temp.left);
			
			if(temp.right != null) s1.push(temp.right);
		}
		
		
		
		while(!s2.isEmpty()) {
			list.add(s2.pop().data);
		}
		return list;
	}

	private List<Integer> PostOrerTraversalUsing1Stack(Node root) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		Stack<Node> s= new Stack<Node>();
		Node curr = root;
		
		while( curr != null || !s.isEmpty()) {
			
			if(curr != null) {
				s.push(curr);
				curr = curr.left;
			}else {
				Node temp = s.peek().right;
			
				 if(temp == null) {
					 
					 temp = s.pop();
					 list.add(temp.data);
					 
					 while(!s.isEmpty() && temp == s.peek().right) {
						 temp = s.pop();
						 list.add(temp.data);
					 }
					 
				 }else curr = temp;
				
			}
		}
		
		
		return list;
	}
	
	private List<List<Integer>> PreInPostOrder(Node root) {
		
		class pair{
			Node root;
			int val;
			public pair(Node root, int val) {
				super();
				this.root = root;
				this.val = val;
			}
			
		}
		
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> preorder = new ArrayList<>();
		List<Integer> inorder = new ArrayList<>();
		List<Integer> postorder = new ArrayList<>();
		
		Stack<pair> st= new Stack<>();
		st.push(new pair(root,1));
		
		while(!st.isEmpty()) {
		
			  pair temp = st.pop();
			  
			  if(temp.val == 1) {
				  preorder.add(temp.root.data);
				  temp.val++;
				  st.push(temp);
				  
				  if(temp.root.left != null) {
					  st.push(new pair(temp.root.left,1));
				  }
			  }else if(temp.val ==2) {
				  inorder.add(temp.root.data);
				  temp.val++;
				  st.push(temp);
				  
				  if(temp.root.right != null) {
					  st.push(new pair(temp.root.right,1));
				  }
			  }else {
				  postorder.add(temp.root.data);
			  }
			  
		}
		
		list.add(new ArrayList<>(preorder));
		list.add(new ArrayList<>(inorder));
		list.add(new ArrayList<>(postorder));
		
		return list;
	}

	public static void main(String[] args) {
		
		IterativeTraversalOnTree tree = new IterativeTraversalOnTree();
		System.out.println("========Building tree with value 10==========");
		Node root = new Node(10);
		tree.Insert(13, root);
		tree.Insert(5, root);
		tree.Insert(8, root);
		tree.Insert(2, root);
		tree.Insert(20, root);
		tree.Insert(25, root);
		tree.Insert(1, root);
		tree.Insert(3, root);
		tree.Insert(11, root);

		List<Integer> list = tree.PreOrerTraversal(root);
		System.out.println("Preoder using Irative is - ");
		for(Integer a:list) {
			System.out.print(" "+a);
		}
		
		System.out.println();
		List<Integer> list2 = tree.InOrerTraversal(root);
		System.out.println("In Order using Irative is - ");
		for(Integer a:list2) {
			System.out.print(" "+a);
		}
		
		//PostOrderIterative Code Using 2 stacks.
		System.out.println();
		List<Integer> list3 = tree.PostOrerTraversal(root);
		System.out.println("Post Order using 2 stack Irative is - ");
		for(Integer a:list3) {
			System.out.print(" "+a);
		}
		
		System.out.println();
		List<Integer> list4 = tree.PostOrerTraversalUsing1Stack(root);
		System.out.println("Post Order using 1 stackIrative is - ");
		for(Integer a:list4) {
			System.out.print(" "+a);
		}
		
		
		System.out.println();
		List<List<Integer>> list5 = tree.PreInPostOrder(root);
		System.out.println("PreInPostOrder is - ");
		for(List a:list5) { 
			System.out.println(" "+a);
		}
//		Dequ
//		String ka ="1->2->";
//		ka = ka.substring(0, ka.length() -3);
//		System.out.println(ka);
	}
	
}























