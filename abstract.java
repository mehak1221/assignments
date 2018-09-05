import java,util.*;
abstract class Animals{
String breed;
String colour;
String name;
void speak()
{
System.out.println("animal sound");
}
abstract void eat();
}
public class abstract2 extends Animals
{
 void eat()
{
System.out.println("animal eats");
}
 void get()
{
Scanner sc=new Scanner(System.in);
name=sc.next();
breed=sc.next();
color=sc.next();
}
void display()
{
system.out.println("name of animal :"+name+"\nbreed of animal :"+breed+"\ncolor of animl :"+color);
}
public static void main(String args[])
{
abstract2 obj=new abstract2();
obj.get();
obj.eat();
dog display();
obj1.speak();
obj1.eat();
}
}