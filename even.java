import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int num,i;
System.out.printf("enter number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(i=1;i<=num;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}