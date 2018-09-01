class A
{
void fun()
{
System.out.println(" parent class");
}
}
class B extends A
{
void fun()
{
System.out.println(" child class");
}
void fun1()
{
System.out.println("calling parent class");
}
void display()
{
fun();
super.fun();
}
}
class Parent
{
public static void main(String args[])
{
B n=new B();
n.display();
}
}
