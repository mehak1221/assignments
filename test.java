class Test
{
int x;
static int y;
public void show()
{
int z=10;
System.out.println(x);
System.out.println(y);
}
public static void main(String args[])
{
Test t=new Test();
Test t1=new Test();
t.y=10;
System.out.println(t.y);
System.out.println(t1.y);
}
}
