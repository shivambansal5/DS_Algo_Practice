//sorting an array without bubble sort
import java.util.*;
public class hi{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
         for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
