package com.doubly;

public class Runner 
{
	private Node head;
	private int size;
	public Runner(){
		head=null;
		size=0;
	}
	public void addFront(int data){
		if (head==null)
			head=new Node(null, data, null);
			else{
				Node n=new Node(null, data, head);
				head.previous=n;
				head=n;
		}
		size++;
	
	}
	
	public void addrear(int data){
		if (head==null)
			head=new Node(null, data, null);
			else{
				Node current=head;
				while(current.next!=null){
					current=current.next;
				}
				Node h=new Node(current, data, null);
				current.next=h;
		}
		size++;
	}
	
	public void removeFront(){
		if (head==null)return;
		head=head.next;
		head.previous=null;
		size--;
	}
	public void removerear(){
		if (head==null)return;
		
		if(head.next==null){
			head=null;
			size--;
			return;
	}
		Node current=head;
		while(current.next.next!=null){
			current=current.next;
		}
	current.next=null;
	size--;
	}
	public int size(){
		return size;
	}
	public void print(){
		Node current=head;
		while(current!=null){
		System.out.println(current.Data());
		current=current.next;
		}
	}
	
public boolean isEmpty()
{
	return head==null;
}
	public static void main(String[] args) {
		Runner r=new Runner();
		r.addFront(5);
		r.addFront(20);
		r.print();
		System.out.println("..............");
		r.addrear(10);
		r.print();
		//System.out.println("..............");
		//r.removeFront();
		//r.print();
		System.out.println("..............");
		r.removerear();
		//r.removerear();
		r.print();
	
	}

}
