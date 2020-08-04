import java.util.*;
public class LinkedList
{
    Node head;
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list.insert(list,5);
        list.insert(list,6);
        list.insert(list,2);
        list.insert(list,8);
        list.insert(list,3);
         list.head.next.next.next = list.head; 
        list.detectloop();
    }
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void insert(LinkedList list,int data)
    {
        Node new_node=new Node(data);
        new_node.next=list.head;
        list.head=new_node;
    }
    public void detectloop()
    {
        Node slow_p=head;
        Node fast_p=head;
        int flag=0;
        while(slow_p!=null && fast_p!=null && fast_p.next!=null)
        {
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if(slow_p==fast_p)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.printf("loop detected");
        }
        else
        {
            System.out.printf("loop does not exist");
        }
    }
}