import java.util.*;
public class Stack{
        int arr[];
        int top;
        int capacity; 
    Stack(int size)
    {
        arr=new int[size];
        capacity=size;
        top=-1;
    }
     public static void main(String []args){
       Stack stack=new Stack(3);
       stack.push(1);
       stack.push(2);
       stack.pop();
       stack.pop();
       stack.push(3);
       System.out.println(stack.peek());
       stack.pop();
    
       }
       public void push(int x)
       {
           if(top==capacity-1)
           {
               System.out.printf("overflow");
               System.exit(1);
           }
           arr[++top]=x;
       }
       public int pop()
       {
           if(top==-1)
           {
               System.out.printf("underflow");
                System.exit(1);
           }
           return arr[top--];
       }
       public int peek()
       {
           if(top!=-1)
           {
               return arr[top];
           }
           else
           {
               return -1;
           }
       }
}