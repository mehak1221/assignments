class A
{
void show()
{
System.out.println("class A");
}
}
class B extends A
{
void show()
{
System.out.println("class B");
}
}
class ntextend
{
public static void main(String args[])
{
B obj=new B();
obj.show();
}
}