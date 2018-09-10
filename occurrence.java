import java.util.Scanner;
class Occurrence
{
public static void main(String args[])
{
int c=0;
String str1,str2;
Scanner sc=new Scanner(System.in);
str1=sc.nextLine();
str2=sc.nextLine();
int x=str1.length();
int y=str2.length();
for(int i=0;i<x;i++)
{
if(i+y<=x && str1.substring(i,i+y).compareTo(str2)==0)
c++;
}
if(c==0)
{
System.out.println("str2 nt occurred in str1");
}
else
{
System.out.println("str2 occurred in str1");
}
}
}