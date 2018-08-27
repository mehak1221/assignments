class Parent
{
int x=25;
public void show()
{
System.out.println(x);
}
}
class Child
{
int x=10;
public void showx()
{
super.showx();
System.out.println(x);
}
public static void main(String args[])
{
Child ch=new Child();
ch.show();
}
}