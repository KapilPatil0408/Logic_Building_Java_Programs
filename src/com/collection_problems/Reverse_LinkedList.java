package com.collection_problems;


public class Reverse_LinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

		public int getData() {
			return data;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(20);
		traveseLinkedList(head);
		traveseLinkedList(reverseLinkedList(head));

	}

	public static void traveseLinkedList(Node head) {
		System.out.println("");
		Node current = head;
		while(current !=null) {
			System.out.print(current.getData()+ " ");
			current = current.next;
		}
	}

	public static Node reverseLinkedList(Node head) {
		Node current = head;
		Node next = null;
		Node prev = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

}
