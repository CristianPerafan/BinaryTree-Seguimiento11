package model;

/**
 * 
 * @author Cristian Perafan
 *
 * @param <T>, it represents the type of date
 */

public class Node<T extends Comparable<T>>{
	
	//Attributes

	private T value;
	private Node<T> father;
	private Node<T> leftSon;
	private Node<T> rightSon;
	
	//Constructor method: to create a node with only its initial value.
	public Node(T value) {
		this.value = value;
	}
	
	
	//
	// ==== GETTERS AND SETTERS ====
	//
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getFather() {
		return father;
	}

	public void setFather(Node<T> father) {
		this.father = father;
	}

	public Node<T> getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(Node<T> leftSon) {
		this.leftSon = leftSon;
	}

	public Node<T> getRightSon() {
		return rightSon;
	}

	public void setRightSon(Node<T> rightSon) {
		this.rightSon = rightSon;
	}
	
	
	
	
}

