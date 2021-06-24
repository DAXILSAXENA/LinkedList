package com.bridgelabz.linkedlist;

public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList program:");
		Node myFirstNode = new Node(56);
		Node mySecondNode = new Node(30);
		Node myThirdNode = new Node(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		System.out.println(myFirstNode.getData() + "->" + mySecondNode.getData() + "->" + myThirdNode.getData());
	}
}
