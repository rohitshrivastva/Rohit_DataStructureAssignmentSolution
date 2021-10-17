package com.greatlearning.assignment3.question2.services;

import com.greatlearning.assignment3.question2.model.Node;

public class TransactionService {

	private Node prevNode = null;
	public Node headNode = null;

	/*
	 * @description This function covert the Binary Search Tree to Right Skewed tree
	 * in ascending order
	 * 
	 * @param Node root
	 */

	public void convertBSTToRightSkewed(Node root) {

		// Check for the empty root
		if (root == null) {
			return;
		}

		// recursion to the left
		convertBSTToRightSkewed(root.getLeft());

		Node rightNode = root.getRight();

		/*
		 * Condition to check if the root Node of the skewed tree is not defined
		 */
		if (headNode == null) {
			headNode = root;
			root.setLeft(null);
			prevNode = root;
		} else {
			prevNode.setRight(root);
			root.setLeft(null);
			prevNode = root;
		}

		// Similarly recursion to the right
		convertBSTToRightSkewed(rightNode);

	}

	/*
	 * @description This function traverse the right skewed tree using recursion
	 * 
	 * @param Node root
	 */
	public void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		traverseRightSkewed(root.getRight());
	}

}
