import java.util.Scanner;
class Largest
{
public static void main(String args[])
{
int a,b,c,gt;
System.out.println("enter three numbers to find largest");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
gt=((a>b)?(a>c?a:c):(b>c?b:c));
System.out.printf("largest is:"+gt);
}
}