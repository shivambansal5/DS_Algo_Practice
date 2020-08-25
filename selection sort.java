//logic for selection sort
for(int i=0;i<n-1;i++)
{
  int min=i;
  for(j=i+1;j<n;j++)
{
  if(a[j]<a[min])
{
  min=j;
}
  //swapping
   temp=a[i];
   a[i]=a[min];
   a[min]=temp;
}
}