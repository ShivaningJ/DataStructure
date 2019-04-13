package com.singly;

public class ALinkedList 
{
Node head;

public void insert(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null)
	{
		head=node;
	}
	else{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
		
	}
}
public void show()
{
	Node node=head;
	while(node.next!=null){
		System.out.println(node.data);
		node=node.next;}
		System.out.println(node.data);
		
	}

	public static void main(String[] args)
	{
		ALinkedList l=new ALinkedList();
		l.insert(5);
		l.insert(25);
		l.insert(50);
		l.insert(18);
		l.show();
}
	}