import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
int num;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
boolean flag=false;
for(int i=2;i<=num/2;i++)
{
if(num % i == 0)
{
flag=true;
break;
System.out.println("no.is prime");
}
else
{
System.out.println("no.is not prime");
}
}
}