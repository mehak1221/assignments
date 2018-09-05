import java.util.Scanner;
public final class typecast3
{
public static void main(String args[])
{

string a,b;
int c,d;
Scanner sc=new Scanner(System.in);
a=sc.next();
b=sc.next();
c=Integer.parseInt(a);
d=Integer.parseInt(b);
if(c>d)
{
System.out.println("biggest no :"+c);
}
else
{
System.out.println("biggest no :"+d);
}
}
}
