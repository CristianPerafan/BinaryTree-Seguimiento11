package ui;

import model.IntegerController;

public class Main {
	
	private static IntegerController binaryTree;
	
	public Main() {
		binaryTree = new IntegerController();
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Main main = new Main();
		
		binaryTree.addAnElement(10);
		binaryTree.addAnElement(16);
		binaryTree.addAnElement(17);
		binaryTree.addAnElement(18);
		binaryTree.addAnElement(15);
		binaryTree.addAnElement(5);
		

		binaryTree.toShowBinaryTree();
		
		
	}

}
