package com.greatlearning.assignment3.question2.model;

/*
 * @author Rohit Shrivastva
 * @description This class creates a tree node
 * 
 */
public class Node {

	private int data;
	private Node left;
	private Node right;

	public Node(int value) {
		data = value;
		left = right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
