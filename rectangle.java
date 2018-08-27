import java.util.Scanner;
class Rectangle
{
int length;
int breadth;
public void Calculate(int length,int breadth)
{
int area;
area=length*breadth;
System.out.println("area is "+area);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Rectangle r1=new Rectangle();
System.out.println("enter length:");
int l=sc.nextInt();
System.out.println("enter breadth:");
int b=sc.nextInt();
r1.Calculate(l,b);
}
}