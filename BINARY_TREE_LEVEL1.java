import java.util.*;
public class Binary_Tree_Demo1 {
	//Node class
	static class Node{
		int data;
		Node left;
		Node right;
		 Node(int data){
			 this.data=data;
			 this.left=null;
			 this.right=null;
		 }
	}
	//Binary tree formation using the user array input
	static class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			 Node newNode=new Node(nodes[idx]);
			 newNode.left=buildTree(nodes);
			 newNode.right=buildTree(nodes);
			 
			return newNode;
			 
			
		}
	}
//===============================PREORDER TRAVESAL CODE=====================================================
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
//==========================POSTORDER TRAVERSAL CODE========================================================
	public static void postorder(Node root){
		if(root==null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
//==========================================================================================================	
	public static void main(String[] args) {
		// LEARNING BINARY TREE
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //WE CAN MAKE DYNAMIC INPUT WITH ARRAYS USING SCANNER CLASS
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);   // GETTING ROOT DATA BY BUILDING TREE
		//System.out.println(root.data);   // CODE TO TEST ROOT DATA
		preorder(root);                    //CALLING PREORDER TRAVESAL CODE

	}

}
