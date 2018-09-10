import java.util.Scanner;
class Substring
{
public static void main(String args[])
{
String str;
int z=1;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
int y=str.length();
for(int i=0;i<=y-1;i++)
{
System.out.println(str.substring(i,i+z));
if(i+z!=y)continue;
if(z==y)break;
z++;
i=-1;
}
}
}