//logic for insertion sort
for(int i=1;i<n;i++)
{
  int m=i;
  while(m>0 && a[m-1]>a[m])
{
  //swapping
    temp=a[m-1];
    a[m-1]=a[m];
    a[m]=temp;
    m--;
}
}
