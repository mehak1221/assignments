import java.util.Scanner;
class Prime1
{
public static void main(String args[])
{
int num,i,j;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(j=1;j<=num;j++)
{
int flag=0;
for(i=2;i<=j/2;i++)
{
if(j % i == 0)
{
flag=1;
break;
}
}
if(flag==0&&j!=1)
{
System.out.println(j+"\n");
}
}
}
}