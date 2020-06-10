package Trees;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinaryTree {
	Node root; //value will be updated here itself.
	BinaryTree()
	{
		root=null;
	}
	BinaryTree(int data)
	{
		this.root=new Node(data);
	}
	int TreeSum(Node root)
	{
		if(root==null) return 0;
		return root.data+TreeSum(root.left)+TreeSum(root.right);
	}
	int countNodes(Node root)
	{
		if(root==null) return 0;
		return 1+countNodes(root.left)+countNodes(root.right);
	}
	int leafNodes(Node root)
	{
		if(root==null) return 0;
		if(root.left==null && root.right==null) return 1;
		return leafNodes(root.left)+leafNodes(root.right);
	}
	int height(Node root)
	{
		if(root==null) return -1;
		return 1+Math.max(height(root.left), height(root.right));
	}
	void printAtLevel(Node root, int level)
	{
		if(root == null) return;
		if(level == 0) 
		{
			System.out.print(root.data+" ");
			return; // if printed then return
		}
		printAtLevel(root.left,level-1); //Same value of level passed
		printAtLevel(root.right,level-1); //Same value of level passed
	}
	void preorder(Node root)
	{
		if(root == null) return;
		System.out.print(root.data+" ");
		preorder(root.left); //go to LST
		preorder(root.right); //go to RST
	}
	void inorder(Node root) //LVR
	{
		if(root == null) return;
		inorder(root.left); //go to LST
		System.out.print(root.data+" ");
		inorder(root.right); //go to RST
	}
	void postorder(Node root) //LVR
	{
		if(root == null) return;
		postorder(root.left); //go to LST
		postorder(root.right); //go to RST
		System.out.print(root.data+" ");
	}
	boolean isIdentical(Node root1, Node root2)
	{
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		return root1.data==root2.data 
				&& isIdentical(root1.left,root2.left)
				&& isIdentical(root1.right,root2.right);
	}
	boolean isMirror(Node root1, Node root2)
	{
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		return root1.data==root2.data 
				&& isMirror(root1.left,root2.right)
				&& isMirror(root1.right,root2.left);
	}
	void toMirror(Node root)
	{
		if(root == null) return;
		Node temp = root.left; //swapping
		root.left = root.right;
		root.right = temp;
		toMirror(root.left);
		toMirror(root.right);
	}
	boolean isSymmetric(Node root1, Node root2)
	{
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		return isSymmetric(root1.left,root2.left)
				&& isSymmetric(root1.right,root2.right);
	}
	boolean isIsomorphic(Node root1, Node root2)
	{
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false;
		return root1.data==root2.data 
				&&((isIsomorphic(root1.left,root2.left)
						&&isIsomorphic(root1.right,root2.right))
				||
				(isIsomorphic(root1.left,root2.right)
						&&isIsomorphic(root1.right,root2.left)));
	}
	void bfsRec(Node root)
	{
		if(root==null) return;
		int h = height(root);
		for(int i=0;i<=h;i++)
		{
			printAtLevel(root, i);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree(2);//Binary Tree with root node 2
		bt.root.left = new Node(3);
		bt.root.right = new Node(5);
		bt.root.left.right = new Node(9);
		bt.root.right.left = new Node(7); // Required tree Created
//		bt.root.right.left.right = new Node(10);
		System.out.println("Sum of all Nodes: "+bt.TreeSum(bt.root));
		System.out.println("Total no. of Nodes: "+bt.countNodes(bt.root));
		System.out.println("Total no. of leaf Nodes: "+bt.leafNodes(bt.root));
		System.out.println("Height: "+bt.height(bt.root));
		bt.printAtLevel(bt.root, 0);
		System.out.println();
		bt.printAtLevel(bt.root, 1);
		System.out.println();
		bt.printAtLevel(bt.root, 2);
		System.out.println();
		bt.printAtLevel(bt.root, 3);
		System.out.println();
		System.out.print("PreOrder: ");
		bt.preorder(bt.root);
		System.out.println();
		System.out.print("InOrder: ");
		bt.inorder(bt.root);
		System.out.println();
		System.out.print("PostOrder: ");
		bt.postorder(bt.root);
		System.out.println();
		BinaryTree bt2 = new BinaryTree(2);//Binary Tree with root node 2
		bt2.root.left = new Node(3);
		bt2.root.right = new Node(5);
		bt2.root.left.right = new Node(9);
		bt2.root.right.left = new Node(7); // Required tree Created
		System.out.println(bt.isIdentical(bt.root,bt2.root));
		BinaryTree bt3 = new BinaryTree(2);//Binary Tree with root node 2
		bt3.root.left = new Node(5);
		bt3.root.right = new Node(3);
		bt3.root.left.right = new Node(7);
		bt3.root.right.left = new Node(9); // Required tree Created
		System.out.println(bt.isMirror(bt.root,bt3.root));
		System.out.println(bt.isMirror(bt.root,bt2.root));//identical
		bt.toMirror(bt.root);
		System.out.println(bt.isMirror(bt.root,bt2.root));// now they should become mirrors
		System.out.println(bt.isIdentical(bt.root,bt2.root));// not identical now
		System.out.println(bt.isSymmetric(bt.root,bt2.root));// but are symmetric
		BinaryTree bt4 = new BinaryTree(2);//Binary Tree with root node 2
		bt4.root.left = new Node(3);
		bt4.root.right = new Node(5);
		bt4.root.left.left = new Node(9);
		bt4.root.right.left = new Node(7); // Required tree Created
//		bt4.root.right.right=new Node(10);
		System.out.println(bt.isIsomorphic(bt.root,bt4.root));
		bt2.bfsRec(bt2.root);
	}
}
