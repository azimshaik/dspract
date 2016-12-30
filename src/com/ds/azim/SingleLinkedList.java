package com.ds.azim;

public class SingleLinkedList {
	public Node head = null;
	public Node tail = null;
	public SingleLinkedList(){
		
	}
	public void insertAtFirst(int data){
		head = new Node(data,head);
	}
	public void insertAtEnd(int data){
		if(head==null){
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
			System.out.print(curr.data+",");
			curr = curr.next;
		}
	}
	public static void main(String[] args){
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtFirst(1223);
		sll.insertAtFirst(456);
		sll.insertAtFirst(-89);
//		sll.show();
		sll.insertAtEnd(46);
		sll.insertAtEnd(34);
		sll.show();
	}
}
