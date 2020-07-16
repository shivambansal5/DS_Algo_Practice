import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
    Scanner myobj=new Scanner(System.in);
    int n=myobj.nextInt();
    int ele=myobj.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=myobj.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==ele)
        {
            System.out.printf("%d",i);
            break;
        }
    }
    }
}    
