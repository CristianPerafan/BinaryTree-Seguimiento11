package model;

import java.util.LinkedList;

/**
 * 
 * @author Cristian Perafan
 *
 * @param <T> it represents the type of date.
 */

public class BinaryTree<T extends Comparable<T>>{
	
	//Attributes: 
	private Node<T> rootOfTree;
	
	private static final int COUNT = 10;
	
	//Constructor method: to create a binary tree.
	public BinaryTree(){
		
	}
	
	public void addAnElement(Node<T> originRoot,T element) {
		
		if(rootOfTree == null) {
			rootOfTree = new Node<T>(element);
		}
		else {
			
			//To compare if the element can be a left son
			if(originRoot.getValue().compareTo(element) > 0) {
				if(originRoot.getLeftSon() != null) {
					addAnElement(originRoot.getLeftSon(), element);
				}
				else {
					Node<T> aux = new Node<T>(element);
					aux.setFather(originRoot);
					originRoot.setLeftSon(aux);

					
				}
				
			}
			else {
				//If the element can not be a left son, it would be a right son.
				if(originRoot.getRightSon() != null) {
					addAnElement(originRoot.getRightSon(), element);
				}
				else {
					Node<T> aux = new Node<T>(element);
					aux.setFather(originRoot);
					originRoot.setRightSon(aux);
					
				}
			}
				
		}
		
	}
	
	public boolean isEmptyTheTree() {
		if(rootOfTree == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public String toString(Node<T> originNode) {
		String out = "";
		
		 System.out.println("- "+originNode.getValue().toString());
		 
		 if(originNode.getLeftSon() != null) {
			 toString(originNode.getLeftSon());
		 }
		 
		 if(originNode.getRightSon() != null){
			 toString(originNode.getRightSon());
		 }
		
		return out;
	}
	

	
	
	public void print2DUtil(Node<T> root,int numNodes) {
		
		LinkedList<Node<T>> lKTreeLevels = new LinkedList<Node<T>>();
		lKTreeLevels.add(root);
		
		LinkedList<Node<T>> temp = new LinkedList<Node<T>>();
		
		int counter = 0;
		int height = heightOfTree(root)-1;
		
		//double numberOfElements = numNodes;
		double numberOfElements =  (Math.pow(2 , (height + 1)) - 1);
		
		while(counter <= height) {
			
			
			
			Node<T> removed = lKTreeLevels.removeFirst();
			if(temp.isEmpty()) {
				if(removed != null) {
					System.out.println("Level: "+counter);
				}
				
				printSpace(removed);
			}
			else {
				if(removed != null) {
					System.out.println("Level: "+counter);
				}
				
				printSpace(removed);
			}
			if (removed == null) {
                temp.add(null);
                temp.add(null);
            } else {
                temp.add(removed.getLeftSon());
                temp.add(removed.getRightSon());
            }
			
			 if ( lKTreeLevels.isEmpty()) {
				    System.out.println("");
				    // System.out.println("");
	                lKTreeLevels = temp;
	                temp = new LinkedList<>();
	                counter++;
	            }
		}
		
		
	
	}
	
	public int heightOfTree(Node<T> root){
	    if(root==null){
	        return 0;
	    }
	     return 1+ Math.max(heightOfTree(root.getLeftSon()),heightOfTree(root.getRightSon()));
	}
	
	public void printSpace(Node<T> removed){
		if(removed != null) {
			System.out.println(removed.getValue());
		}
	      
	    
	}
	
}
