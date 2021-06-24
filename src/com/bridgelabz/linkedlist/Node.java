package com.bridgelabz.linkedlist;

public class Node {

	private int data;
	private Node next;

	public Node() {
		this.data = 0;
		this.next = null;
	}

	public Node(int d) {
		this.data = d;
		this.next = null;
	}

	public void setData(int d) {
		data = d;
	}

	public void setNext(Node n) {
		next = n;
	}

	public int getData() {
		return (data);
	}

	public Node getNext() {
		return (next);
	}
}
