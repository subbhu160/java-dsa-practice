package com.subh.linkedlist;


 class Node
{
	 int data;
	 Node next;;
	 
	 
	  Node(int data)
	 {
		 this.data= data;
		 this.next=null;
	 }
	 
	 
	 
}	 
public class LinkedListP1 {
	  
	Node head = null;
	
	public void addData(int data)
	{
		
		
		if(head==null)
		{
			System.err.println("jheehji");
			head = new Node(data);
		}
		
		
		else 
		{
			
		Node temp;
		temp = new Node(data);
		temp.next = head;
		head =temp;
		}
	}
	
  public void getData()
  {
	  Node temp =head;
	  while(temp!=null) 
		  {
		  System.out.println(temp.data);
		   temp=temp.next;
		  }
//System.out.println("linked list is not created ");
  }
  
  
  public void addAtLast(int data)
  {
	  Node tail=head;
	  
	  while(tail.next!=null)tail=tail.next;
	  Node temp;
	  temp = new Node(data);
	  tail.next=temp;
  }

   public void addarrData(int arr[])
   {
	   Node temp=null;
	   if(head==null)
	   {
		   temp = new Node(arr[0]);
		   System.out.println("add");
		   head=temp;
	   }
	   
	   for(int i=1;i<arr.length;i++)
	   {
		  System.err.println(i);
			   temp = new Node(arr[i]);
			   temp.next=head;
			   head=temp;
		   
	   }
   }
   
   
   public void getArrData()
   {
//	   Node tail=head;
//	   while(tail!=null)
//	   {
//		   System.out.println(tail.data);
//		   tail=tail.next;
//		  
//	   }
	   Node temp =head;
		  while(temp!=null) 
			  {
			  System.out.println(temp.data);
			   temp=temp.next;
			  }
	  
   }
	public static void main(String[] args) {
		
		LinkedListP1 l = new LinkedListP1();
//		l.addData(9);
//		l.addData(10);
//		l.addAtLast(8);
//		l.getData();
//		System.out.println("print all data ");
//		l.addAtLast(7);
//		l.addData(11);
//		l.getData();
//		add data at last position 8 9 10 o/p ->  10,9,8 
		
		int arr []= {2,6,-1,45,26};
		l.addarrData(arr);
		
		l.getArrData();
		
		

	}

}
