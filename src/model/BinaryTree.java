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
	
	
	//Constructor method: to create a binary tree.
	public BinaryTree(){
		
	}
	
	
	
	public void preOrder2(Node<T> originRoot) {
		 if(originRoot != null) {
			 System.out.println("xxx"+originRoot.getValue().toString());
			 
			 if(originRoot.getLeftSon() != null) {
				 System.out.println("xx"+originRoot.getLeftSon().getValue());
				 preOrder(originRoot.getLeftSon());
				 
			 }
			 
			 if(originRoot.getRightSon() != null) {
				 System.out.println("x"+originRoot.getRightSon().getValue());
				 preOrder(originRoot.getRightSon());
			 }
		 }
			
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
					rootOfTree.setLeftSon(aux);

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
					rootOfTree.setRightSon(aux);
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
	
	
	
	public boolean toFindAndElement(Node<T> originRoot,Node<T> nodeSearched) {
		
		
		
		Node<T> aux = rootOfTree;
		
		while(aux.getValue() != nodeSearched.getValue() ) {
			
			if(nodeSearched.getValue().compareTo(aux.getValue())> 0) {
				aux = aux.getRightSon();
			}
			else {
				aux = aux.getLeftSon();
			}
			
			if(aux == null) {
				return false;
			}
			
			
		}
		
		return true;
	}
	
	
	
	

	
	
	public void printForLevels(Node<T> root) {
		
		LinkedList<Node<T>> lKTreeLevels = new LinkedList<Node<T>>();
		lKTreeLevels.add(root);
		
		LinkedList<Node<T>> temp = new LinkedList<Node<T>>();
		
		int counter = 0;
		int height = heightOfTree(root)-1;
		
		
		
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
	
	 public void preOrder(Node<T> originRoot) {
		 if(originRoot != null) {
			 System.out.println(originRoot.getValue().toString());
			 
			 if(originRoot.getLeftSon() != null) {
				 preOrder(originRoot.getLeftSon());
			 }
			 
			 if(originRoot.getRightSon() != null) {
				 preOrder(originRoot.getRightSon());
			 }
		 }
			
	 }
	
	
	
}
