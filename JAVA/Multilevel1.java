class Multilevel2{
void m(){
}
}
class A extends Multilevel2{
void display(){
System.out.println("a child of multi");
}
}
class B extends A{
	void display1(){
System.out.println("B is child of A");
}
}
class Multilevel1
{
public static void main(String[] args)
{
	B obj=new B();
	obj.display();
	obj.display1();
}
}
