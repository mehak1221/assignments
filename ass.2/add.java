import java.util.Scanner;
class Add
{
public static void main(String args[])
{
int a,b,c;
System.out.println("enter two numbers to add");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.printf("Sum is:"+c);
}
}