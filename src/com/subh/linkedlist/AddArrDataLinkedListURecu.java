package com.subh.linkedlist;

import java.util.Arrays;
import java.util.Deque;

public class AddArrDataLinkedListURecu {

	Node head = null;
		
		 Node createLinkedList(int arr[], int index,int size )
		{
			if(size==index) return null;
			
			Node temp;
			temp = new Node(arr[index]);
			
			createLinkedList(arr, index+1, size);
			return temp;
		}
	
	void getData()
	{
		Node temp=null;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public  void adddata(int arr[])
	{
		
		if(head==null)
		{
			head = new Node(arr[0]);
			
		}
		Node temp =head;
		for(int i=1;i<arr.length;i++)
		{
			while(temp.next!=null)
			{
				temp=new Node(arr[i]);
			}
			temp.next = new Node(arr[i]);
			temp=temp.next;
			
		}
	}
	
	public void getLinkedListData()
	{
		Node tail=head;
		while(tail!=null)
		{
			System.out.println(tail.data);
			tail=tail.next;
		}
		
		
		if(head!=null)
		{
			Node temp = head;
			head=head.next;
			 temp.next=null;
		}
	}
	
	
	public void delLinkedListData()
	{
		
		
		if(head!=null)
		{
			Node temp = head;
			head=head.next;
			 temp.next=null;
		}
	}
	
	public void deleteLastNode()
	{
		Node curr=head;
		Node prev=null;
		
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
			
		}
		
		prev.next=curr.next;
		curr=null;
	}
	
	public void deleteParticularNode(int x)
	{
		Node curr= head;
		Node prev=null;
		x--;
		while(x!=0)
		{
			x--;
			prev=curr;
			curr=curr.next;
		}
		
		prev.next=curr.next;
		curr=null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddArrDataLinkedListURecu  add = new AddArrDataLinkedListURecu();
		
		int arr[] = {2,4,6,8,10};
		
		add.createLinkedList(arr,0,arr.length);
		add.getData();
		add.adddata(arr);
		System.out.println(Arrays.toString(arr));
//		add.delLinkedListData();
//		add.getLinkedListData();
//		System.err.println("second operation");
//		add.deleteLastNode();
//		add.getLinkedListData();
		add.deleteParticularNode(2);
		add.getLinkedListData();
	}

}
