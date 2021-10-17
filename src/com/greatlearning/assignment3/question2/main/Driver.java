package com.greatlearning.assignment3.question2.main;

import com.greatlearning.assignment3.question2.model.Node;
import com.greatlearning.assignment3.question2.services.TransactionService;

/*
 * Main Driver class for BST to Right Skewed Tree
 * 
 */

public class Driver {

	Node node;

	public static void main(String[] args) {

		TransactionService service = new TransactionService();

		Driver tree = new Driver();
		tree.node = new Node(50);
		tree.node.setLeft(new Node(30));
		tree.node.setRight(new Node(60));
		tree.node.getLeft().setLeft(new Node(10));
		tree.node.getLeft().setRight(new Node(40));

		service.convertBSTToRightSkewed(tree.node);
		service.traverseRightSkewed(service.headNode);
	}

}
