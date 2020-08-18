import java.util.*;
class Queue
{
     static int rear,front,capacity;
     static int queue[];
    Queue(int c)
    {
        front=0;
        rear=0;
        capacity=c;
        queue=new int[capacity];
    }
    static void enqueue(int data)
    {
        if(rear==capacity)
        {
            System.out.printf("queue is overflow\n");
            return;
        }
        else
        {
        
            queue[rear]=data;
            rear++;
        }
        return;
    }
   static void dequeue()
    {
       if(front==rear)
       {
           System.out.printf("queue is empty\n");
           return;
       }
       else
       {
           for(int i=0;i<rear-1;i++)
           {
               queue[i]=queue[i+1];
           }
           if(rear<capacity)
           {
               queue[rear]=0;
               rear--;
           }
           return;
       }
   
    }
    static void display()
    {
        if(rear==front)
        {
            System.out.printf("queue is empty\n");
            return;
        }
        for(int i=front;i<rear;i++)
        {
            System.out.printf("%d   ",queue[i]);
        }
        return;
    }
}
public class QUEUE
{
    public static void main(String[] args)
    {
        Queue q=new Queue(10);
         q.display(); 
  
        // inserting elements in the queue 
        q.enqueue(20); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
  
        // print Queue elements 
        q.display(); 
  
        // insert element in the queue 
        q.enqueue(60); 
        System.out.printf("\nafter inserting 60\n");
        // print Queue elements 
        q.display(); 
  
        q.dequeue(); 
        q.dequeue(); 
        System.out.printf("\n\nafter two node deletion\n\n"); 
  
        // print Queue elements 
        q.display(); 
        
    }
}