import java.util.Scanner;
class Sorting
{
public static void main(String args[])
{
int a[]={1,1,1,1,0,0,1,0};
int temp,i,j;
System.out.printf("before sorting");
for(i=0;i<8;i++)
{
System.out.println(a[i]);
}
for(i=0;i<8;i++)
{
for(j=i+1;j<8;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.printf("after sorting");
for(i=0;i<8;i++)
{
System.out.println(a[i]);
}
}
}
