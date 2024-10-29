package org.example;

public class LinkedList {

	private class Node {
		private int value;
		private Node next;
		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;
	private int size = 0;  


	public void addLast(int item) {
		Node node = new Node(item);
		if (first == null) {
			first = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
		size++;
	}


	public void addFirst(int item) {
		Node node = new Node(item);
		if (first == null) {
			first = node;
			last = node;
		} else {
			node.next = first;
			first = node;
		}
		size++;
	}


	public void addAtAGivenPosition(int item, int pos) {
		if (pos < 0 || pos > size) {
			throw new IllegalArgumentException("Position out of bounds");
		}

		Node node = new Node(item);

		if (pos == 0) {
			addFirst(item);
		} else if (pos == size) {
			addLast(item);
		} else {
			Node previous = first;
			for (int i = 0; i < pos - 1; i++) {
				previous = previous.next;
			}
			node.next = previous.next;
			previous.next = node;
			size++;
		}
	}


	public boolean search(int item) {
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return true;
			current = current.next;
		}
		return false;
	}


	public void delete(int item) {
		if (first == null) {
			throw new IllegalStateException("List is empty");
		}

		if (first.value == item) {
			if (first == last) {
				first = last = null;
			} else {
				first = first.next;
			}
			size--;
			return;
		}

		Node previous = first;
		while (previous.next != null && previous.next.value != item) {
			previous = previous.next;
		}

		if (previous.next != null) {

			if (previous.next == last) {
				last = previous;
				last.next = null;
			} else {
				previous.next = previous.next.next;
			}
			size--;
		}
	}


	public void printList() {
		Node current = first;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
