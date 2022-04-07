package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedlist=new LinkedList();
		linkedlist.inserAtFirst(12);
		linkedlist.inserAtFirst(94);
		linkedlist.inserAtFirst(8);
		linkedlist.inserAtFirst(64);
		linkedlist.insertAtParticularPosition(45, 3);
		linkedlist.insertAtLast(65);
//		linkedlist.deleteFirst();
//		linkedlist.deleteLast();
		linkedlist.display();
		linkedlist.search(45);
		
		
	}

}
