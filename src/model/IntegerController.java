package model;

public class IntegerController {
	
	//Attributes
	private BinaryTree<Integer> bTree;
	private Node<Integer> root;
	
	public IntegerController() {
		bTree = new BinaryTree<Integer>();
	}
	
	public void addAnElement(Integer value) {
		
		if(bTree.isEmptyTheTree()) {
			root = new Node<Integer>(value);
			bTree.addAnElement(null,value);
		}
		else {
			bTree.addAnElement(root,value);
		}
		
	}
	
	public void toRemoveAndElement(Integer value) {
		
		Node<Integer> node = new Node<Integer>(value);
		
		
		
		if(bTree.toDeleteAnElement(root, node)) {
			System.out.println("The node "+value+ " has been deleted");
			System.out.println("");
		}
		else {
			System.out.println("The node "+value+" could not be deleted");
			System.out.println("");
		}
		
		
	}
	public void toShowBinaryTree() {
		
		if(bTree.isEmptyTheTree()) {
			System.out.println("");
			System.out.println("The binary tree has no elements.!!!");
		}
		else {
			System.out.println("*** TOUR IN PRE ORDER ***");
			if(bTree.isEmptyTheTree()) {}
			bTree.preOrder(root);
			System.out.println(" ");
			System.out.println("*** TOUR FOR LEVELS ****");
			bTree.printForLevels(root);
		}
		
	}
}
