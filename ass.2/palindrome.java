import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int n,rem=0,rev=0,a;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
a=n;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(a==rev)
{
System.out.printf("no.is palindrome");
}
else
{
System.out.printf("no.is not palindrome");
}
}
}