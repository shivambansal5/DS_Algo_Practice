import java.util.*;
public class duplicates
{
    public static void main(String[] args)
    {
  Scanner myobj=new Scanner(System.in);
  int n=myobj.nextInt();
  int a[]=new int[n];
  for(int i=0;i<a.length;i++)
  {
      a[i]=myobj.nextInt();
  }
  for(int i=0;i<a.length;i++)
  {
      if(a[Math.abs(a[i])]>=0)
      {
        a[Math.abs(a[i])]=-a[Math.abs(a[i])];
      }
      else{
          System.out.printf("%d ",Math.abs(a[i]));
      }
  }
  myobj.close();
}
}