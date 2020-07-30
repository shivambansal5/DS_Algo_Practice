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
	    Node prev;
	    Node(int d)
	    {
	        data=d;
	        next=null;
	        prev=null;
	    }
	}
	public static LinkedList insert(LinkedList list,int data)
	{
	    Node new_node=new Node(data);
	    if(list.head==null)
	    {
	        new_node.prev=null;
	        list.head=new_node;
	        }
	    else
	    {
	        Node temp=list.head;
	        while(temp.next!=null)
	        {
	            temp=temp.next;
	        }
	        new_node.prev=temp;
	        temp.next=new_node;
	    }
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

