package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	
	
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

	private void delete(int i, Node root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right == null) {
			
			if(root.data == i) {
				root = null;
				return;
			}else return;
		}
		
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node temp = null;
		Node KeyNode = null;
		
		while(!q.isEmpty()) {
			temp =  q.peek();
			q.remove();
			
			if(temp.data == i) {
				KeyNode = temp;
			}
			
			if(temp.left !=null) {
				q.add(temp.left);
			}
			
			if(temp.right !=null) {
				q.add(temp.right);
			}
			
		}
		
		if(KeyNode != null) {
			int x = temp.data;
			deleteDepest(root,temp);
			KeyNode.data = x;
			
		}
		
	}

	
	
	private void deleteDepest(Node root, Node temp) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node deppest = null;
		while(!q.isEmpty()) {
			deppest =  q.peek();
			q.remove();
			
			if(deppest == temp) {
				deppest = null;
				return;
			}
			
			if(deppest.left !=null) {
				
				if(deppest.left == temp) {
					deppest.left = null;  
					return;
				}else q.add(deppest.left);
				
			}
			
			if(deppest.right !=null) {
				
				if(deppest.right == temp) {
					deppest.right = null;  
					return;
				}else q.add(deppest.right);;
				
			}
			
		}
		
	}
	
	
	public void DisplayInorder(Node root) {
		
		if(root == null) return;
		
		DisplayInorder(root.left);
		System.out.print(" "+root.data);
		DisplayInorder(root.right);
	}
	
	public void BFS(Node root) {
		
		if(root == null) {
			System.out.println("Tree is null!!!!!"); 
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			System.out.println(temp.data);
			
			if(temp.left!=null) q.add(temp.left);
			
			if(temp.right!=null) q.add(temp.right);
			
		}
		
		
	}
	
	public Node DeleteBST(int key, Node root) {
		
		//base case
		if(root == null) return null;
		
		if(root.data > key) {
			
			Node left = DeleteBST(key, root.left);
			return root;
		}else if(root.data < key) {
			Node right = DeleteBST(key, root.right);
			return root;
		}
		
		if(root.left == null) return root.right;
		else if(root.right == null) return root.left;
		else {
			 Node ParentSucc = root;
			 System.out.println(" root is"+root.data);
			 Node succ = root.right;
			 
			 while(succ.left!=null) {
				 ParentSucc = succ;
				 succ = succ.left;
			 }
			 
			 System.out.println(" ParentSuccessor - "+ParentSucc.data+" And root is - "+root.data);
			 if(ParentSucc != root) {
				 ParentSucc.left = succ.right;
			 }else ParentSucc.right = succ.left;
			 
			 root.data = succ.data;
			 return root;
		}
	}

	public static void main(String args[]) {
		
		
		BST tree = new BST();
		System.out.println("========Building tree with value 10==========");
		Node root = new Node(10);
		tree.Insert(13, root);
		tree.Insert(5, root);
		tree.Insert(8, root);
		tree.Insert(2, root);
		tree.Insert(20, root);
		
		//deletition
		Node temp = root;
		tree.DisplayInorder(root);
		
		//tree.delete(5,root);
		
		tree.DeleteBST(5, root);
		System.out.println("After deletion tree is - ");
		tree.DisplayInorder(root);
		
		System.out.println("Breadth First Search Is - ");
		tree.BFS(root);
	}
	
}
