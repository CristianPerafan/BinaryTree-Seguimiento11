package model;

public class IntegerController {
	
	//Attributes
	private BinaryTree<Integer> bTree;
	private Node<Integer> root;
	private int numNodes;
	
	public IntegerController() {
		bTree = new BinaryTree<Integer>();
		numNodes = 0;
	}
	
	public void addAnElement(Integer value) {
		
		if(bTree.isEmptyTheTree()) {
			root = new Node<Integer>(value);
			bTree.addAnElement(null,value);
			numNodes++;
		}
		else {
			bTree.addAnElement(root,value);
			numNodes++;
		}
		
	}
	
	public void toShowBinaryTree() {
		bTree.print2DUtil(root,numNodes);
		//out = bTree.toString();
	}
}
