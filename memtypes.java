class MemberType
{
static String Inst;
String myName;
public static void main(String args[])
{
Inst="Chitkara";
MemberType mt=new MemberType();
mt.myName="Mehak";
System.out.println("College "+ Inst);

System.out.println("My Name "+ mt.myName);
}
}