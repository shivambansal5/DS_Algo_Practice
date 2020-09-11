public class MaxHeap
{
    private int size;
    private int maxsize;
    private int heap[];
   public MaxHeap(int maxsize)
   {
       this.maxsize=maxsize;
       this.size=0;
       heap=new int[this.maxsize+1];
       heap[0]=Integer.MAX_VALUE;
   }
   public static void main(String[] args)
   {
       System.out.println("The Max Heap is "); 
        MaxHeap maxHeap = new MaxHeap(15); 
        maxHeap.insert(5); 
        maxHeap.insert(3); 
        maxHeap.insert(17); 
        maxHeap.insert(10); 
        maxHeap.insert(84); 
        maxHeap.insert(19); 
        maxHeap.insert(6); 
        maxHeap.insert(22); 
        maxHeap.insert(9); 
  
        maxHeap.print(); 
   }
   public void insert(int ele)
   {
       heap[++size]=ele;
       int current=size;
       while(heap[current]>heap[parent(current)])
       {
           swap(current,parent(current));
           current=parent(current);
       }
   }
   public int parent(int pos)
   {
       return pos/2;
   }
   public void swap(int c,int p)
   {
       int temp;
       temp=heap[c];
       heap[c]=heap[p];
       heap[p]=temp;
   }
   public void print()
   {
       for(int i=1;i<=size/2;i++)
       {
           System.out.printf("parent is %d  ",heap[i]);
           System.out.printf("left child is %d  ",heap[2*i]);
           System.out.printf("right child is %d  \n",heap[2*i+1]);
       }
           
   }
   
}