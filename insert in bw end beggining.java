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
        list=insertinbw(list,10,5);
        list=insertinbw(list,40,3);
        list=insertinbw(list,50,0);
        list=insertinbw(list,70,15);
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
	         new_node.next=list.head;
	        list.head=new_node;
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
	public static LinkedList insertinbw(LinkedList list,int data,int pos)
	{
	    if(pos==0 || list.head==null)
	    {
	        return insert(list,data);
	    }
	   
	    Node new_node=new Node(data);
	    Node temp=list.head;
	    while(temp.next!=null && pos>1)
	    {
	        temp=temp.next;
	        pos--;
	    }
	    new_node.next=temp.next;
	    temp.next=new_node;
	    return list;
	}
}
