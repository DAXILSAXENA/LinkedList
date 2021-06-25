package com.bridgelabz.linkedlist;

public class LinkedList {
	private int size;
	private Node start;

	public LinkedList() {
		size = 0;
		start = null;
	}

	public void addAtFirst(int val) {
		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		start = n;
		size++;
	}

	public void appendinAtLast(int val) {
		Node n, t;
		n = new Node();
		n.setData(val);
		t = start;
		if (t == null)
			start = n;
		else {
			while (t.getNext() != null)
				t = t.getNext();
			t.setNext(n);
		}
		size++;
	}

	public boolean isEmpty() {
		if (start == null)
			return (true);
		else
			return (false);
	}

	public void viewList() {
		Node t;
		if (isEmpty())
			System.out.println("List is empty");
		else {
			t = start;
			for (int i = 1; i <= size; i++) {
				System.out.println(" " + t.getData());
				t = t.getNext();
			}
		}
	}
}
