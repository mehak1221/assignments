import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
int num;
int count=0;
double sum=0;
int n;
int rem;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
num=n;
while(num!=0)
{
num=num/10;
++count;
}
num=n;
while(n!=0)
{
rem=n%10;
sum+=Math.pow(rem,count);
n=n/10;
}
if(sum==num)
{
System.out.println("no.is armstrong");
}
else
{
System.out.println("no.is not armstrong");
}
}
}

