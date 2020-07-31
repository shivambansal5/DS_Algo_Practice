import java.util.*;
public class LinkedList
{
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        print(list);
	}
	Node head=null;
	Node tail=null;
	static class Node{
	    int data;
	    Node next;
	    Node(int d)
	    {
	        data=d;
	        next=null;
	    }
	}
	public static LinkedList insert(LinkedList list,int data)
	{
	    Node new_node=new Node(data);
	       if(list.head==null)
	       {
	            list.head=new_node;
	            list.tail=new_node;
	            new_node.next=list.head;
	       }
	       else
	       {
	         
	          new_node.next=list.head;
	          list.head=new_node;
	          list.tail.next=list.head;
	       }
	       return list;
	}
	public static void print(LinkedList list)
	{
	    Node curnode=list.head;
	 do
	 {
	     System.out.printf("%d ",curnode.data);
	     curnode=curnode.next;
	 }
	    while(curnode!=list.head);
	}
	   
	}


