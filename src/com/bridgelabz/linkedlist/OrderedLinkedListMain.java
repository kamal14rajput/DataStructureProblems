package com.bridgelabz.linkedlist;

public class OrderedLinkedListMain {

	public static void main(String[] args) {
		LinkedListOrdered<Integer> linkedListOrdered = new LinkedListOrdered<Integer>();
		
		System.out.println("\nOrdered Linked list");
		linkedListOrdered.addOrdered(56);
		linkedListOrdered.addOrdered(30);
		linkedListOrdered.addOrdered(40);
		linkedListOrdered.addOrdered(70);
		linkedListOrdered.display();
	}

}
