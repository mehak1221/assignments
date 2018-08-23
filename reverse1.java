import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
int rem;
int rev=0;
int n;
System.out.println("enter number to reverse");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println(rev);
}
}

