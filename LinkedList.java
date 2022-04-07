package com.bridgelabz.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	int size;
	
	public LinkedList() {
		this.size=0;
		this.head=this.tail=null;
	}
	
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
	public void inserAtFirst(int key) {
		Node node=new Node();
		node.setKey(key);
		node.setNext(head);
		head=node;
		size++;
		
	}
	
	public void insertAtLast(int key) {
		Node node=new Node();
		node.setKey(key);
		node.setNext(null);
		Node initial=head;
		if(head==null) {
			head=node;
		}else {
			while(initial.getNext()!=null) {
				initial=initial.getNext();
			}
			initial.setNext(node);
			tail=node;
		}
		size++;
	}
	
	
	public void insertAtParticularPosition(int key,int index) {
		if(index==1) {
			inserAtFirst(key);
		}else if(index==size+1 && index<size) {
			insertAtLast(key);
		}else {
			Node node=new Node();
			node.setKey(key);
			Node initial=head;
			for(int i=1;i<index;i++) {
				initial=initial.getNext();
			}
				node.setNext(initial.getNext());
				initial.setNext(node);
				size++;
			
			
		}
	
	}
	
	
	public void display() {
		Node node=head;
		if(isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			for(int i=0;i<size;i++) {
				System.out.print(node.getKey()+"-->");
				node=node.getNext();
			}
			System.out.println();
		}
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("empty");
		}else {
			head=head.getNext();
			size--;
		}
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("empty");
		}else if(size==1) {
			head=null;
			size--;
		}else {
			Node initial=head;
			for(int i=1;i<size-1;i++) {
				initial=initial.getNext();
			}
			initial.setNext(null);
			size--;
		}
	}
	
	public void search(int value) {
		Node intial=head;
		
		if(head==null) {
			System.out.println("list is empty");
		}else {
			while(head.getNext()!=null) {
				if(head.getKey()==value) {
					System.out.println(value +"is present in linked list");
					break;
				}
				head=head.getNext();
			}
			
		}
	}
	
	

}
