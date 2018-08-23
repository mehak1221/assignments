import java.util.Scanner;
class Search
{
public static void main(String args[])
{
int a[]={1,4,6,7,8,9,10};
int flag=0;
int n,i,p;
System.out.println("enter no");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<7;i++)
{
if(n==a[i])
{
flag=1;
p=i;
break;
}
}
if(flag==1)
{
System.out.println(n+"is at"+i);
}
else
{
System.out.println("not found");
}
}
}
