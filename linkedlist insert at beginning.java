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
	Node head;
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
	  //  if(list.head==null)
	  //  {
	  //      list.head=new_node;
	  //  }
	 //   else
	 //   {
	       
	         new_node.next=list.head;
	        list.head=new_node;
	       
	 //   }
	    return list;
	}
	public static void print(LinkedList list)
	{
	    Node curnode=list.head;
	    System.out.printf("LikedList is:");
	    while(curnode!=null)
	    {
	        System.out.printf("%d  ",curnode.data);
	        curnode=curnode.next;
	    }
	}
}
