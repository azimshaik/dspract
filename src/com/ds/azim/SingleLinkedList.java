package com.ds.azim;

public class SingleLinkedList {
	public Node head = null;
	public Node tail = null;
	public int length = 0;
	public void insertAtFirst(int data){
		head = new Node(data,head);
	}
	public void insertAtEnd(int data){
		if (head==null){
			insertAtFirst(data);
		}else{
			Node curr = head;
			while(curr.next!=null){
				curr = curr.next;
			}
			curr.next = new Node(data);
		}
	}
	public void show(){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data+"\t");
			curr = curr.next;
		}
	}
	public static void main(String[] args){
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtFirst(454);
		sll.insertAtFirst(45656);
		sll.insertAtFirst(4);
		sll.insertAtFirst(56);
		sll.insertAtEnd(89);
		sll.show();
	}
}
